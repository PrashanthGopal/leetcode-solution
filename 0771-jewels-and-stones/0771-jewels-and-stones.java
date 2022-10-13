class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        HashSet<Character> setJ = new HashSet<>();
        for(char c : jewels.toCharArray()){
            setJ.add(c);
        }
        for(char c : stones.toCharArray()){
            if(setJ.contains(c)){
                res++;
            }
        }
        
        return res;
    }
}