package Array;

import java.util.ArrayList;

public class Intersection_of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int[] arr1 = { 1, 2, 2, 3, 6, 7, 9, 13 };
        int[] arr2 = { 2, 2, 6, 9, 8, 11, 13 };
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                intersection.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println("Intersection = " + intersection);
    }
}
