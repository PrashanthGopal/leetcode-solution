class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() +1];
        dp[0] = true;
        
        for(int i=0; i<s.length(); i++){
            if(!dp[i]){
               continue; 
            }
            for(int j=i+1; j<=s.length(); j++){
                String strng = s.substring(i, j);
                if(wordDictSet.contains(strng)){
                    dp[j] = true;
                }
            }
        }
        
        return dp[s.length()];
        
    }
}