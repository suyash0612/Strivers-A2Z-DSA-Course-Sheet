import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {34,1,45,76,55,10000000,99,12,44,0};
        for(int i = 0; i< arr.length; i++){
            int j = i;
            while(j!=0){
                if(arr[j]<arr[j-1]){
                    int t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = t;
                }
                j--;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
