import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3,1,2,3,4,5,9,3,8,5,1,0};
        int low = 0, high = arr.length - 1;
        mergeSort(arr,low,high);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high)   return;
        int mid = (low + high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        sort(arr,low,mid,high);
    }

    public static void sort(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low, right = mid + 1;
        while (left<=mid && right<=high) {
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }

        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low; i<= high;i++){
            arr[i] = temp.get(i-low);
        }
    }
}
