public class Twosum {
  private int[] arr;

  public Twosum(int[] l) {
    arr = l;
  }

  public void print() {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public int[] twosum(int target) {
    // Time complexity O(n^2)
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] + arr[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[]{};
  }
}
