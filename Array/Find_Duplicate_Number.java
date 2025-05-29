package Array;

import java.util.HashSet;
import java.util.Scanner;

public class Find_Duplicate_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Duplicate numbers are : ");
        for (int i : arr) {
            if (set.contains(i)) {
                System.out.print(i + " ");
            } else
                set.add(i);
        }
        sc.close();
    }
}
