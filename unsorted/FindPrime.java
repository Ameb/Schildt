/*Schildt p.121
  ������� �����
*/
import java.io.*;
import java.util.*;
class FindPrime {
 public static void main(String args[]) {
  Scanner in = new Scanner(System.in);
  PrintWriter out = new PrintWriter(System.out);
  System.out.println("������� �����: ");
  int num = in.nextInt();
  boolean isPrime = true;
  for(int i=2; i<num/2; i++) {
   if ((num % i) == 0) {
    isPrime = false;
    break;
  }
 }
 if(isPrime) System.out.println("������� �����");
 else System.out.println("����� �� �������� �������");
 }
} 