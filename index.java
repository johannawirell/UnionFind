public class index {

  public static void main(String[] args) {
    Math m = new Math();
    View v = new View();

    // 2sum: [2 + 7] = 9   
    v.printArrayList(m.twosum(new int[]{ 2, 7, 11, 15 }, 9));
    
    // 2sum: [5 + 2] = 7     && [-4 + 11] = 7 
    v.printArrayList(m.twosum(new int[]{ 3, 5, 2, -4, 8, 11 }, 7));

    // 3sum: [-1 + 0, 1] = 0    &&  [-1 + 2 + -1] = 0      &&  [0 + 1 + -1] = 0
    v.printArrayList(m.threesum(new int[]{ -1, 0, 1, 2, -1, -4 }, 0));
  }
}
