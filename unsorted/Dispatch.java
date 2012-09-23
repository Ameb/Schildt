/* Schildt p.209
   Динамическая диспетчиризация методов
*/
class A {
  void callme() {
    System.out.println("Inside A method callme()");
  }
}
class B extends A {
  void callme() {
    System.out.println("Inside B method callme()");
  }
}
class C extends A {
  void callme() {
    System.out.println("Inside C method callme()");
  }
}

class Dispatch {
  public static void main(String args[]) {
    A a = new A();
	B b = new B();
	C c = new C();
	
	A r;        // define reference of type A
	
	r = a;      // r указывает на объект А
	r.callme(); // вызывает А-версию callme
	
	r = b;      // r указывает на объект B
	r.callme(); // вызывает B-версию callme
	
	r = c;      // r указывает на объект C
	r.callme(); // вызывает C-версию callme
  }
}