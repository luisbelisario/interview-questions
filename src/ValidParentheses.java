import java.util.Stack;

class ValidParentheses {


    public static void main(String[] args) {
        System.out.println(isValid("{}{}{}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            switch (ch) {
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + ch);
            }
        }
        return stack.isEmpty();
    }
}