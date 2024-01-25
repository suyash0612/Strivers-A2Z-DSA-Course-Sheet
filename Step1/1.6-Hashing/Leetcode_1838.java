import java.util.Arrays;

/**
 * Leetcode_1838
 */
public class Leetcode_1838 {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums); 
        int left = 0; int right = 0; // sliding window
        long sum = nums[0] ; int ans = 0;
        while(right<nums.length){
            if(nums[right] * (long) (right - left + 1) <= k + sum){
                ans = Math.max(ans, right - left + 1);
                right++;
                if(right<nums.length) sum+= nums[right];
            }
            else{
                sum-=nums[left];
                left++;
            }
        }
        return ans;
    }
}