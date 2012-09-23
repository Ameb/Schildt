/* Schildt p.241
   One interface can extend another
*/

interface Ai {
  void meth1();
  void meth2();
}

// Bi now includes meth1() and meth2() -- it adds meth3().
interface Bi extends Ai {
  void meth3();
}

// This class must implement all of Ai and Bi
class MyClass implements Bi {

  public void meth1() {
    System.out.println("Implement meth1().");
  }
    
  public void meth2() {
    System.out.println("Implement meth2().");
  }
  
  public void meth3() {
    System.out.println("Implement meth3().");
  }
}

class IFExtend {
  public static void main(String arg[]) {
    MyClass ob = new MyClass();
	
    ob.meth1();
	ob.meth2();
	ob.meth3();
  }
}