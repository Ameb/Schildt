/* Schildt p.172
   Другой пример использования рекурсии
*/
class RecTest {
  int values[];
  
  RecTest(int i) {
    values = new int[i];
  }

  // отобразить массив рекурсивно
  void printArray (int i) {
    if(i==0) return;
    else printArray(i-1);
    System.out.println("[" + (i-1) + "]" + values[i-1]);
  }
}

class Recursion2 {
  public static void main(String args[]) {
    RecTest ob = new RecTest(10);
    int i;

    for(i=0; i<10; i++) ob.values[i] = i;

    ob.printArray(10);
  }
}
