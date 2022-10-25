class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.isEmpty()){
            return "";
        }
        if(s.length() == 1){
            return s;
        }
        
        String result = "";
        for(int i=0;i<s.length();i++){
            String middle = isPalindrome(s, i, i);
            String even = isPalindrome(s, i, i+1);
            if(result.length() < middle.length()){
                result = middle;
            }
            if(result.length() < even.length()){
                result = even;
            }
            
        }
        
        return result;
    }
    
    private String isPalindrome(String s, int start, int end){
        while(start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        
        return s.substring(start +1, end);
        
    }
}