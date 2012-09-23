/* Schildt p.215
   Использование полиморфизма времени выполнения с абстрактными методами
*/
abstract class Figure {
  double dim1, dim2;
  
  Figure(double dim1, double dim2) {
    this.dim1 = dim1;
	this.dim2 = dim2;
  }
  abstract double area();   // area abstract method now 
}

class Rectangle extends Figure {
  Rectangle(double dim1, double dim2) {
    super(dim1, dim2);
  }
  // переопределить area для прямоугольника
  double area() {
    System.out.println("Inside area for Rectangle");
	return dim1*dim2;
  }
}

class Triangle extends Figure {
  Triangle(double dim1, double dim2) {
    super(dim1, dim2);
  }
  // переопределить area для прямоугольного треугольника
  double area() {
    System.out.println("Inside area for Triangle");
	return dim1*dim2/2;
  }
}

class AbstractAreas {
  public static void main(String args[]) {
//  Figure f = new Figure(10, 10);          Теперь незаконно
	Rectangle r = new Rectangle(9, 5);
	Triangle t = new Triangle(10, 8);
	
	Figure figref;                       // Ок, Объект не создается
	
	figref = r;
	System.out.println("Площадь равна " + figref.area());
	
	figref = t;
	System.out.println("Площадь равна " + figref.area());
  }
}