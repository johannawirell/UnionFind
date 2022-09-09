import java.util.ArrayList;

public class View {

  public String printArray(Integer[] arr) {
    String res = "[";

    for (int i = 0; i < arr.length; i++) {
      res += Integer.toString(arr[i]) + ", ";
    }

    // Replace last "," with "]"
    res = res.substring(0, res.length() - 2) + "] ";

    return res;
  }

  public void printArrayList(ArrayList<Integer[]> arrList){
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

}
