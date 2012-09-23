/* Box-class
   Filename: BoxDemo.java
*/
class Box {
  double width;
  double height;
  double depth;
}

// Этот класс объявляет объект типа Box.
class BoxDemo {
  public static void main(String args[]) {
    Box mybox = new Box();
    double vol;

    // присвоить значения экземплярным переменным объекта mybox
    mybox.width = 10;
    mybox.height = 20;
    mybox.depth = 15;

    //Вычислить объем блока
    vol = mybox.width * mybox.height * mybox.depth;

    System.out.println("Volume = " + vol);
  }
}
