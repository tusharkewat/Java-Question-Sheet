package Array;

import java.util.Scanner;

public class Alternating_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] neg = new int[arr.length];
        int[] pos = new int[arr.length];
        int ni = 0;
        int pi = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos[pi++] = arr[i];
            } else if (arr[i] < 0) {
                neg[ni++] = arr[i];
            }
        }
        int i = 0, p = 0, n = 0;
        while (p < pi && n < ni) {
            arr[i++] = pos[p++];
            arr[i++] = neg[n++];
        }
        while (p < pi) {
            arr[i++] = pos[p++];
        }
        while (n < ni) {
            arr[i++] = pos[p++];
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        sc.close();
    }
}
