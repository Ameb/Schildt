/* Schildt p.144 
   Теперь volume возвращает объем блока
*/
class Box {
  double width;
  double height;
  double depth;

  //вычислить и возвратить объем
  double volume() {
    return width * height * depth;
  }
}

class BoxDemo4 {
  public static void main( String args[]) {
    Box mybox1, mybox2;
    mybox1 = new Box();
    mybox2 = new Box();
    
    //присвоить значения переменным экземпляра mybox1
    mybox1.width = 10;
    mybox1.height = 20;
    mybox1.depth = 15;
   
    /*присвоить значения
      переменным экземпляра mybox2*/
    mybox2.width = 3;
    mybox2.height = 6;
    mybox2.depth = 9;

    //получить объем первого блока
    System.out.println("Объем равен " + mybox1.volume());

    //получить объем второго блока
    
    System.out.println("Объем равен " + mybox2.volume());
  }
}
