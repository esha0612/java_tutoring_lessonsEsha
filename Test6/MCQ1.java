public class MCQ1 {
    public static void main (String[] args) {
        int[] vals = {5,4,2};

        String s = "Hervaeus";

        String s2 = "";

        for(int i = 0; i < s.length(); i++) {

            for(int j = 0; j < vals[i % vals.length]; j++) {

                s2 += s.charAt(i);

            }

        }

        System.out.println(s2);
    }
}

// Predict the output of the program above.