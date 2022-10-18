class Solution {
    public int findMin(int[] nums) {
        if(nums == null){
            return -1;
        }
        
        int start=0, end = nums.length-1;
        int minNum = Integer.MAX_VALUE;
        while(start <= end){
            int mid = (end + start)/2;
            if(nums[mid] < minNum){
                minNum = nums[mid];
            }
            if(nums[start] <= nums[mid] && nums[mid] > nums[end]){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return minNum;
    }
}