import java.util.Arrays;
import java.util.Stack;

public class ValidParantheses {
    public static void main(String[] args) {

        String s = "()";
        char[] ch = s.toCharArray();

        System.out.println(Arrays.toString(ch));

        Stack<Character> stack = new Stack<>();
        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i); // Get the current character

            // Check if the current character is an opening bracket
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr); // Push the opening bracket onto the stack
            }
            // If the current character is a closing bracket and the stack is not empty
            else if (!stack.isEmpty() && isMatchingPair(stack.peek(), curr)) {
                stack.pop(); // Pop the opening bracket from the stack if it matches the closing bracket
            }
            // If the current character is not a closing bracket or does not match the last opening bracket
            else {
                System.out.println("False"); // Print "False" and exit the method
                return; // Exit the method immediately if an invalid character is found
            }
        }

        // Check if the stack is empty after processing all characters
        if (stack.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}
