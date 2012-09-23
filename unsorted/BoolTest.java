//12
//Демонстрирует булевы значения
class BoolTest {
 public static void main(String args[]) {
  boolean b;
  
  b = false;
  System.out.println("b равно " +b);
  
  b = true;
  System.out.println("b равно " +b);
  
  //булево значение может управлять if-оператором
  if(b) System.out.println("Сравнение выполнено");
  
  b = false;
  if(b) System.out.println("Сравнение не выполнено");
  
  //вывод операции отношения есть булево значение
  System.out.println("10>9 есть " +(10>9));
 }
}