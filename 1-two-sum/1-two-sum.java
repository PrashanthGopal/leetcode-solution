class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return nums;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int val = nums[i];
            int key = target - val;
            if(map.containsKey(key)){
                return new int[]{i, map.get(key)};
            }else{
                map.put(val, i);
            }
        }
        
        return new int[]{};
        
    }
}