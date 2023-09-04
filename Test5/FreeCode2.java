// Hint: Look into threads for this one

class TrafficLight {
    // 0 = red, 1 = yellow, 2 = green
    // The status variable tracks the current status of the traffic light and alternates between one of the 3 states above in order
    private int status;

    // The total_time variable tracks the total time the traffic light has been running for
    private int total_time;

    // Write a method which cycles through the 3 states of the traffic light every 3 seconds
    // The method should print out the current status of the traffic light every time it changes
    // The method should run in a loop until the program is terminated
    // The method should also increment the total_time variable by 3 every time it runs
    // The method should also print out the total_time variable every time it runs
    public void cycle() {
        // your code here
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
    }
}

public class FreeCode2 {
    public static void main (String[] args) {
        TrafficLight t1 = new TrafficLight();
        t1.cycle();
    }
}
