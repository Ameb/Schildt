/* Schildt p.180
   Улучшенный Stack-класс, который использует length-элемент массива.
*/
class Stack {
  private int stck[];
  private int tos;

  // выделить память и инициализировать стек
  Stack(int size) {
    stck = new int[size];
    tos = -1;
  }

  // поместить элемент в стек
  void push(int item) {
    if(tos==stck.length-1)    //использовать length-член
      System.out.println("Stack is full");
    else
      stck[++tos] = item;
  }

  //вытолкнуть элемент из стека
  int pop() {
    if(tos < 0) {
      System.out.println("Stack is empty");
      return 0;
    }
    else 
      return stck[tos--];
  }
}

class TestStack2 {
  public static void main(String args[]) {
    Stack mystack1 = new Stack(5);
    Stack mystack2 = new Stack(8);

    // поместить несколько чисел в стек
    for(int i=0; i<5; i++) mystack1.push(i);
    for(int i=0; i<8; i++) mystack2.push(i);

    // вытолкнуть эти элементы из стека
    System.out.println("Stack in mystack1:");
    for(int i=0; i<5; i++)
      System.out.println(mystack1.pop());

    System.out.println("Stack in mystack2:");
    for(int i=0; i<8; i++)
      System.out.println(mystack2.pop());
  }
}
