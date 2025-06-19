package String;

public class String_To_Integer {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;
        int result = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args) {
        String_To_Integer obj = new String_To_Integer();
        System.out.println(obj.myAtoi("   -42"));
        System.out.println(obj.myAtoi("4193 with words"));
        System.out.println(obj.myAtoi("words and 987"));
        System.out.println(obj.myAtoi("-91283472332"));
    }
}
