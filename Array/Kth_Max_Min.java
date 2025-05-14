package Array;

import java.util.Scanner;

public class Kth_Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers : ");
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int a = 0; a < size; a++) {
        System.out.print(arr[a] + " ");
        }
        System.out.print("\nEnter kth value for max : ");
        int max = sc.nextInt();
        System.out.print("Enter kth value for min : ");
        int min = sc.nextInt();
        System.out.println("Minimum is : " + arr[min - 1]);
        System.out.println("Maximum is : " + arr[size - max]);
    }
}