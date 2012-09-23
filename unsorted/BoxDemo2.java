/* Schildt p.137
   Box-class
   Filename: BoxDemo2.java
*/
class Box {
  double width;
  double height;
  double depth;
}

// Этот класс объявляет объекты типа Box.
class BoxDemo2 {
  public static void main(String args[]) {
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol;

    // присвоить значения экземплярным переменным объекта mybox1
    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 15;

    // присвоить значения экземплярным переменным объекта mybox2
    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;

    //Вычислить объем блока 1
    vol = mybox1.width * mybox1.height * mybox1.depth;

    System.out.println("Volume = " + vol);

    //Вычислить объем блока 2
    vol = mybox2.width * mybox2.height * mybox2.depth;

    System.out.println("Volume = " + vol);
  }
}
