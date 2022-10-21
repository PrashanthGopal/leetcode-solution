class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int max = nums[0], maxCur = nums[0];
        for(int i=1; i<nums.length; i++){
            maxCur = Math.max(maxCur + nums[i], nums[i]);
            max = Math.max(max, maxCur);
            
        }
        return max;
    }
}

/*
DP solution

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int largest = nums[0];
        int dp[] = new int[nums.length + 1];
        dp[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            dp[i] = Math.max(dp[i-1]+nums[i], nums[i]);
            if(largest< dp[i]){
                largest = dp[i];
            }
        }
        return largest;
    }
}


*/
