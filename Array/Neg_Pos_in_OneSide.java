package Array;

public class Neg_Pos_in_OneSide {
    public static void main(String[] args) {
        int[] arr = { -21, 32, -4, 5, 78, -15, 16, 10, -1 };
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] > 0) {
                for (int j = i; j < len; j++) {
                    if (arr[j] < 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for (int a = 0; a < len; a++) {
            System.out.print(arr[a] + " ");
        }
    }

}
