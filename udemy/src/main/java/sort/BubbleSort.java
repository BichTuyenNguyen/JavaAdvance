package sort;

public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = n-1; j > i; j--){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
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
