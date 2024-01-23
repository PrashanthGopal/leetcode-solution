public class FindMin {
    public static int findMinimum(int[] arr) {
        if(arr == null || arr.length == 0){
            return Integer.MIN_VALUE;
        }
        int minSeen = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < minSeen){
                        minSeen = arr[i];
            }
        }
        return minSeen;
    }
    public static void main(String[] args) {
            int result = findMinimum(new int[]{9,2,6,7});
            System.out.println(result);
    }
}