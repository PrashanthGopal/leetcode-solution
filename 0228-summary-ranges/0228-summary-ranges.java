class Solution {
    public List<String> summaryRanges(int[] nums) {
        if(nums == null || nums.length == 0){
            return Collections.emptyList();
        }
        
        int startRange = nums[0];
        int prevRange = nums[0];
        List<String> result = new ArrayList<>();
        for(int i=1; i<nums.length; i++){
            if(prevRange+1 == nums[i]){
                prevRange = nums[i];
                continue;
            }
            if(startRange == prevRange){
                result.add(startRange+"");
            }else{
                result.add(startRange+"->"+prevRange);
            }
            startRange = nums[i];
            prevRange = nums[i];
        }
        if(startRange == prevRange){
            result.add(startRange+"");
        }else{
            result.add(startRange+"->"+prevRange);
        }
        
        return result;
    }
}