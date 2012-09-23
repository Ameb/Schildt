/* Schildt p.206
   ��������������� �������
*/
class A {
  int i, j;
  
  A(int i, int j) {
    this.i = i;
	this.j = j;
  }
  // �������� i � j �� ������
  void show() {
    System.out.println("i and j: " + i +", " + j);
  }
}

class B extends A {
  int k;
  
  B(int i, int j, int k) {
    super(i, j);
	this.k = k;
  }
  void show() {
    super.show();     //����� show() ����������� �
	System.out.println("k: " + k);
  }
}

class Override {
  public static void main(String args[]) {
    B subOb = new B(1, 2, 3);
	subOb.show();    //����� show() �� B
  }
}