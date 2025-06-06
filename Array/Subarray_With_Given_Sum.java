package Array;

import java.util.Scanner;

public class Subarray_With_Given_Sum {
    public static void findSubarray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == target) {
                    System.out.println("Subarray found from index " + i + " to " + j);
                    return;
                }
            }
        }

        System.out.println("No subarray found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target sum : ");
        int target = sc.nextInt();
        findSubarray(arr, target);
        sc.close();
    }
}
