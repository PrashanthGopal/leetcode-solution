class Solution {
    public int trap(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int ans = 0;
        int size = height.length;
        int[] left = new int[size];
        int[] right = new int[size];
        left[0] = height[0];
        for(int i=1; i<size; i++){
            left[i] = Integer.max(left[i-1], height[i]);
        }
        right[size-1] = height[size-1];
        
        for(int i=size-2; i>=0; i--){
            right[i] = Integer.max(right[i+1], height[i]);
        }
        
        for(int i=0; i<size;i++){
            int min = Integer.min(left[i], right[i]);
            ans+= min - height[i];
        }
        return ans;
    }
}