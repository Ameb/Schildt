/* Schildt p.142
   Эта программа включает метод внутрь класса Box.
*/
class Box {
  double width;
  double height;
  double depth;

  //показать объем блока
  void volume() {
    System.out.print("Volume = ");
    System.out.println(width*height*depth);
  }
}

class BoxDemo3 {
  public static void main(String args[]) {
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    
    //присвоить значения переменным экземпляра 1
    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 15;
 
    //присвоить значения переменным экземпляра 2
    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;
  
    //показать объем первого блока
    mybox1.volume();
   
    //показать объем второго блока
    mybox2.volume();
  }
}
