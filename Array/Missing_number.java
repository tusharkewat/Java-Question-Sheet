package Array;

public class Missing_number {
    static int missingNum(int[] arr, int size) {
        int totalSum = size * (size + 1) / 2;
        int arrSum = 0;
        for (int i : arr) {
            arrSum += i;
        }
        return totalSum - arrSum;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 7, 8, 3 };
        int totalSize = arr.length + 1;
        System.out.println(missingNum(arr, totalSize));
    }
}
