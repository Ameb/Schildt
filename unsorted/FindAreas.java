/* Schildt p.211
   ������������� ������������ ������� ����������
*/
class Figure {
  double dim1, dim2;
  
  Figure(double dim1, double dim2) {
    this.dim1 = dim1;
	this.dim2 = dim2;
  }
  double area() {
    System.out.println("������� Figure �� ����������");
	return 0;
  }
}

class Rectangle extends Figure {
  Rectangle(double dim1, double dim2) {
    super(dim1, dim2);
  }
  // �������������� area ��� ��������������
  double area() {
    System.out.println("Inside area for Rectangle");
	return dim1*dim2;
  }
}

class Triangle extends Figure {
  Triangle(double dim1, double dim2) {
    super(dim1, dim2);
  }
  // �������������� area ��� �������������� ������������
  double area() {
    System.out.println("Inside area for Triangle");
	return dim1*dim2/2;
  }
}

class FindAreas {
  public static void main(String args[]) {
    Figure f = new Figure(10, 10);
	Rectangle r = new Rectangle(9, 5);
	Triangle t = new Triangle(10, 8);
	
	Figure figref;
	
	figref = r;
	System.out.println("������� ����� " + figref.area());
	
	figref = t;
	System.out.println("������� ����� " + figref.area());
	
	figref = f;
	System.out.println("������� ����� " + figref.area());
  }
}