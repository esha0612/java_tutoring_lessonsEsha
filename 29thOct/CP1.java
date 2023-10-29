public class CP1 {
    // This class will store the code for the first problem of the CP sheet.
    // This class has 3 variables:
    // @param dimension[2]: Stores the dimensions of the matrix.
    // @param matrix1[][], matrix2[][]: Stores the matrix itself.
    // @param result[][]: Stores the result of the matrix multiplication.

    // This class has 3 methods:
    // @param CP1(): Constructor of the class.
    // @param input(): Takes the input from the user and populates the matrix.
    // @param multiply(): Multiplies the matrix and stores the result in result[][].

    // Variables
    public int dimension[] = new int[2];
    public int matrix1[][] = new int[2][2];
    public int matrix2[][] = new int[2][2];
    public int result[][] = new int[2][2];

    // Constructor
    public CP1() {
        this.dimension[0] = 2;
        this.dimension[1] = 2;
    }

    // Methods
    public void input() {
        // This method takes the input from the user and populates the matrix.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < this.dimension[0]; i++) {
            for (int j = 0; j < this.dimension[1]; j++) {
                this.matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < this.dimension[0]; i++) {
            for (int j = 0; j < this.dimension[1]; j++) {
                this.matrix2[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public void multiply() {
        // This method multiplies the matrix and stores the result in result[][].
        for (int i = 0; i < this.dimension[0]; i++) {
            for (int j = 0; j < this.dimension[1]; j++) {
                for (int k = 0; k < this.dimension[0]; k++) {
                    this.result[i][j] += this.matrix1[i][k] * this.matrix2[k][j];
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        CP1 obj = new CP1();
        obj.input();
        obj.multiply();
    }
}