/* Schildt p.169
   Возврат объекта
*/
class TestRet {
  int a;

  TestRet(int a) {
    this.a = a;
  }

  TestRet incrByTen() {
    TestRet temp = new TestRet(a+10);
    return temp;
  }
}

class RetOb {
  public static void main(String args[]) {
    TestRet ob1 = new TestRet(2);
    TestRet ob2;

    ob2 = ob1.incrByTen();
    System.out.println("ob1.a: " + ob1.a);
    System.out.println("ob2.a: " + ob2.a);

    ob2 = ob2.incrByTen();
    System.out.println("ob2.a после повторного увеличения: " + ob2.a);
  }
}
