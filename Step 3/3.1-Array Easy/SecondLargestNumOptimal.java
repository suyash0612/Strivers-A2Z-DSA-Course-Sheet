public class SecondLargestNumOptimal {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int slarge = getSecondLargest(a,n);
        int ssmall = getSecondSmallest(a,n);
        int val[] = {slarge,ssmall};
        return val;
    }

    public static int getSecondLargest(int arr[], int n){
        int large = arr[0];
        int slarge = Integer.MIN_VALUE;
        for(int i = 1; i<n; i++){
            if(arr[i]>large){
                slarge = large;
                large = arr[i];
            }
            else if(arr[i]<large && arr[i]>slarge){
                slarge = arr[i];
            }
        }
        return slarge;
    }

    public static int getSecondSmallest(int arr[], int n){
        int small = arr[0];
        int ssmall = Integer.MAX_VALUE;
        for(int i = 1; i<n; i++){
            if(arr[i]<small){
                ssmall = small;
                small = arr[i];
            }
            else if(arr[i]!=small && arr[i]<ssmall){
                ssmall = arr[i];
            }
        }
        return ssmall;
    }
}