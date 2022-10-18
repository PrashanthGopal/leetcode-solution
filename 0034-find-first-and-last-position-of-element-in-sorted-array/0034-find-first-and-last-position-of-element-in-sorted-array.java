class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartPoint(nums,target);
        result[1] = findEndPoint(nums,target);
        return result;
    }
    
    public int findStartPoint(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int position = -1;
        while(start<=end){
            int mid = start +(end-start) / 2;
            
            if(nums[mid] >= target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            if(nums[mid] == target){
                position = mid;
            }
        }
        return position;
    }
    
    public int findEndPoint(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int position = -1;
        while(start<=end){
            int mid = start +(end-start) / 2;
            if(nums[mid] <= target){
                start = mid+1;
            }else{
                end = mid-1;
            }
            if(nums[mid] == target){
                position = mid;
            }
        }
        return position;
    }
}