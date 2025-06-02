package Array;

import java.util.Scanner;

public class Maximum_Product_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int currentMax = arr[0];
        int max = arr[0];

        for (int i = 1; i < size; i++) {
            if (currentMax * arr[i] > arr[i]) {
                currentMax = currentMax * arr[i];
            } else {
                currentMax = arr[i];
            }

            if (currentMax > max) {
                max = currentMax;
            }
        }

        System.out.println("Maximum Subarray Product is: " + max);
        sc.close();
    }
}