import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
		int arr[] = {34,1,45,12,76,55,10000000,99,1,12,12,44,0};
		int n = arr.length;
		for(int i=0;i<n;i++){
		    for(int j = 0; j<=n-2;j++){
		        if(arr[j]>arr[j+1]){
		            int t = arr[j];
		            arr[j] = arr[j+1];
		            arr[j+1] = t;
		        }
		    }
		}
		System.out.println(Arrays.toString(arr));
	}
}
