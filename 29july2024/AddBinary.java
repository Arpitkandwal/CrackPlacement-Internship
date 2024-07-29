
public class AddBinary {
    public static void main(String[] args) {
        
    }

    public static String addBinary(String a, String b) {
        int first = Integer.parseInt(a, 2);
        int second = Integer.parseInt(b, 2);

        String ans = Integer.toBinaryString(first + second);

        return ans;
    }
}
