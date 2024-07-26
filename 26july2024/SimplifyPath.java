import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String str = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(str));
    }

    public static String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stack = new Stack<>();

        for(String s : str) {
            if(s.equals("..")) {
                if(!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else if (!s.equals(".") && !s.equals("")) {
                stack.push(s);
            }
        }

        StringBuilder result = new StringBuilder();
        for(String s : stack) {
            result.append("/").append(s);
        }

        if(result.length() > 0) {
            return result.toString();
        }
        else {
            return "/";
        }
    }
}
