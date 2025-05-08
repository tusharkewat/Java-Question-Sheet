package Array;

public class Union_Intersection {
    public static void main(String[] args) {
        int[] arr1 = { 1, 15, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = { 1, 2, 10, 11, 12, 4, 5, 9 };
        System.out.print("Union : ");
        for(int i =0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        for(int i=0;i<arr2.length;i++){
            int j=0;
            for(;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    break;
                }
            }
            if (j == arr1.length) {
                System.out.print(arr2[i] + " ");
            }
        }

        System.out.println();
        System.out.print("Intersecton : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+" ");
                    break;
                } 
            }
        }
    }

}
