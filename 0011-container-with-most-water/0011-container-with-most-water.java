class Solution {
    public int maxArea(int[] height) {
        if(height == null){
            return 0;
        }
        
        int first = 0;
        int last = height.length-1;
        
        int maxWaterStored = 0;
        while(first < last){
            int h = Integer.min(height[first], height[last]);
            int w = last-first;
            int waterStored = h*w;
            maxWaterStored = Integer.max(waterStored, maxWaterStored);
            
            if(height[first]<height[last]){
                first++;
            }else{
                last--;
            }
            
        }
        return maxWaterStored;
    }
}