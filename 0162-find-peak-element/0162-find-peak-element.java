class Solution {
    public int findPeakElement(int[] nums) {
        if(nums == null){
            return -1;
        }
        return findPeakElement(nums, 0, nums.length);
        
       
        
    }
    
    public int findPeakElement(int[] nums, int start, int end){
        int mid = (start + end) /2;
        
        if((mid == 0 || nums[mid-1]<= nums[mid] ) && (mid == nums.length-1 || nums[mid] >= nums[mid+1]) ){
            return mid;
        }
        
        if(mid-1 >= 0 && nums[mid-1]> nums[mid]){
            return findPeakElement(nums, start, mid-1);
        }else{
            return findPeakElement(nums, mid+1, end);
        }
    }
}