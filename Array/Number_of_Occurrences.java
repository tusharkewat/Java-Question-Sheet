package Array;

import java.util.Scanner;

public class Number_of_Occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements : ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        System.out.println("Enter your target : ");
        int target = sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i] == target){
                count++;
            }
        }
        
        System.out.println("Occurrences of "+target+" is : "+count);
        sc.close();
    }
}
