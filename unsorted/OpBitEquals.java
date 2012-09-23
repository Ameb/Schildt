//   Schildt p.98
//Поразрядные операции присваивания
class OpBitEquals {
 public static void main(String args[]) {
  int a=1, b=2, c=3;
  
  System.out.println("a = " + a);
  a |=4;
  System.out.println("a = " + a);
  b >>=1;
  c <<=1;
  a ^= c;
  System.out.println("a = " + a);
  System.out.println("b = " + b);
  System.out.println("c = " + c);
 }
}