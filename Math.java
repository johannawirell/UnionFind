import java.util.ArrayList;

public class Math {
  public ArrayList<Integer[]> twosum(int[] arr, int target) {
    int n = arr.length;
    ArrayList<Integer[]> res = new ArrayList<Integer[]>();

    // Time complexity O(n^2)
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i] + arr[j] == target) {
          res.add(new Integer[] { arr[i], arr[j] });
        }
      }
    }
    return res;
  }

  public ArrayList<Integer[]> threesum(int[] arr, int target) {
    int n = arr.length;
    ArrayList<Integer[]> res = new ArrayList<Integer[]>();

    // Time complexity O(n^3)
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          if (arr[i] + arr[j] + arr[k] == target) {
            res.add(new Integer[] { arr[i], arr[j], arr[k] });
          }
        }
      }
    }
    return res;
  }
}
