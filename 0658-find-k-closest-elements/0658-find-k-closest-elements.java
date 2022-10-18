class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if(arr == null){
            return Collections.emptyList();
        }
        int start = 0;
        int end = arr.length-1;
        
        while(end -start >= k){
            if(Math.abs(arr[start]-x) > Math.abs(arr[end]-x)){
                start++;
            }else{
                end--;
            }
        }
        
        return Arrays.stream(arr, start, end+1).boxed().collect(Collectors.toList());
    }
}