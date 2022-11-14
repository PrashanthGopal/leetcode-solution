class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
            return digits;
        }
        
        int size = digits.length;
        for(int i=size-1; i>=0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        int[] result = new int[size+1];
        Arrays.fill(result, 0);
            result[0] = 1;
        return result;
    }
}