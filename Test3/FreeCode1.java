public class FreeCode1 {
    // maximum dimension size of the grid
    public static final int MAX = 5;
    // the grid
    public static int[][] grid;

    // default constructor
    public FreeCode1() {
        // the grid has MAX columns
        // each column has a different, random number of rows (between 0 and MAX)
        grid = new int[MAX][];
        for (int i = 0; i < MAX; i++) {
            grid[i] = new int[(int) (Math.random() * MAX)];
        }
    }

    // print the grid
    public void printGrid() {
        for (int i = 0; i < MAX; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    // repopulate method (to be completed)
    public void repopulate() {
        // fill each member of the grid with a random number between 0 and 9
        // your code here
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    // count increasing columns method (to be completed)
    public int countIncreasingColumns() {
        // count the number of columns in the grid that contain increasing numbers
        // any column where the numbers are strictly increasing from top to bottom (aka with increasing row index) should be counted
        // columns with no numbers should not be counted
        // singleton columns (with only one number) should be counted
        // your code here
        int count = 0;
        for (int i = 0;  i < MAX; i++) {
            boolean increasing = true;
            // disqualify columns with no numbers
            if (grid[i].length == 0) {
                continue;
            }
            for (int j = 0; j < grid[i].length - 1; j++) {
                if (grid[i][j] >= grid[i][j + 1]) {
                    increasing = false;
                }
            }
            count += increasing ? 1 : 0;
        }
        return count;
    }

    // main method
    public static void main(String[] args) {
        // create a new FreeCode1 object
        FreeCode1 fc = new FreeCode1();
        // repopulate the grid
        fc.repopulate();
        // print the grid
        fc.printGrid();
        // print the number of increasing columns
        System.out.println("Number of increasing columns: " + fc.countIncreasingColumns());
    }
}
