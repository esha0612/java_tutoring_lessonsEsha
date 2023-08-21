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
    }

    // count increasing columns method (to be completed)
    public int countIncreasingColumns() {
        // count the number of columns in the grid that contain increasing numbers
        // any column where the numbers are strictly increasing from top to bottom (aka with increasing row index) should be counted
        // columns with no numbers should not be counted
        // singleton columns (with only one number) should be counted
        // your code here
        return 0;
    }
}
