class Solution {
    public int longestArithSeqLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int largest = 0;
        HashMap<Integer, Integer>[] dp = new HashMap[nums.length];
        for(int i=0; i<nums.length; i++){
            dp[i] = new HashMap<>();
        }
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                int x = nums[i];
                int y = nums[j];
                int d = x-y;
                
                int len = 2;
                if(dp[j].containsKey(d)){
                    len = dp[j].get(d) +1;
                }
                dp[i].put(d, len);
                largest = Integer.max(largest, dp[i].get(d));
            }
        }
        
        return largest;
    }
}