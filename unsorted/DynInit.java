/*14. 
Шилдт JAVA 2 p64
*/
//Демонстрирует динамическую инициализацию
class DynInit {
 public static void main(String args[]) {
  double a = 3.0, b = 4.0;
  
  //переменная динамически инициализирована
  double c = Math.sqrt(a * a + b * b);

  System.out.println("Гипотенуза равна " + c);
 }
}
