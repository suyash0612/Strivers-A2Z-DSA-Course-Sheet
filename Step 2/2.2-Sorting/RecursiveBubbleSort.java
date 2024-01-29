import java.util.*;

class ReccursiveBubbleSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[] = {34,1,1,2,2,5,5,5,0,0,10000, 10000 ,2,44};
		int n = arr.length;
		recBubble(arr, n);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void recBubble(int arr[], int n){
	    if(n==1)  return;
	    for(int i = 0;i<n-1;i++){
	        if(arr[i]>arr[i+1]){
    	        int t = arr[i];
    	        arr[i] = arr[i+1];
    	        arr[i+1] = t;
	        }
	    }
	    recBubble(arr, --n);
	}

}