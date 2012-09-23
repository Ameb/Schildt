/* my
   factorial
*/

  class Factorialloop {
  public static void main(String args[]) {
    int x;
	int f;
	x = 6;
	f = 1;
	
	for(int i = 1; i < (x+1); i++) 
	  f = f * i;
	  
	System.out.println("\n" + x + "! = " + f);
  }
}