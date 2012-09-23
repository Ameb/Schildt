//4
/* Демонстрирует оператор if
*/
class IfSample {
 public static void main(String args[]) {
  int x, y;
  x=10;
  y=20;
  if(x<y) System.out.println("x меньше чем y");

  x=x*2;
  if(x==y) System.out.println("x равно y");
  
  x=x*2;
  if(x>y) System.out.println("x больше чем y");

  // следующий оператор не выводит свое сообщение
  if(x == y) System.out.println("вы ничего не увидите");
  }
} 
