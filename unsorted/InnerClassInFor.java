/* Schildt p.184
   Определение внутреннего класса в цикле for.
*/
class Outer {
  int outer_x = 100;

  void test() {
    for(int i=0; i<10; i++) {
      class Inner {
        void display() {
          System.out.println("В цикле for в методе display: outer_x = " + outer_x);
        }
      }
      Inner inner = new Inner();
      inner.display();
    }
  }
}

class InnerClassInFor {
  public static void main(String args[]) {
    Outer outer = new Outer();
    outer.test();
  }
}
