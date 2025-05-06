package Array;

public class Max_Min {
    public static void main(String[] args) {
        int[] arr = { 21, 32, 4, 5, 78, 15, 16, 10, 1 };
        int len = arr.length;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < len; i++) {
            if (max > arr[i]) {
                max = arr[i];
            } else if (min < arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Maximum number is " + max);
        System.out.println("Minimum number is " + min);
    }
}