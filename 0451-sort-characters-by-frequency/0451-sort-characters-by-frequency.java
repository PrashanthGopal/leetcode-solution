class Solution {
    public String frequencySort(String s) {
        if(s == null || s.isEmpty()){
            return s;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char in : s.toCharArray()){
            map.put(in,map.getOrDefault(in, 0)+1);
        }
        StringBuilder sb = new StringBuilder();
        List<Map.Entry<Character, Integer>> listOfEntry = new LinkedList<>(map.entrySet());
         
        Collections.sort(listOfEntry, java.util.Map.Entry.comparingByValue(Collections.reverseOrder()));
            
        for(Map.Entry<Character, Integer> entry : listOfEntry){
            char in = entry.getKey();
            int size = entry.getValue();
            while(size-- > 0){
                sb.append(String.valueOf(in));
            }
        }
        
        return sb.toString();
        
    }
}