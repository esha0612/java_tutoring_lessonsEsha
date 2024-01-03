import java.util.ArrayList;

public class Arrays2D {
    public static void main (String[] args) {
        // First, we do it with the default array format
        if (args.length != 1) {
            System.out.println("Usage: java Arrays2D <size>");
            System.exit(0);
        }
        
        // Take the size of the array as command line input
        int n = Integer.parseInt(args[0]);
        System.out.println("Size of the array: " + n + "\n");
        int[][] arr = new int[n][n];

        // Initialize the array with random values
        // We use the treaditional for loop here because we need the indices
        // If we assign it to a temporary variable, the changes will not be reflected in the array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }

        // Now, we iterate over the array and print it
        // Notice that we are using the enhanced for loop here
        // This is because we are not interested in the indices of the array
        // The usual way of i = 0; i < arr.length; i++ is used when we need the indices
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Now, we do it with the ArrayList format
        // We use the ArrayList class from the java.util package
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        // 1 -> Integer

        // 1 1 1 1 1 -> ArrayList<Integer>

        // 1 1 1 1 1
        // 1 1 1 1 1
        // 1 1 1 1 1
        // 1 1 1 1 1 -> ArrayList<ArrayList<Integer>>
        
        // Initialize the ArrayList with random values
        // We use the enhanced for loop here because we do not need the indices
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                row.add((int) (Math.random() * 100));
            }
            list.add(row);
        }

        // Now, we iterate over the ArrayList and print it
        // We can directly pretty print the ArrayList
        // This is because the ArrayList class has a toString() method that returns a string representation of the ArrayList
        // This is not the case with arrays, so we have to iterate over them and print them element by element
        System.out.println();
        System.out.println(list);


        // Matrix addition with traditional arrays
        // Define two matrices
        // For addition, the matrices must be of the same size
        // Prompt the user for the size of the matrices
        System.out.println();
        System.out.println("Enter the size of the matrices: ");
        int rows = Integer.parseInt(System.console().readLine());
        int cols = Integer.parseInt(System.console().readLine());
        int[][] mat1 = new int[rows][cols];
        int[][] mat2 = new int[rows][cols];

        // Initialize the matrices with random values
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat1[i][j] = (int) (Math.random() * 100);
                mat2[i][j] = (int) (Math.random() * 100);
            }
        }

        // Print the matrices
        System.out.println("\nMatrix 1: ");
        for (int[] row : mat1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix 2: ");
        for (int[] row : mat2) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Add the matrices
        int[][] sum = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Print the sum
        System.out.println("\nSum: ");
        for (int[] row : sum) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Matrix addition with ArrayLists
        // Define two matrices
        // For addition, the matrices must be of the same size
        // Prompt the user for the size of the matrices
        System.out.println();
        System.out.println("Enter the size of the matrices: ");
        rows = Integer.parseInt(System.console().readLine());
        cols = Integer.parseInt(System.console().readLine());
        ArrayList<ArrayList<Integer>> matrix1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> matrix2 = new ArrayList<ArrayList<Integer>>();

        // Initialize the matrices with random values
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row1 = new ArrayList<Integer>();
            ArrayList<Integer> row2 = new ArrayList<Integer>();
            for (int j = 0; j < cols; j++) {
                row1.add((int) (Math.random() * 100));
                row2.add((int) (Math.random() * 100));
            }
            matrix1.add(row1);
            matrix2.add(row2);
        }

        // Print the matrices
        System.out.println("\nMatrix 1: ");
        System.out.println(matrix1);

        System.out.println("\nMatrix 2: ");
        System.out.println(matrix2);

        // Add the matrices
        ArrayList<ArrayList<Integer>> sum2 = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < cols; j++) {
                row.add(matrix1.get(i).get(j) + matrix2.get(i).get(j));
            }
            sum2.add(row);
        }

        // Print the sum
        System.out.println("\nSum: ");
        System.out.println(sum2);


        // Matrix multiplication with traditional arrays
        // Define two matrices
        // For multiplication, the number of columns in the first matrix must be equal to the number of rows in the second matrix
        // Prompt the user for the size of the matrices
        System.out.println();
        System.out.println("Enter the size of the matrices: ");
        int rows1 = Integer.parseInt(System.console().readLine());
        int cols1 = Integer.parseInt(System.console().readLine());
        int rows2 = Integer.parseInt(System.console().readLine());
        int cols2 = Integer.parseInt(System.console().readLine());
        int[][] matmul1 = new int[rows1][cols1];
        int[][] matmul2 = new int[rows2][cols2];

        // Initialize the matrices with random values
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matmul1[i][j] = (int) (Math.random() * 100);
            }
        }

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matmul2[i][j] = (int) (Math.random() * 100);
            }
        }

        // Print the matrices
        System.out.println("\nMatrix 1: ");
        for (int[] row : matmul1) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println("\nMatrix 2: ");
        for (int[] row : matmul2) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Multiply the matrices
        if (cols1 != rows2) {
            System.out.println("The matrices cannot be multiplied!");
            System.exit(0);
        }

        int[][] product = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matmul1[i][k] * matmul2[k][j];
                }
            }
        }

        // Print the product
        System.out.println("\nProduct: ");
        for (int[] row : product) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Matrix multiplication with ArrayLists
        // Define two matrices
        // For multiplication, the number of columns in the first matrix must be equal to the number of rows in the second matrix
        // Prompt the user for the size of the matrices
        System.out.println();
        System.out.println("Enter the size of the matrices: ");
        rows1 = Integer.parseInt(System.console().readLine());
        cols1 = Integer.parseInt(System.console().readLine());
        rows2 = Integer.parseInt(System.console().readLine());
        cols2 = Integer.parseInt(System.console().readLine());
        ArrayList<ArrayList<Integer>> matmul3 = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> matmul4 = new ArrayList<ArrayList<Integer>>();

        // Initialize the matrices with random values
        for (int i = 0; i < rows1; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < cols1; j++) {
                row.add((int) (Math.random() * 100));
            }
            matmul3.add(row);
        }

        for (int i = 0; i < rows2; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < cols2; j++) {
                row.add((int) (Math.random() * 100));
            }
            matmul4.add(row);
        }

        // Print the matrices
        System.out.println("\nMatrix 1: ");
        System.out.println(matmul3);

        System.out.println("\nMatrix 2: ");
        System.out.println(matmul4);

        // Multiply the matrices
        if (cols1 != rows2) {
            System.out.println("The matrices cannot be multiplied!");
            System.exit(0);
        }

        ArrayList<ArrayList<Integer>> product2 = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < rows1; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < cols2; j++) {
                row.add(0);
                for (int k = 0; k < cols1; k++) {
                    row.set(j, row.get(j) + matmul3.get(i).get(k) * matmul4.get(k).get(j));
                }
            }
            product2.add(row);
        }

        // Print the product
        System.out.println("\nProduct: ");
        System.out.println(product2);
    }
}
