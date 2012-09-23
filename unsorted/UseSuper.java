/* Schildt p.200
   Использование super для преодоления скрытия имен
*/
class A {
  int i;
}

class B extends A {
  int i;           // этот i скрывает i в A
  
  B(int a, int b) {
    super.i = a;     // i from A
    i = b;            // i from B
  }

  void show() {
    System.out.println("i from superclass: " + super.i);
    System.out.println("i from subclass: " + i);
  }
}

class UseSuper {
  public static void main(String args[]) {
    
    B subOb = new B(1, 2);
    subOb.show();
  }
}
