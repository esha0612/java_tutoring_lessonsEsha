import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.Console;

import javax.swing.JFrame;
import javax.swing.JPanel;

class Colorx {
	//Add your instance variables here
    private int red, green, blue, hue, saturation, brightness;
	
	public Colorx(int type, int a, int b, int c) {
		if (type == 1) {
            red = a;
            green = b;
            blue = c;
        }
        else if (type == 2) {
            hue = a;
            saturation = b;
            brightness = c;
        }
        else {
            System.out.println("Invalid type");
        }
	}

	public void setRGB(int r, int g, int b) {
		red = r;
        green = g;
        blue = b;
	}

	public void setHSV(int h, int s, int b) {
        hue = h;
        saturation = s;
        brightness = b;
	}

	public void setRed(int r) {
        red = r;
	}

	public void setGreen(int g) {
	    green = g;
    }

	public void setBlue(int b) {
        blue = b;
	}

	public void setHue(int h) {
        hue = h;
	}

	public void setSaturation(int s) {
        saturation = s;
	}

	public void setBrightness(int b) {
        brightness = b;
	}

	public int getRed() {
        return red;
	}

	public int getBlue() {
        return blue;
	}

	public int getGreen() {
        return green;
	}

	public int getHue() {
        return hue;
    }

	public int getSaturation() {
        return saturation;
	}

	public int getBrightness() {
        return brightness;
	}

	public int[] getRGB() {
        return new int[] {red, green, blue};
	}

	public int[] getHSV() {
        return new int[] {hue, saturation, brightness};
    }
	
	private double getMaximum(double one, double two, double three) {
        return (one > two && one > three) ? one : (two > three && two > one) ? two : three;
	}
	private double getMinimum(double one, double two, double three) {
        return (one < two && one < three) ? one : (two < three && two < one) ? two : three;
	}
	private void calculateHue(double r, double g, double b, double max, double min) {
        if (max == min) {
            hue = 0;
        }
        if (max == r) {
            hue = (int) (60 * (((g - b) / (max - min)) % 6));
        }
        if (max == g) {
            hue = (int) (60 * ((b - r) / (max - min)) + 2);
        }
        if (max == b) {
            hue = (int) (60 * ((r - g) / (max - min)) + 4);
        }
    }

	private void calculateSaturation(double r, double g, double b, double max, double min) {
        if (max == 0) {
            saturation = 0;
        }
        else {
            saturation = (int) ((max - min) / max);
        }
    }
	
	public Colorx RGBtoHSV() {
        double r = red / 255.0;
        double g = green / 255.0;
        double b = blue / 255.0;
        double max = getMaximum(r, g, b);
        double min = getMinimum(r, g, b);
        calculateHue(r, g, b, max, min);
        calculateSaturation(r, g, b, max, min);
        brightness = (int) max;
        return new Colorx(2, hue, saturation, brightness);
	}
	public Colorx HSVtoRGB() {
        double c = brightness * saturation;
        double x = c * (1 - Math.abs((hue / 60) % 2 - 1));
        double m = brightness - c;
        double r = 0, g = 0, b = 0;
        if (hue >= 0 && hue < 60) {
            r = c;
            g = x;
            b = 0;
        }
        else if (hue >= 60 && hue < 120) {
            r = x;
            g = c;
            b = 0;
        }
        else if (hue >= 120 && hue < 180) {
            r = 0;
            g = c;
            b = x;
        }
        else if (hue >= 180 && hue < 240) {
            r = 0;
            g = x;
            b = c;
        }
        else if (hue >= 240 && hue < 300) {
            r = x;
            g = 0;
            b = c;
        }
        else if (hue >= 300 && hue < 360) {
            r = c;
            g = 0;
            b = x;
        }
        red = (int) ((r + m) * 255);
        green = (int) ((g + m) * 255);
        blue = (int) ((b + m) * 255);
        return new Colorx(1, red, green, blue);
	}
	public void printColor()
	{
		char c = 176;
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (" , red , ", " , green , ", " , blue , ")");
		System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (" , hue , (""+ c+", ")  , saturation , "%, " , brightness , "%)");
	}
}

