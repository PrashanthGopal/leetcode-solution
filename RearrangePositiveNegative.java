import java.util.Arrays;

/*
 Re-arrange Positive & Negative Values
Given an array, can you re-arrange its elements in such a way that the negative elements appear at one side and positive elements appear at the other? 
Sample Input#
arr = {10, -1, 20, 4, 5, -9, -6}
Sample Output#
arr = {-1, -9, -6, 10, 20, 4, 5}
 */
public class RearrangePositiveNegative {

  public static int[] rearrangePosNegWithExtraSpace(int[] arr) {
    int[] rearrangedArr = new int[arr.length];
    int negIndex = 0;
    int posIndex = arr.length - 1;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < 0) {
        rearrangedArr[negIndex++] = arr[i];
      } else {
        rearrangedArr[posIndex--] = arr[i];
      }
    }

    return rearrangedArr;
  }

  public static void rearrangePosNeg(int[] arr) {
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      // Move `left` towards the right until a negative number is found
      while (arr[left] < 0 && left < right) {
        left++;
      }

      // Move `right` towards the left until a positive number is found
      while (arr[right] >= 0 && left < right) {
        right--;
      }

      // Swap the elements
      if (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { -1, 2, -3, 4, 5, -6, 7, -8, -9 };
    System.out.println("Original Array: " + Arrays.toString(arr));
    rearrangePosNeg(arr);
    System.out.println("Rearranged Array: " + Arrays.toString(arr));
  }
}
