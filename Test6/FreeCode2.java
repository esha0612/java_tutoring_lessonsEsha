public class FreeCode2 {
    // This class has two variables, height (in inches) and weight (in pounds).
    // It has a default constructor that sets both variables to 0.
    // It also has a parameterized constructor that takes two arguments and sets the variables accordingly.

    private int height;
    private int weight;

    public FreeCode2() {
        this.height = 0;
        this.weight = 0;
    }

    public FreeCode2(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    // Write a method that returns the BMI of the person represented by this object.
    // The formula for BMI is weight / (height * height) * 703 using US units.
    // The method should return -1 if the height or weight is 0.
    public double getBMI() {
        // TODO: Write your code here
        return 0;
    }

    // Write a method that returns the BMI category of the person represented by this object.
    // The method should return "Underweight" if the BMI is less than 18.5.
    // The method should return "Normal weight" if the BMI is between 18.5 and 24.9.
    // The method should return "Overweight" if the BMI is between 25 and 29.9.
    // The method should return "Obesity" if the BMI is 30 or greater.
    // The method should return "Invalid" if the height or weight is 0.
    public String getBMICategory() {
        // TODO: Write your code here
        return "";
    }

    // Main method for testing your code.
    public static void main (String[] args) {
        FreeCode2 p1 = new FreeCode2();
        FreeCode2 p2 = new FreeCode2(72, 200);
        FreeCode2 p3 = new FreeCode2(60, 100);
        FreeCode2 p4 = new FreeCode2(60, 0);
        FreeCode2 p5 = new FreeCode2(0, 100);
        FreeCode2 p6 = new FreeCode2(0, 0);

        System.out.println(p1.getBMI()); // Should print -1
        System.out.println(p2.getBMI()); // Should print 27.121913580246915
        System.out.println(p3.getBMI()); // Should print 19.531249999999996
        System.out.println(p4.getBMI()); // Should print -1
        System.out.println(p5.getBMI()); // Should print -1
        System.out.println(p6.getBMI()); // Should print -1

        System.out.println(p1.getBMICategory()); // Should print "Invalid"
        System.out.println(p2.getBMICategory()); // Should print "Overweight"
        System.out.println(p3.getBMICategory()); // Should print "Normal weight"
        System.out.println(p4.getBMICategory()); // Should print "Invalid"
        System.out.println(p5.getBMICategory()); // Should print "Invalid"
        System.out.println(p6.getBMICategory()); // Should print "Invalid"
    }
}
