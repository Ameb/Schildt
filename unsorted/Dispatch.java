/* Schildt p.209
   ������������ ��������������� �������
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
	
	r = a;      // r ��������� �� ������ �
	r.callme(); // �������� �-������ callme
	
	r = b;      // r ��������� �� ������ B
	r.callme(); // �������� B-������ callme
	
	r = c;      // r ��������� �� ������ C
	r.callme(); // �������� C-������ callme
  }
}