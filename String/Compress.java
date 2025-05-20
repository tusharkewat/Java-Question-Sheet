package String;

public class Compress {

    static String CString() {
        StringBuilder obj = new StringBuilder();
        String str = "aaabbccccddddaa";
        int count = 1;
        for (int k = 1; k < str.length(); k++) {
            if (str.charAt(k) == str.charAt(k - 1)) {
                count++;
            } else {
                obj.append(str.charAt(k - 1)).append(count);
                count = 1;
            }

        }
        obj.append(str.charAt(str.length() - 1)).append(count);

        return obj.toString();
    }

    public static void main(String[] args) {
        System.out.println(CString());

    }
}
