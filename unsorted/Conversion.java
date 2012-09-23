//18. Schildt p.70
// Демонстрирует приведения типов.
class Conversion {
 public static void main(String args[]) {
  byte b;
  int i = 257;
  double d = 323.142;

  System.out.println("\nПриведение int к byte.");
  b = (byte) i;
  System.out.println("i и b " + i + " " + b);
  System.out.println("\nПриведение double к int.");
  i = (int) d;
  System.out.println("d и i " + d + " " + i);
  System.out.println("\nПриведение double к byte.");
  b = (byte) d;
  System.out.println("d and b " + d + " " + b);
 }
}
