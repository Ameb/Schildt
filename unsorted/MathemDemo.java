/* my
   Factorial in method
*/
class Mathem {
  protected int factorial(int x) {
    int f = 1;
	for(int i = 1; i < (x+1); i++) 
	  f *= i;
	System.out.println("\n" + x + "! = " + f);
	return f;
  }

  protected int square(int x) {
    int f = x * x;
	return f;
  }
}

class MathemDemo {
  public static void main(String args[]) {
    Mathem m = new Mathem();
	int g, s;
	
	g = m.factorial(4);
	System.out.println(g);
	
	s = m.square(5);
	System.out.println(s);
  }
}
  
  