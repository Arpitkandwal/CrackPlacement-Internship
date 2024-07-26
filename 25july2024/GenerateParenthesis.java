import java.util.*;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int num = 3;
        System.out.println(generateParenthesis(num));
    }

        public static List<String> generateParenthesis(int n) {
            @SuppressWarnings("unchecked")
            List<String>[] dp = new List[n + 1];
            dp[0] = Arrays.asList("");
            dp[1] = Arrays.asList("()");
    
            for(int i = 2; i <= n; i++) {
                dp[i] = new ArrayList<>();
    
                int inner = i - 1;
                int outer = 0;
    
                while(inner >= 0 && outer <= i - 1) {
                    for(String in: dp[inner]) {
                        for(String out: dp[outer]) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("(");
                            sb.append(in);
                            sb.append(")");
                            sb.append(out);
    
                            dp[i].add(sb.toString());
                        }
                    }
                    inner--;
                    outer++;
                }
            }
            return dp[n];
        }
    }
