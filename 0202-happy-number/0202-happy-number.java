class Solution {
    public boolean isHappy(int n) {
        long slow = n;
        long fast = n;

        do{
            slow = getSquereRoot(slow);
            fast = getSquereRoot(getSquereRoot(fast));
        } while(slow != fast);

        if(fast == 1){
            return true;
        }

        return false;
    }
        public static long getSquereRoot(Long n){
        String num = String.valueOf(n);
        long sum = 0;
        for(int i=0; i<num.length(); i++){
            int digit = Character.getNumericValue(num.charAt(i));
            sum+= digit * digit;
        }
        return sum;
    }
}