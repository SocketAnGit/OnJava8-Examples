// control/ForInInt.java
// �2016 MindView LLC: see Copyright.txt
import static onjava.Range.*;

public class ForInInt {
  public static void main(String[] args) {
    for(int i : range(10)) // 0..9
      System.out.print(i + " ");
    System.out.println();
    for(int i : range(5, 10)) // 5..9
      System.out.print(i + " ");
    System.out.println();
    for(int i : range(5, 20, 3)) // 5..20 step 3
      System.out.print(i + " ");
    System.out.println();
    for(int i : range(20, 5, -3)) // Count down
      System.out.print(i + " ");
    System.out.println();
  }
}
/* Output:
0 1 2 3 4 5 6 7 8 9
5 6 7 8 9
5 8 11 14 17
20 17 14 11 8
*/