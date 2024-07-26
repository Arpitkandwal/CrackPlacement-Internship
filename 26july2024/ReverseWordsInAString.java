import java.util.Stack;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        
    }

    public String reverseWords(String s) {
        String[] string = s.split("\\s+");
        Stack<String> stack = new Stack<>();

        for(String str : string) {
            stack.push(str);
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop()).append(" ");
        }

        int index = result.lastIndexOf(" ");
        result.deleteCharAt(index);

        return result.toString();
    }
}
