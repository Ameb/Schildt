/* Schildt p.207
   Методы с различными сигнатурами типов перегружаются, 
   а не переопределяются.
*/
class A {
  int i, j;
  
  A(int i, int j) {
    this.i = i;
	this.j = j;
  }
  // показать i и j на экране
  void show() {
    System.out.println("i and j: " + i +", " + j);
  }
}

class B extends A {   // создать подкласс В расширением А
  int k;
  
  B(int i, int j, int k) {
    super(i, j);
	this.k = k;
  }
  // перегруженный show()
  void show(String msg) {
    System.out.println(msg + k);
  }
}

class Override2 {
  public static void main(String args[]) {
    B subOb = new B(1, 2, 3);
	subOb.show("String variable inside method, k = ");  // вызов show() класса В
	subOb.show();                                       // вызов show() класса A
  }
}