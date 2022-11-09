class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals == null || intervals.length == 0){
            return intervals;
        }
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        Stack<int[]> stack = new Stack<>();
        stack.push(intervals[0]);
        for(int[] interval:intervals){
            int[] tmpInterval = stack.pop();
            if(checkOverlap(tmpInterval, interval)){
                stack.push(mergeOverlap(tmpInterval, interval));
            }else{
                stack.push(tmpInterval);
                stack.push(interval);
            }
        }
        
        return stack.toArray(new int[stack.size()][]);
    }
    
    private boolean checkOverlap(int[] a, int[] b){
        return a[0] <= b[1] && b[0] <= a[1];
    }
    
    private int[] mergeOverlap(int[] a, int[] b){
        int aVal = Integer.min(a[0], b[0]);
        int bVal = Integer.max(a[1], b[1]);
        return new int[]{aVal, bVal};
        
    }
}