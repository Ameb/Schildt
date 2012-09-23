/* Schildt p.214
   ѕроста€ демонстраци€ абстракций java
*/
abstract class A {
  abstract void callme();
  
// в абстрактных классах допустимы обычные методы
  void callmetoo() {
    System.out.println("Ёто конкретный метод");
  }
}

class B extends A {
  void callme() {
    System.out.println("B - реализаци€ callme");
  }
}

class AbstractDemo {
  public static void main(String args[]) {
    B b = new B();
    
    b.callme();
    b.callmetoo();
  }
}  