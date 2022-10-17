class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(Map.Entry.comparingByValue());
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(Map.Entry entry : map.entrySet() ){
            pq.offer(entry);
            if(pq.size() > k){
                while(pq.size() > k){
                    pq.poll();
                }
                
            }
        }
        
        int[] result = new int[pq.size()];
        
        for(int i = 0; i< k; i++){
            Map.Entry<Integer, Integer> entry = pq.poll();
            
            result[i] = entry.getKey();
            
        }
        return result;
    }
}