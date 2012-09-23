/* Schildt p. 168
   Объекты передаются по ссылке
*/
class TestRef {
  int a, b;

  TestRef(int a, int b) {
    this.a = a;
    this.b = b;
  }

  //Передать объект
  void meth(TestRef s) {
    s.a *= 2;
    s.b /= 2;
  }
}

class CallByRef {
  public static void main(String args[]) {
    TestRef oa = new TestRef(15, 20);
    TestRef ob = new TestRef(60, 80);

    System.out.println("oa.a и oa.b перед вызовом: " + oa.a + " " + oa.b);
    oa.meth(oa);
    System.out.println("oa.a и oa.b после вызова: " + oa.a + " " + oa.b + "\n");

    System.out.println("ob.a и ob.b перед вызовом: " + ob.a + " " + ob.b);
    ob.meth(ob);
    System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
  }
}
