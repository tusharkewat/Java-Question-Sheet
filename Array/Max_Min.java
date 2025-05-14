package Array;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers : ");
        for(int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
        sc.close();
    }
}