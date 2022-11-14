class Solution {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int i=nums.length-1;
        while(i>0 && nums[i-1] >= nums[i]){
            i--;
        }

        if(i > 0){
            int j = i-1;
            for(int k=nums.length-1; k>=0; k--){
                if(nums[k]> nums[j]){
                    swap(nums, k, j);
                    break;
                }
            }
        }
        
        reverse(nums, i, nums.length-1);
    }
    
    private void reverse(int[] nums, int start, int end){
        while(start <=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}