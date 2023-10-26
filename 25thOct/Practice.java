public class Practice {
    // 1. Write the replace(String s, String s1, String s2) method to replace all occurrences of s1 in s to s2. For example, replace("cats play catch catch", "cat", "dog") will return "dogs play dogch dogch". 
    public static String replace(String s, String s1, String s2) {
        for (int i = 0; i < s.length() - s1.length(); i++) {
            if (s.substring(i, i + s1.length()).equals(s1)) {
                s = s.substring(0, i) + s2 + s.substring(i + s1.length());
            }
        }
        return s;
    }

    //5. Strings are considered special if they have '@', '0', ".", or "_" in them. You will write a program to take a string, check if it is special.
    //2. Write the special(String s) method that returns true if it contains all the special characters listed above. For example, special("c@ts_pl0y_catch.") returns true but special("c@ts_pl@y_c@tch.") returns false since it does not have '0'. A special string is created for you. Use that string in this method.
    public static boolean special(String s) {
        String special = "@._0";
        for (int i=0; i<s.length(); i++) {
            if (special.indexOf(s.charAt(i))!=-1) {
                int index = special.indexOf(s.charAt(i));
                special = special.substring(0, index) + special.substring(index + 1);
                if (special.length()==0) {
                    return true;
                }
            }
        }

        return false;
    }
    // 3. Write the makeSpecial(String s) method that tries to make s special. It changes all 'a's to '@', 'o' to '0', space to '_' and adds a '.' at the end. It then checks if the new string is special. If it is, it returns the new string, otherwise it returns the message "cannot be made special!". For example, makeSpecial("omg, I’m special") returns "0mg,_I’m_speci@l." but makeSpecial("cat") returns ""cat" cannot be made special". 
    public static String makeSpecial(String s) {
        return special(replace(replace(replace(s, "a", "@"), "o", "0"), " ", "_") + ".") ? replace(replace(replace(s, "a", "@"), "o", "0"), " ", "_") + "." : "\"" + s + "\" cannot be made special";
    }
    
    // 4. Write the main method to test all your methods.
    //   1. Call the replace method to replace “cat” with “dog” in the "cats play catch catch" string. Print the result
    //    2. Check to see if “0mg_I_@m_speci@l.” is special. Print the result
    //    3. Make “omg I am special” special. Print the result.
    
    public static void main(String[] args) {
        System.out.println(replace("cats play catch catch", "cat", "dog"));
        System.out.println(special("0mg_I_@m_speci@l."));
        System.out.println(makeSpecial("omg I am special"));
        //System.out.println(makeSpecial("cat"));
    }
}