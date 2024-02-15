/*
 Rearrange Sorted Array in Max/Min Form
Given an array, can you re-arrange the elements such that the first position will have the largest number, the second will have the smallest, the third will have the second-largest, and so on. Implement your solution in Java and see if your code runs successfully!
Sample Input#
arr = {1, 2, 3, 4, 5}
Sample Output#
arr = {5, 1, 4, 2, 3}
 */

public class RearrangeArrayMaxMinFlow {

  // Function to rearrange the sorted array in Max/Min form
  public static void rearrangeArrayWithExtraSpace(int[] arr) {
    int n = arr.length;
    int[] temp = new int[n];
    int small = 0, large = n - 1;

    // Flag which will help in indicating whether we need to copy maximum element or minimum element next
    boolean flag = true;

    // Traverse the sorted array
    for (int i = 0; i < n; i++) {
      if (flag) {
        temp[i] = arr[large--];
      } else {
        temp[i] = arr[small++];
      }

      flag = !flag;
    }

    // Copying the contents of temp[] to arr[]
    System.arraycopy(temp, 0, arr, 0, n);
  }

  // Function to rearrange the sorted array in Max/Min form
  public static void rearrangeArray(int[] arr) {
    int n = arr.length;
    int maxIndex = n - 1;
    int minIndex = 0;
    int maxElement = arr[maxIndex] + 1; // Adding 1 to make sure no conflict occurs with existing elements

    // Traverse the array
    for (int i = 0; i < n; i++) {
      // At odd index, we store the maximum elements
      if (i % 2 == 0) {
        arr[i] += (arr[maxIndex] % maxElement) * maxElement;
        maxIndex--;
      } else {
        // At even index, we store the minimum elements
        arr[i] += (arr[minIndex] % maxElement) * maxElement;
        minIndex++;
      }
    }

    // Modifying the array to get the rearranged elements
    for (int i = 0; i < n; i++) {
      arr[i] = arr[i] / maxElement;
    }
  }

  // Utility function to print an array
  public static void printArray(int[] arr) {
    for (int i : arr) System.out.print(i + " ");
    System.out.println();
  }

  // Main method to test the rearrangeArray function
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    System.out.println("Original array:");
    printArray(arr);
    rearrangeArray(arr);
    System.out.println("Array rearranged in Max/Min form:");
    printArray(arr);
  }
}
