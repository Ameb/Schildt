/* Schildt p. 155
   Этот класс определяет стек целых чисел для хранения 10 значений
*/
class Stack {
  int stck[] = new int[10];
  int tos;

  //инициализировать вершину стека
  Stack() {
    tos = -1;
  }

  //поместить элемент в стек
  void push(int item) {
    if(tos==9)
      System.out.println("- Стек заполнен.");
    else stck[++tos] = item;
  }

  //извлечь элемент из стека
  int pop() {
    if(tos < 0) {
      System.out.println("- Стек пуст.");
      return 0;
    }
    else 
      return stck[tos--];
  }
}
