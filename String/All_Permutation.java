package String;

public class All_Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        char[] arr = str.toCharArray();
        int n = arr.length;

        int[] c = new int[n]; 
        System.out.println(str); 

        int i = 0;
        while (i < n) {
            if (c[i] < i) {
                if (i % 2 == 0) {
                    swap(arr, 0, i);
                } else {
                    swap(arr, c[i], i);
                }
                System.out.println(String.valueOf(arr));
                c[i]++;
                i = 0;
            } else {
                c[i] = 0;
                i++;
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
