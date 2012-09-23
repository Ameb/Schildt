/* x=(4 + 7) - 1 - всего банок
   a = x - 4  - сколько не прострелил первый
   b = x - 7  - сколько не прострелил другой
*/
import java.io.*;
import java.util.*;

class Bandits {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    int a = in.nextInt();
    int b = in.nextInt();
	int bottles = a + b - 1;
	out.println((bottles - a) + " " + (bottles - b));
	out.flush();
  }
}