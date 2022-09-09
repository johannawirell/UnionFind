public class index {

  public static void main(String[] args) {
    Math m = new Math();
    View v = new View();

    // 2 + 7 = 9   
    v.printArrayList(m.twosum(new int[]{ 2, 7, 11, 15 }, 9));
    
    // 11 + (-4) = 7 && 2 + 5 = 7    
    v.printArrayList(m.twosum(new int[]{ 3, 5, 2, -4, 8, 11 }, 7));
  }
}
