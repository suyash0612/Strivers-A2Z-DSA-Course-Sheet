public class ReverseArray {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int res[] = new int[n];
        for(int i = 0;i < n ; i++){
            res[n-i-1] = nums[i];
        }
        return res;
    }

    public static int[] reverseArrayM2(int n, int []nums) {
        // Better at space complexity
        for(int i = 0 ; i < n/2 ; i++){
            int ptr = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = ptr;
        }
        return nums;

    }
}