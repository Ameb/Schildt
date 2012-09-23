/* Schildt p.205
   Демонстрирует порядок вызова конструкторов
*/

// Создать суперкласс A.
class A {
  A() {
    System.out.println("Внутри А-конструктора.");
  }
}

// Создать подкласс B расширением А.
class B extends A {
  B() {
    System.out.println("Внутри В-конструктора");
  }
}

//Создать подкласс C расширением B.
class C extends B {
  C() {
    System.out.println("Внутри C-конструктора");
  }
}

class CallingCons {
  public static void main(String args[]) {
    C c = new C();
  }
}