class ColorConverter {
	//Add instance variables here
	protected Colorx[][] myColors;

	public ColorConverter(int rows, int cols, int type, int[] first, int[] second, int[] third)
	{
        myColors = new Colorx[rows][cols];
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                myColors[i][j] = new Colorx(type, first[count], second[count], third[count++]);
            }
        }
    }

	
	public Colorx[][] RGBtoHSV() {
        for (int i = 0; i < myColors.length; i++) {
            for (int j = 0; j < myColors[i].length; j++) {
                myColors[i][j] = myColors[i][j].RGBtoHSV();
            }
        }
        return myColors;
	}
	public Colorx[][] HSVtoRGB() {
		for (int i = 0; i < myColors.length; i++) {
            for (int j = 0; j < myColors[i].length; j++) {
                myColors[i][j] = myColors[i][j].HSVtoRGB();
            }
        }
        return myColors;
    }

	public void print() {
        for (int i = 0; i < myColors.length; i++) {
            for (int j = 0; j < myColors[i].length; j++) {
                myColors[i][j].printColor();
                System.out.println();
            }
        }
    }
}

class Rectangles extends JPanel {

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g;

    g2d.setColor(new Color(212, 212, 212));
    g2d.drawRect(10, 15, 90, 60);


    g2d.setColor(new Color(31, 21, 1));
    g2d.fillRect(250, 195, 90, 60);

  }
}


public class ColorConverterDriver {

	public static void main(String[] args) {
        int[] first = {0, 255, 255, 0, 0, 255, 0, 255, 192, 128, 128, 128, 0, 128, 0, 0};
        int[] second = {0, 255, 0, 255, 0, 255, 255, 0, 192, 128, 0, 128, 128, 0, 129, 0};
        int[] third = {0, 255, 0, 0, 255, 0, 255, 255, 192, 128, 0, 0, 0, 128, 128, 128};
        ColorConverter cc = new ColorConverter(3, 3, 1, first, second, third);
        cc.print();
        cc.RGBtoHSV();
        cc.print();
        cc.HSVtoRGB();
        cc.print();


        // Randomly generate a 3x3 array of RGB colors
        first = new int[9];
        second = new int[9];
        third = new int[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                first[i * 3 + j] = (int) (Math.random() * 256);
                second[i * 3 + j] = (int) (Math.random() * 256);
                third[i * 3 + j] = (int) (Math.random() * 256);
            }
        }

        // Create a ColorConverter object with the 3x3 array of RGB colors
        ColorConverter cc1 = new ColorConverter(3, 3, 1, first, second, third);
        cc1.print();
        
        // Convert the RGB colors to HSV
        cc1.RGBtoHSV();
        cc1.print();


        // Give user a menu to convert from RGB to HSV or HSV to RGB
        // and print the result
        // If HSV to RGB, use the Rectangles class to display the colors in a matrix in a window
        while (true) {
            System.out.println("1. RGB to HSV");
            System.out.println("2. HSV to RGB");
            System.out.println("3. Exit");
            int choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    cc1.RGBtoHSV();
                    cc1.print();
                    break;
                case 2:
                    cc1.HSVtoRGB();
                    cc1.print();
                    JFrame frame = new JFrame("Rectangles");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                    for (int i = 0; i < cc1.myColors.length; i++) {
                        for (int j = 0; j < cc1.myColors[i].length; j++) {
                            Rectangles rects = new Rectangles();
                            rects.setBackground(new Color(cc1.myColors[i][j].getRed(), cc1.myColors[i][j].getGreen(), cc1.myColors[i][j].getBlue()));
                            frame.add(rects);
                        }
                    }

                    frame.setSize(360, 300);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}