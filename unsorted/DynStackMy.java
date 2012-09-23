/* Schildt p.237
   Implement a "growable" stack.
*/
class DynStackMy implements IntStack {
  private int stck[];
  private int tos;
  
  // allocate and initialize stack
  DynStackMy(int size) {
    stck = new int[size];
	tos = -1;
  }
  
  // Push an item onto the stack
  public void push(int item) {
    // if stack is full, allocate a larger stack
	if(tos==stck.length-1) {
	  stck.length *= 2; // DON'T WORK, length is final double size
	 
	  stck[++tos] = item;
	}
	else
	  stck[++tos] = item;
  }
  
  // Pop an item from the stack
  public int pop() {
    if(tos<0) {
	  System.out.println("Stack underflow.");
	  
	  return 0;
	}
	else
	  return stck[tos--];
  }
}