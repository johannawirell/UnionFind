public class index {

  public static void printArray(int[] arr) {
    String res = "[";

    for (int i = 0; i < arr.length; i++) {
      res += Integer.toString(arr[i]) + ", ";
    }

    // Replace last "," with "]"
    res = res.substring(0, res.length() - 2) + "]";

    System.out.println(res);
  }

  public static void main(String[] args) {
    Twosum l = new Twosum(new int[]{2, 7, 11, 15});
    
    printArray(l.twosum(9));
  }
}
