public class FindSecondMaximumValue {

  public static int findSecondMaximumValue(int[] arr) {
    int firstMax = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > firstMax) {
        secondMax = firstMax;
        firstMax = arr[i];
      } else if (arr[i] > secondMax && arr[i] != firstMax) {
        secondMax = arr[i];
      }
    }
    return secondMax;
  }

  public static void main(String[] args) {
    int[] arr = { 9, 2, 3, 6 };
    int result = findSecondMaximumValue(arr);
    System.out.println(result);
  }
}
