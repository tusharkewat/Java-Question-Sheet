package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Remove_Duplicates {
    public static void main(String[] args) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : set) {
            sb.append(ch);
        }
        System.out.println("After removing duplicates : " + sb.toString());
        sc.close();
    }
}
