class Solution {
    public void reverseString(char[] s) {
        int first = 0, second = s.length-1;
        while(first < second){
            char temp = s[first];
            s[first] = s[second];
            s[second] = temp;
            
            first++;
            second--;
        }
    }
}