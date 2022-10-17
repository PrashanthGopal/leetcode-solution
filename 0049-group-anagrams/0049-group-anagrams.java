class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null){
            return Collections.emptyList();
        }
        
        HashMap<String, List<String>> map = new HashMap<>();
        for(String in:strs){
            char[] charArr = in.toCharArray();
            Arrays.sort(charArr);
            map.computeIfAbsent(new String(charArr), k -> new ArrayList<>()).add(in);
        }
        
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
        
    }
    
}