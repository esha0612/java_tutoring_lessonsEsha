public class Experiment_Main {
    static boolean flag = false;
    public static void main(String[] paramStrings) {
        System.out.println("Hello World! " + (paramStrings.length != 0 ? String.join(" -- ", paramStrings) : ""));
        if (!flag) {
            main(5);
        }
    }

    public static void main(int paramInt) {
        System.out.println("Hello World! :" + paramInt);
        // main("Hello"); -> this will not compile as "Hello" is a String and is not of type int or String[]
        // so how do we call the main(String []) method from here with "Hello" as the argument?
        flag = true;
        main (new String[] {"Hello"});
    }
}
