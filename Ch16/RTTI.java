// Demonstrate Run-Time Type Information.

package Schildt.Ch16;

class X {
  int a;
  float b;
}
class Y extends X {
  double c;
}

class RTTI {
  public static void main(String args[]) {
    X x = new X();
    Y y = new Y();
    Class<?> clObj;
    
    clObj = x.getClass();  // get Class reference
    System.out.println("x is object of type: " + clObj.getName());
    
    clObj = clObj.getSuperclass();
    System.out.println("x's superclass is " + clObj.getName());
    
    clObj = y.getClass();
    System.out.println("y is object of type: " + clObj.getName());
    
    clObj = clObj.getSuperclass();
    System.out.println("y's superclass is " + clObj.getName());
  }
}
