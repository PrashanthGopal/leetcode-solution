import java.util.HashMap;

public class FindFirstUnique {

  public static int findFirstUniqueBruteForce(int[] arr) {
    if (arr == null || arr.length == 0) {
      return -1;
    }
    boolean isRepeated = false;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length; j++) {
        if (i != j && arr[i] == arr[j]) {
          isRepeated = true;
          break;
        }
      }
      if (!isRepeated) {
        return arr[i];
      }
      isRepeated = false;
    }
    return -1;
  }

  public static int findFirstUnique(int[] arr) {
    if (arr == null || arr.length == 0) {
      return -1;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int val : arr) {
      if (map.containsKey(val)) {
        map.put(val, map.get(val) + 1);
      } else {
        map.put(val, 1);
      }
    }
    for (int val : arr) {
      int occurances = map.get(val);
      if (occurances == 1) {
        return val;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int bruteForceResult = findFirstUniqueBruteForce(
      new int[] { 9, 2, 3, 2, 6, 6 }
    );

    System.out.println(bruteForceResult);

    int result = findFirstUniqueBruteForce(new int[] { 9, 2, 3, 2, 6, 6 });
    System.out.println(result);
  }
}
