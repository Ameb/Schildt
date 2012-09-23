//25.
//Демонстрирует операцию %
class Modulus {
 public static void main(String args[]) {
  int x=42;
  double y=78;
  int a = 323;
  a %= 256;
  
  System.out.println("323 mod 256 = " + a); 
  System.out.println("x mod 10 = " + x % 10);
  System.out.println("y mod 33 = " + y % 33);
 }
} 