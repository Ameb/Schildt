/* x=(4 + 7) - 1 - ����� �����
   a = x - 4  - ������� �� ���������� ������
   b = x - 7  - ������� �� ���������� ������
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