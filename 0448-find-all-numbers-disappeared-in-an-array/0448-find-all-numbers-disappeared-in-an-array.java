class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null || nums.length == 0){
            return Collections.emptyList();
        }
        for(int i=0; i<nums.length; i++){
            int ind = Math.abs(nums[i])-1;
            nums[ind] = - Math.abs(nums[ind]);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                result.add(i+1);
            }
        }
        return result;
    }
}