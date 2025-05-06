package Array;

import java.util.Scanner;

public class Kth_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 21, 32, 4, 5, 78, 15, 16, 10, 1 };
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // for (int a = 0; a < len; a++) {
        // System.out.print(arr[a] + " ");
        // }
        System.out.print("Enter kth value for max : ");
        int max = sc.nextInt();
        System.out.print("Enter kth value for min : ");
        int min = sc.nextInt();
        System.out.println("Minimum is : " + arr[min - 1]);
        System.out.println("Maximum is : " + arr[len - max]);

    }
}
