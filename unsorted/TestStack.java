/* my, Schildt p.156
   Тест стека
*/
class TestStack {
  public static void main(String args[]) {
  int i,j,k,n;
  Stack stack1 = new Stack();
  Stack stack2 = new Stack();
  
  System.out.print("Запись в стек 1: ");
  for(i=0; i<12; i++) {
    System.out.print(i + " ");
    stack1.push(i);
  }

  System.out.print("Запись в стек 2: "); 
  for(j=10; j<22; j++) {
    System.out.print(j + " ");
    stack2.push(j);
  }
  
  System.out.print("Извлечение из стека 1: ");
  for(k=0; k<11; k++) {
    System.out.print(stack1.pop() + " ");
  }

  System.out.print("Извлечение из стека 2: ");
  for(n=0; n<11; n++) {
    System.out.print(stack2.pop() + " ");
  }  
  
  }
}   
