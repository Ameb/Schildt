/* Schildt p.127
   "break" using on nested loops
*/
class BreakLoop3 {
  public static void main(String args[]) {
    for(int i=0; i<3; i++) {
      System.out.print("Iteration " + i + ": ");
	  for(int j=0; j<100; j++) {
	    if(j == 10) break;  //end loop if j=10
		System.out.print(j + " ");
	  }
	  System.out.println();
	}
	System.out.println("End loop");
  }
}
		