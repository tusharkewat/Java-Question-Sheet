package Array;

public class Reverse_in_place {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int len = arr.length;
        System.out.println("Original array : ");
        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }
        for (int i = 0, j = len - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(" \nReverse array : ");
        for (int a = 0; a < len; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}