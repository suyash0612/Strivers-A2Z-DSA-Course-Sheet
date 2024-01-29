import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {7,1,8,3,2,2,1,6};
        int n = arr.length;
        for(int  i = 0; i < n - 1; i++ ){
            int min = i;
            for(int j = i; j< n;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int t = arr[min];
            arr[min] = arr[i];
            arr[i] = t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
