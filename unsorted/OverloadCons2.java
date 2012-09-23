/* Schildt p.165
   Здесь Box позволяет одному объекту инициализировать другой.
*/

class Box {
  double width;
  double height;
  double depth;

  //построить клон объекта
  Box(Box ob) {    //переслать объект конструктору 
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

  // конструктор для всех размеров блока
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }

  // конструктор блока без размеров
  Box() {
    width = -1;  //использовать -1 для указания
    height = -1; //неинициализированного 
    depth = -1;  //блока
  }

  // конструктор для куба
  Box(double len) {
    width = height = depth = len;
  }

  // создать и возвратить объем
  double volume() {
    return width * height * depth;
  }
}

class OverloadCons2 {
  public static void main(String args[]) {
  //создать блоки с использованием различных конструкторов
  Box mybox1 = new Box(10, 25, 15);
  Box mybox2 = new Box();
  Box mycube = new Box(7);

  Box myclone = new Box(mybox1);
  
  double vol;

  //получить объем

  vol = mybox1.volume();
  System.out.println("mybox1 volume = " + vol);

  vol = mybox2.volume();
  System.out.println("mybox2 volume = " + vol);

  vol = mycube.volume();
  System.out.println("mycube volume = " + vol);

  vol = myclone.volume();
  System.out.println("clone volume  = " + vol);
  
  }
}
