import java.util.Stack;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWords("i am a computer science student"));
    }

    public static String reverseWords(String s) {
        String[] string = s.trim().split("\\s+");
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
