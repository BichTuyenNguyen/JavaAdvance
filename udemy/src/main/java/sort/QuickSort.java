package sort;

public class QuickSort {
    public static int partition(int arr[], int left, int right)
    {
        int pivot = arr[left];
        while(true)
        {
            while(arr[left] < pivot){
                left++;
            }

            while(arr[right] > pivot){
                right--;
            }

            if(left < right){
                if(arr[left] == arr[right]){
                    return right;
                }

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } else {
                return right;
            }
        }
    }

    static void quickSort(int arr[], int left, int right)
    {
        if(left<right)
        {
            int pivot = partition(arr, left, right);
            if(pivot > 1){quickSort(arr, left, pivot-1);}
            if(pivot + 1 > right){quickSort(arr, pivot+1, right);}
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,14,3,2,43,11,58,22};
        quickSort(arr, 0, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
