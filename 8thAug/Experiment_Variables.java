public class Experiment_Variables {
    public static void main (String[] args) {

        // checking if else with various data types
        // boolean
        boolean bool = false;
        if (bool) {
            System.out.println("bool is true");
        } else {
            System.out.println("bool is false");
        }

        // integer
        int i = 1;
        if (i > 0) {
            System.out.println("i is true");
        } else {
            System.out.println("i is false");
        }

        // an example with integer and character
        int i2 = 65;
        char c = 'A';
        if (i2 == c) {
            System.out.println("i2 is equal to c");
        } else {
            System.out.println("i2 is not equal to c");
        }

        // an example with Strings using parsing classes
        String s = "65";
        System.out.println("The integer equivalent is " + Integer.parseInt(s));
        // now check if this is equal to c
        if (Integer.parseInt(s) == c) {
            System.out.println("Integer equivalent of s is equal to c");
        } else {
            System.out.println("Integer equivalent of s is not equal to c");
        }

        // assume we have only integer values as arguments from the command line
        // convert them to integer and add them, and print the result
        int sum = 0;
        for (i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("The sum of the arguments is " + sum);

        // let's try this a different way
        // we can use the enhanced for loop
        sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        System.out.println("The sum of the arguments is " + sum);

        // now let's try with a foreach loop (introduced in Java 8)
        sum = 0;
        //args.forEach(arg -> sum += Integer.parseInt(arg));
        System.out.println("The sum of the arguments is " + sum);
    }
}
