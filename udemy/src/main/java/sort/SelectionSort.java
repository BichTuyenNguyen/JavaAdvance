package sort;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,14,3,2,43,11,58,22};
        sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
