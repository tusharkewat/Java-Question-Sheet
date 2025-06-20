package String;

public class Search_Substring {
    public static int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        if (n == 0)
            return 0;

        for (int i = 0; i <= h - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll")); // Output: 2
        System.out.println(strStr("abcdef", "gh")); // Output: -1
        System.out.println(strStr("abc", "")); // Output: 0
    }
}
