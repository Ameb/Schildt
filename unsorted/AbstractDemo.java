/* Schildt p.214
   ������� ������������ ���������� java
*/
abstract class A {
  abstract void callme();
  
// � ����������� ������� ��������� ������� ������
  void callmetoo() {
    System.out.println("��� ���������� �����");
  }
}

class B extends A {
  void callme() {
    System.out.println("B - ���������� callme");
  }
}

class AbstractDemo {
  public static void main(String args[]) {
    B b = new B();
    
    b.callme();
    b.callmetoo();
  }
}  