package multibracketvalidation;

import StacksAndQueues.Stack;

public class MultiBracketValidation {
    // Returns a boolean representing whether or not the brackets in the input string are balanced
    public static boolean multiBracketValidation(String input) {
        Stack stack = new Stack();
        char current = '0';
        for (int i = 0; i < input.length(); i++) {
            // Saving the char that is currently being looked at for readability
            current = input.charAt(i);

            // Pushes all (, [ and { chars into the stack
            if (current == '(' ||
                    current == '[' ||
                    current == '{') {
                stack.push(current);
            } else if (current == ')') {
                if (stack.peek() == null || (char) stack.pop() != '(') {
                    return false;
                }
            } else if (current == ']') {
                if (stack.peek() == null || (char) stack.pop() != '[') {
                    return false;
                }
            } else if (current == '}') {
                if (stack.peek() == null || (char) stack.pop() != '{') {
                    return false;
                }
            }
        }

        // Checks to see if the stack is "empty"
        return stack.peek() == null ? true : false;
    }
}
