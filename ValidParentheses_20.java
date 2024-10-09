import java.util.Stack;

public class ValidParentheses_20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; 
                }
            }
        }
        return stack.isEmpty();
    }
    
    public static void main(String args[]) {
        ValidParentheses_20 solution = new ValidParentheses_20();
        String s = "(([()]){})";
        System.out.println(solution.isValid(s));
    }
}
