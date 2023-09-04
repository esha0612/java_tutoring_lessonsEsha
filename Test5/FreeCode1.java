class Brackets {
    // We have a string brackets which stores an expression with brackets only
    // We want to check if the brackets are balanced or not
    // We will assume this means that for every opening bracket there is a closing bracket
    // and that the closing bracket comes after the opening bracket
    // There are 3 types of brackets: (), [], {}
    String brackets;

    public Brackets(String brackets) {
        this.brackets = brackets;
    }

    // Write a method that returns true if the brackets are balanced and false otherwise
    public boolean isBalanced() {
        // your code here

        return false;
    }
}

public class FreeCode1 {
    public static void main (String[] args) {
        Brackets b1 = new Brackets("()[]{}");
        System.out.println(b1.isBalanced()); // true

        Brackets b2 = new Brackets("([)]");
        System.out.println(b2.isBalanced()); // false

        Brackets b3 = new Brackets("({[]})");
        System.out.println(b3.isBalanced()); // true

        Brackets b4 = new Brackets("({[}])");
        System.out.println(b4.isBalanced()); // false
    }
}
