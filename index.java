import java.util.ArrayList;

public class index {

  public static String printArray(Integer[] arr) {
    String res = "[";

    for (int i = 0; i < arr.length; i++) {
      res += Integer.toString(arr[i]) + ", ";
    }

    // Replace last "," with "]"
    res = res.substring(0, res.length() - 2) + "] ";

    return res;
  }

  public static void printArrayList(ArrayList<Integer[]> arrList){
    String res = "";

    if (arrList.size() < 1) {
      System.out.println("No elements.");
      return;
    }

    for (int i = 0; i < arrList.size(); i++) {
      Integer[] firstArr = arrList.get(i);
      res += printArray(firstArr);
    }

    System.out.println(res);
  }

  public static void main(String[] args) {
    Math m = new Math();

    // 2 + 7 = 9
    ArrayList<Integer[]> result = m.twosum(new int[]{ 2, 7, 11, 15 }, 9);    
    
    printArrayList(result);
    
    // 11 + (-4) = 7 && 2 + 5 = 7
    result = m.twosum(new int[]{ 3, 5, 2, -4, 8, 11 }, 7);    
    
    printArrayList(result);
  }
}
