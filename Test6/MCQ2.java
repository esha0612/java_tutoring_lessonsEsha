public class MCQ2 {
    public static void main (String[] args) {
        char[] values = {'I',' ','l','o','v','e',' ','y','o','u','!','!'};

        String s = "";

        for(int i = 0; i < values.length / 2; i++) {

            char temp = values[i];

            values[i] = values[values.length - i-1];

            values[values.length - i-1] = temp;

        }

        for(int i = 0; i < values.length; i++) {

            s += values[i];

        }

        System.out.println(s);
    }
}


// Predict the output of the program above.