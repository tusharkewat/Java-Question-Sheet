package Array;

public class Sort_0_1_2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 0, 2, 2, 1, 0, 2, 1, 1, 2 };
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 2) {
                count2++;
            }
        }
        int i = 0;
        while (i < count0) {
            arr[i] = 0;
            i++;
        }
        while (i < count0 + count1) {
            arr[i] = 1;
            i++;
        }
        while (i < count0 + count1 + count2) {
            arr[i] = 2;
            i++;
        }
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
    }
}
