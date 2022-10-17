class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        if(temperatures == null){
            return new int[]{};
        }
        
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
        
        
    //     Stack<Integer> stack = new Stack<>();
    // int[] ret = new int[temperatures.length];
    // for(int i = 0; i < temperatures.length; i++) {
    //     while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
    //         int idx = stack.pop();
    //         ret[idx] = i - idx;
    //     }
    //     stack.push(i);
    // }
    // return ret;
        
        
    }
}