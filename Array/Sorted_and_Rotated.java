package Array;

import java.util.Scanner;

public class Sorted_and_Rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int len = arr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > arr[(i + 1) % len]) {
                count++;
            }
        }
        if (count == 1)
            System.out.println("Array is Sorted and Rotated.");
        else
            System.out.println("Array is not Sorted and Rotated.");
        sc.close();
        
    }
}
