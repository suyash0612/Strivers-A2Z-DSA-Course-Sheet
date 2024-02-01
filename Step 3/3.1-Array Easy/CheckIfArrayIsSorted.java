public class CheckIfArrayIsSorted {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i = 0 ; i<n-1;i++){
            if(a[i+1]>=a[i]){
                continue;
            }
            else{
                return 0;
            }
        }
        return 1;
    }
}