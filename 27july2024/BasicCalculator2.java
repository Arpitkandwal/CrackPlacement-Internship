import java.util.Stack;

public class BasicCalculator2 {
    public static void main(String[] args) {
        String s = "3+2*2";
        System.out.println(calculate(s));
    }

    public static int calculate(String s) {
        Stack<Integer> stack = new Stack<>();

        int num = 0;
        char operator = '+';

        for(int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            
            if(Character.isDigit(character)) {
                num = num * 10 + (character - '0');
            }

            if(isOperator(character) || i == s.length() - 1) {
                if(operator == '+') stack.push(num);
                else if(operator == '-') stack.push(-num);
                else if(operator == '*') stack.push(stack.pop() * num);
                else if(operator == '/') stack.push(stack.pop() / num);

                num = 0;
                operator = character;
            }
        }

        int ans = 0;
        
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }

    private static boolean isOperator(char character) {
        return character == '+' || character == '-' || character == '*' || character == '/';
    }
}
