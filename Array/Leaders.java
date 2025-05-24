package Array;

import java.util.Scanner;

public class Leaders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] leaders = new int[size];
        int n = 0;
        int max = arr[size - 1];
        leaders[n++] = max;
        for (int i = size - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders[n++] = max;
            }
        }
        System.out.print("Leaders are = ");
        for (int j = n - 1; j >= 0; j--) {
            System.out.print(leaders[j] + " ");
        }
        sc.close();
    }
}
