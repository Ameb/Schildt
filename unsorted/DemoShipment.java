/* Schildt p. 201 
   Расширить BoxWeight для включения стоимости отгрузки
*/

// Начать с класса Box.
class Box {
  private double width;
  private double height;
  private double depth;

  // создать клон объекта
  Box(Box ob) {         // передать объект конструктору
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }

  // конструктор, использующий все размеры
  Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }

  // конструктор, не использующий размеров
  Box() {      // использовать -1 для указания неинициализированного блока
    width = -1;
    height = -1;
    depth = -1; 
  }

  // конструктор для создания куба
  Box(double len) {
    width = height = depth = len;
  }

  // вычислить и возвратить объем
  double volume() {
    return width * height * depth;
  }
}

// добавить вес
class BoxWeight extends Box {
  double weight;   // вес блока

  // создать клон объекта
  BoxWeight(BoxWeight ob) {   // передать объект конструктору
  super(ob);
  weight = ob.weight;
  }

  // конструктор, использующий все специфицированные параметры
  BoxWeight(double width, double height, double depth, double m) {
    super(width, height, depth);  // вызвать конструктор суперкласса
    weight = m;
  }

  // конструктор по умолчанию
  BoxWeight() {
    super();
    weight = -1;
  }

  // конструктор для создания куба
  BoxWeight(double len, double m) {
    super(len);
    weight = m;
  }
}

// добавить стоимость отгрузки
class Shipment extends BoxWeight {
  double cost; 
  
  // создать клон объекта
  Shipment(Shipment ob) {
    super(ob);
    cost = ob.cost; 
  }

  // конструктор для всех специфицированных параметров
  Shipment(double width, double height, double depth, double m, double cost) {
    super(width, height, depth, m);
    this.cost = cost;
  }

  // конструктор по умолчанию
  Shipment() {
    super();
    cost = -1;
  }

  // конструктор для куба
  Shipment(double len, double m, double cost) {
    super(len, m);
    this.cost = cost;
  }
}

class DemoShipment {
  public static void main(String args[]) {
    Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
    Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

    double vol;

    vol = shipment1.volume();
    System.out.println("Объем shipment1 = " + vol);
    System.out.println("Вес shipment1 = " + shipment1.weight);
    System.out.println("Стоимость отгрузки: $" + shipment1.cost);
    System.out.println();

    vol = shipment2.volume();
    System.out.println("Объем shipment2 = " + vol);
    System.out.println("Вес shipment2 = " + shipment2.weight);
    System.out.println("Стоимость отгрузки: $" + shipment2.cost);
    System.out.println(); 
  }
}
