/* Schildt p.178
   Static
*/
class StaticDemo {
  static int a = 42;
  static int b = 99;
  final int BIG_ONES = 1000;
  static void callme() {
    System.out.println("a = " + a);
  }
  void callfinal() {
    System.out.println("BIG_ONES = " + BIG_ONES);
  }
}
class StaticByName {
  public static void main(String args[]) {
    StaticDemo.callme();
    System.out.println("b = " + StaticDemo.b);
    
    StaticDemo sd = new StaticDemo();
    sd.callfinal();
  }
}
