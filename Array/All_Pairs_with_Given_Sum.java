package Array;

public class All_Pairs_with_Given_Sum {

    static void pairs(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 17, 5, 15, 7, 18, 20, 0 };
        int target = 20;
        pairs(arr, target);
    }
}
