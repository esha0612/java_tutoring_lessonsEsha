// Modify the matrix multiplication program to take the dimensions of each matrix from the user.
// First, make sure the dimensions are valid for matrix multiplication.
// If they are valid, then take the input from the user and populate the matrices.
// Then, multiply the matrices and print the result.
// If the dimensions are invalid, then print an error message.

// Tuple class to hold the dimensions of the matrix.
class Tuple {
    public int rows;
    public int columns;

    public Tuple(int x, int y) {
        this.rows = x;
        this.columns = y;
    }
}

// Matrix class to hold the matrix.
class Matrix {
    public int matrix[][];
    public Tuple dimensions;

    public Matrix(int x, int y) {
        this.matrix = new int[x][y];
        this.dimensions = new Tuple(x, y);
    }

    public void populate(java.util.Scanner sc) {
        // This method takes the input from the user and populates the matrix.
        System.out.println("This is a " + this.dimensions.rows + "x" + this.dimensions.columns + " matrix.");
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < this.dimensions.rows; i++) {
            for (int j = 0; j < this.dimensions.columns; j++) {
                this.matrix[i][j] = sc.nextInt();
            }
        }
    }
}


public class CP2 {
    // Variables
    public Tuple dimensions[] = new Tuple[2];
    public Matrix matrices[] = new Matrix[2];
    public Matrix result;
    static java.util.Scanner sc;

    // Constructor
    public CP2() {
        this.dimensions[0] = new Tuple(0, 0);
        this.dimensions[1] = new Tuple(0, 0);
        sc = new java.util.Scanner(System.in);
    }

    public void input() {
        // This method takes the input from the user and populates the matrix.
        
        System.out.println("Enter the dimensions of the first matrix: ");
        this.dimensions[0].rows = sc.nextInt();
        this.dimensions[0].columns = sc.nextInt();
        System.out.println("Enter the dimensions of the second matrix: ");
        this.dimensions[1].rows = sc.nextInt();
        this.dimensions[1].columns = sc.nextInt();
    }

    // This method checks if the dimensions are valid for matrix multiplication.
    public boolean validate() {
        if (this.dimensions[0].columns == this.dimensions[1].rows)
            return true;
        return false;
    }

    // Check if the dimensions are valid.
    // If they are valid, then take the input from the user and populate the matrices.
    public void populate() {
        if (this.validate()) {
            // Initialize the matrices.
            this.matrices[0] = new Matrix(this.dimensions[0].rows, this.dimensions[0].columns);
            this.matrices[1] = new Matrix(this.dimensions[1].rows, this.dimensions[1].columns);
            this.result = new Matrix(this.dimensions[0].rows, this.dimensions[1].columns);

            // Populate the matrices.
            this.matrices[0].populate(sc);
            this.matrices[1].populate(sc);
        }
    }

    // Multiply the matrices.
    public void multiply() {
        // YOUR CODE HERE
        // This method multiplies the matrix and stores the result in result[][].
        for (int i = 0; i < this.dimensions[0].rows; i++) {
            for (int j = 0; j < this.dimensions[1].columns; j++) {
                for (int k = 0; k < this.dimensions[0].columns; k++) {
                    this.result.matrix[i][j] += this.matrices[0].matrix[i][k] * this.matrices[1].matrix[k][j];
                }
            }
        }
    }

    // Print the result.
    public void print() {
        for (int i = 0; i < this.result.matrix.length; i++) {
            for (int j = 0; j < this.result.matrix[0].length; j++) {
                System.out.print(this.result.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CP2 obj = new CP2();
        obj.input();
        if (obj.validate()) {
            obj.populate();
            obj.multiply();
            obj.print();
        } else {
            System.out.println("Invalid dimensions.");
        }
        sc.close();
    }
}
