/* Schildt p.129
   break using for exit from nested loops
*/
class BreakLoop4 {
  public static void main(String args[]) {
    outer: for(int i=0; i<3; i++) {
	  System.out.print("Iteration " +i+": ");
	  for(int j=0; j<100; j++) {
	    if(j==10) break outer; //Exit from 2 loops
		System.out.print(j + " ");
	  }
	  System.out.println("Эта строка никогда не будет выведена");
	}
	System.out.println("End loop");
  }
}