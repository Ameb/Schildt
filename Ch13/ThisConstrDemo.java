/* Schildt Ch13.
   Invoking overloaded constructors through this(). 
*/
package Schildt.Ch13;

class MyClass {
  int a;
  int b;

  // initialize a and b individually
  MyClass(int a, int b) {
    this.a = a;
    this.b = b;
  }

  // initialize a and b to the same value
  MyClass(int a) {
    this(a, a);  // invokes MyClass(i, i)
  }

  // give a and b default values of 0
  MyClass( ) {
    this(0);  // invokes MyClass(0)
  }
}

class ThisConstrDemo {
  public static void main(String args[]) {
    MyClass mc1;
    mc1 = new MyClass(1, 2);
    System.out.println(mc1.a + " " + mc1.b);
    mc1 = new MyClass(3);
    System.out.println(mc1.a + " " + mc1.b);
    mc1 = new MyClass();
    System.out.println(mc1.a + " " + mc1.b);
  }
}
