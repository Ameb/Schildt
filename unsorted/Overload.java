/* Schildt p.159
   Overloaded method
*/
class OverloadDemo {
  void test() {
    System.out.println("Параметры отсутствуют");
  }

  // Перегруженный метод с одним int-параметром.
  void test(int a) {
    System.out.println("a: " + a);
  }

  //Перегруженный метод с двумя int-параметрами.
  void test(int a, int b) {
    System.out.println("a и b: " + a + " " + b);
  }

  //Перегруженный метод с double-параметром.
  double test(double a) {
    System.out.println("Вещественное двойной точности a: " + a);
    return a*a; }
}

class Overload {
  public static void main(String args[]) {
    OverloadDemo ob = new OverloadDemo();
    double result;
    
    //вызвать все версии test
    ob.test();
    ob.test(5);
    ob.test(3, 2);
    result = ob.test(123.2);
    System.out.println("Результат ob.test(123.2): " + result);
  }
}
