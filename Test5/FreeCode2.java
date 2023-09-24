// Hint: Look into threads for this one

import java.util.Scanner;

class TrafficLight {
    // 0 = red, 1 = yellow, 2 = green
    // The status variable tracks the current status of the traffic light and alternates between one of the 3 states above in order
    private int status;

    // The total_time variable tracks the total time the traffic light has been running for
    private int total_time;

    // We will use a boolean variable to keep track of whether the program has been terminated
    private boolean terminated;

    // Write a method which cycles through the 3 states of the traffic light every 3 seconds
    // The method should print out the current status of the traffic light every time it changes
    // The method should run in a loop until the program is terminated
    // The method should also increment the total_time variable by 3 every time it runs
    // The method should also print out the total_time variable every time it runs
    public void cycle() {
        // your code here

        // We will use a while loop to solve this problem
        // We will use a switch statement to print out the current status of the traffic light
        // We will use a try-catch block to make the thread sleep for 3 seconds      

        while (!terminated) {
            switch (status) {
                case 0:
                    System.out.println("Red");
                    break;
                case 1:
                    System.out.println("Yellow");
                    break;
                case 2:
                    System.out.println("Green");
                    break;
            }

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }

            total_time += 3;
            System.out.println("Total time: " + total_time);

            status = (status + 1) % 3;
        }
    }

    // Just a getter method for the status variable
    public int getStatus() {
        return status;
    }

    // Just a setter method for the status variable
    public void setStatus(int status) {
        this.status = status;
    }

    // Just a constructor for the TrafficLight class
    public TrafficLight(int status) {
        this.status = status;
    }

    // Just a constructor for the TrafficLight class
    public TrafficLight() {
        this.status = 0;
    }

    // Just a toString method for the TrafficLight class
    public String toString() {
        return "TrafficLight: " + status;
    }

    // Write a method which expects an interrupt from the user
    // When the user presses enter, the method should print out the current status of the traffic light
    // The method should then wait for the user to press enter again
    // When the user presses Escape, the method should print out the total_time variable and terminate the program
    public void interrupt() {
        // your code here

        // We will use a while loop to solve this problem
        // We will use a try-catch block to make the thread sleep for 1 second
        // We will use a Scanner object to read input from the user

        Scanner sc = new Scanner(System.in);

        while (!terminated) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");

                if (sc.nextLine().equals("")) {
                    System.out.println("Current status: " + status);
                    System.out.println("Press enter to continue");
                    sc.nextLine();
                } else {
                    System.out.println("Total time: " + total_time);
                    terminated = true;
                }
            }
        }
    }
}

public class FreeCode2 {
    public static void main (String[] args) {
        TrafficLight t1 = new TrafficLight();
        t1.cycle();
    }
}
