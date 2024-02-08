public class RotateArray {

  /*
   * Right Rotate the Array by One Index
   * Given an array, can you rotate its elements once from right to left?
   * Implement your solution in Java and see if your code runs successfully!
   * Sample Input#
   * arr = {1, 2, 3, 4, 5}
   * Sample Output#
   * arr = {5, 1, 2, 3, 4}
   */

  public static void rotateArray(int[] arr) {
    int lastIndex = arr.length - 1;
    int lastElement = arr[lastIndex];
    for (int i = lastIndex; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = lastElement;
  }

  public static void main(String[] args) {
    int[] inputArray = { 1, 2, 3, 4, 5 };
    rotateArray(inputArray);
    for (int input : inputArray) {
      System.out.print(input);
    }
  }
}
