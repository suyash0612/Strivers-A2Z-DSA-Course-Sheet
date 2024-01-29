import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,56,56,12,5,67,1,1,2,0};
        int n = arr.length;
        for(int i = 0; i <n;i++){
            recInsertionSort(arr,i);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void recInsertionSort(int[] arr, int j){
        if(j>0 && arr[j]<arr[j-1]){
            int t = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = t;
        }
        else{
            return;
        }
        recInsertionSort(arr, --j);
    }
}
