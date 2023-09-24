import java.util.Stack;

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
        
        // We will use a stack to solve this problem
        // We will push opening brackets onto the stack
        // When we encounter a closing bracket, we will pop the top element from the stack
        // If the popped element is not the corresponding opening bracket, we will return false
        // If the stack is empty at the end, we will return true
        // If the stack is not empty at the end, we will return false

        char[] bracketsArray = brackets.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < bracketsArray.length; i++) {
            if (bracketsArray[i] == '(' || bracketsArray[i] == '[' || bracketsArray[i] == '{') {
                // if we encounter an opening bracket, we push it onto the stack
                stack.push(bracketsArray[i]);
            } else {
                // this case means that we have encountered a closing bracket for which there is no corresponding opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                // if we encounter a closing bracket, we pop the top element from the stack
                char popped = stack.pop();
                if (bracketsArray[i] == ')' && popped != '(') {
                    return false;
                } else if (bracketsArray[i] == ']' && popped != '[') {
                    return false;
                } else if (bracketsArray[i] == '}' && popped != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
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
