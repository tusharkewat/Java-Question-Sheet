package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        String s3 = s1.toLowerCase();
        String s4 = s2.toLowerCase();

        char[] a1 = s3.toCharArray();
        char[] a2 = s4.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter secound string: ");
        String str2 = sc.nextLine();
        boolean b1 = isAnagram(str1, str2);
        if (b1)
            System.out.println("They are Anagram.");
        else
            System.out.println("They are not Anagram.");
        sc.close();

    }
}
