# Notes for 2nd January

* Matrix multiplication needs compatibility: The number of columns of matrix A must be equal to the number of rows of matrix B for the multiplication operation __A x B = C__ to be compatible. If A : (x, y), and B : (y, z) are the dimensions, then the product will have the dimensions C : (x, z).

* For addition and subtraction, they must have equal dimensions.

* Matrix division is implemented using multiplication of an inverse. For the inverse to exist, the determinant of matrix A, denoted as __|A|__, must be non-zero.