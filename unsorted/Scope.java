/*15
Шилдт JAVA 2 p66
*/
//Демонстрирует область действия блока
class Scope {
 public static void main(String args[]) {
  int x;   //известна всему коду внутри main
  
  x=10;
  if(x == 10) {   //начало новой области действия
   int y = 20;    //известна только в этом блоке

   //здесь известны x и y
   System.out.println("x и y: " + x + " " + y);
   x=y*2;
  }
  //y=100;          //ошибка! y здесь неизвестна

  // x здесь еще известна
  System.out.println("x равно " + x);
 }
}
