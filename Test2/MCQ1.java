public class MCQ1 {
    public static void main (String[] args) {
        if (true)
            System.exit(5);
    }
}

// The output will be:
// 1. 0
// 2. 1
// 3. No output -> Correct answer
// 4. Compilation error

// Trick:
// The value inside exit() is the exit code of the program, and is passed to stderror.
// The exit code is used by the OS to determine if the program ran successfully or not.
// The convention is that 0 means success, and any other value means failure.
// The program will otherwise compile fine and show no output on stdout.