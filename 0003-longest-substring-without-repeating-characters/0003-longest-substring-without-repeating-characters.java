class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        HashSet<Character> set = new HashSet<>();
        int first=0,second=0,result=0;
        while(second < s.length() && first <= second){
            char in = s.charAt(second);
            if(set.contains(in)){
                set.remove(s.charAt(first));
                first++;
            }else{
                set.add(in);
                
                result = Integer.max(result, (second-first)+1);
                second++;
            }
        }
        return result;
    }
}