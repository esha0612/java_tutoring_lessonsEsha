public class Recap {
    // write a function which takes a string and divides it into half, then reverses each half, and then concatenates them
    // e.g. "abcdef" -> "fedcba"
    // e.g. "abcde" -> "edcba"
    private static String reverseHalf (String s) {
        String s2 = s.substring(0, s.length()/2);
        String s3 = s.substring(s.length()/2, s.length());
        StringBuilder sb = new StringBuilder(s2);
        sb = sb.reverse();
        s2 = sb.toString();
        sb = new StringBuilder(s3);
        sb = sb.reverse();
        s3 = sb.toString();
        return s2 + s3;
    }

    // write a function which takes a long string and a short string, and returns the number of times the short string appears in the long string
    // e.g. "abcabcabc", "abc" -> 3
    private static int countSubstring (String s1, String s2) {
        int count = 0;
        for (int i = 0; i < s1.length() - s2.length() + 1; i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                count++;
            }
        }
        return count;
    }

    // given an array of integers, return the sum of all the elements with as little as possible
    // e.g. [1, 2, 3, 4, 5] -> 15
    private static int sum (int [] arr) {
        int sum = 0;
        for (int element : arr){
            sum += element;
        }
        return sum;
    }

    // write a function which takes an array of integers and sorts it in ascending order
    // e.g. [5, 4, 3, 2, 1] -> [1, 2, 3, 4, 5]  
    private static void sortAsc (int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i+1); j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // write a function which takes an array of integers and sorts it in descending order
    // e.g. [1, 2, 3, 4, 5] -> [5, 4, 3, 2, 1]
    private static void sortDesc (int [] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i+1); j++) {
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // write a function which takes a string and checks if it is a palindrome
    // e.g. "abcba" -> true
    // e.g. "abcde" -> false
    private static boolean isPalindrome (String s) {
        /*
        boolean isPalindrome = true;
        for (int i=0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length() - (i+1))) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
        */
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main (String [] args) {
        String s = "abcdef";
        System.out.println("The value of s is: " + s);
        System.out.println("The value of s returned from the function is: " + reverseHalf(s));
        System.out.println("The value of s after calling the function is: " + s);

        String s1 = "abcabcabc";
        String s2 = "abc";
        System.out.println("\nThe number of times " + s2 + " appears in " + s1 + " is: " + countSubstring(s1, s2));

        int [] arr = {1, 2, 3, 4, 5};
        System.out.println("\nThe sum of the elements in the array is: " + sum(arr));

        arr = new int [] {5, 4, 3, 2, 1};
        System.out.println("\nThe array before sorting is: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        sortAsc(arr);
        System.out.println("\nThe array after sorting is: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        System.out.println("\nThe array before sorting is: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        sortDesc(arr);
        System.out.println("\nThe array after sorting is: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }

        String s3 = "abcba";
        System.out.println("\n\nThe string " + s3 + " is a palindrome: " + isPalindrome(s3));
    }
}
