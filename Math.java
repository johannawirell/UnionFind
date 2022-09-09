import java.util.ArrayList;

public class Math {
  public ArrayList<Integer[]> twosum(int[] arr, int target) {
    ArrayList<Integer[]> res = new ArrayList<Integer[]>();

    // Time complexity O(n^2)
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          res.add(new Integer[] { arr[i], arr[j] });
        }
      }
    }
    return res;
  }

  // public int[] twosum(int[] arr, int target) {
  //   ArrayList<int[]> res = new ArrayList<int[]>();

  //   // Time complexity O(n^2)
  //   for (int i = 0; i < arr.length; i++) {
  //     for (int j = i + 1; j < arr.length; j++) {
  //       if (arr[i] + arr[j] == target) {
  //         return new int[] { arr[i], arr[j] };
  //       }
  //     }
  //   }
  //   return new int[]{};
  // }
}
