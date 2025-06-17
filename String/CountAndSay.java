package String;

import java.util.Scanner;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1) return "1";

        String prev = "1";  

        for (int i = 2; i <= n; i++) {
            StringBuilder curr = new StringBuilder();
            int count = 1;
            char ch = prev.charAt(0);

            for (int j = 1; j < prev.length(); j++) {
                if (prev.charAt(j) == ch) {
                    count++;
                } else {
                    curr.append(count).append(ch);
                    ch = prev.charAt(j);
                    count = 1;
                }
            }
            curr.append(count).append(ch); 
            prev = curr.toString();  
        }

        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println("The " + n + "th term is: " + countAndSay(n));
        sc.close();
    }
}

