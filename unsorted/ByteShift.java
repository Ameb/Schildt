//29 Schildt p.93
//Левый сдвиг byte-значения.
class ByteShift {
 public static void main(String args[]) {
  byte a = 64, b;
  int i;

  i = a << 2;
  b = (byte) (a<<2); //явное приведение типа в byte

  System.out.println("Исходное значение a: " + a);
  System.out.println("i и b: " + i + " " + b);
 }
}
