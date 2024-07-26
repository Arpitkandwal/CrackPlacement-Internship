
public class FindIndexOfFirstOccurenceOfString {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()) {
            return -1;
        }
        int m = haystack.length();
        int n = needle.length();

        for(int i = 0; i < (m - n) + 1; i++) {
            for(int j = 0; j < n; j++) {
                if(haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                if(j == n - 1) {
                    return i;
                }
            }
        }
        return -1;
    }
}
