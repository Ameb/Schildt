/* Schildt p.147
   Эта программа использует параметризованный метод
*/
class Box {
  double width;
  double height;
  double depth;

  // вычислить и возвратить объем
  double volume() {
    return width * height * depth;
  }

  //установить размеры блока
  void setDim(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
}

class BoxDemo5 {
  public static void main(String args[]) {
    Box mybox1, mybox2;
    mybox1 = new Box();
    mybox2 = new Box();
    

    //инициализировать каждый блок
    mybox1.setDim(10, 20, 15);
    mybox2.setDim(3, 6, 9);

    // получить объем первого блока
    System.out.println("Volume mybox1 = " + mybox1.volume());

    // получить объем второго блока
    System.out.println("Volume mybox2 = " + mybox2.volume());
  }
}
