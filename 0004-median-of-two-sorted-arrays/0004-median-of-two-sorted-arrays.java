class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = 0;
        int len2 = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a,b));
        
        if(nums1 != null ){
            len1 = nums1.length;
            
        }
        if(nums2 != null){
            len2 = nums2.length;
        }
        
        int sum = len1+len2;
        boolean isEven = (sum % 2 == 0) ? true : false;
        insert(nums1, sum/2, maxHeap, minHeap);
        insert(nums2, sum/2, maxHeap, minHeap);
        if(isEven){
            return (double) (maxHeap.poll() + minHeap.poll() ) / 2;
        }else{
            return (double) minHeap.poll();
        }
        
    }
    
    public void insert(int[] num, int mid, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap){
        if(num == null){
            return;
        }
        
        for(int in : num){
            maxHeap.offer(in);
            while(maxHeap.size() > mid){
                minHeap.offer(maxHeap.poll());
            }
        }
    }
}