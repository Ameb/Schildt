/* Schildt p.122
   Comma using
*/
class Comma {
  public static void main(String args[]) {
    int a,b;
    for(a=1,b=10; a<b; a++, b--) 
	  System.out.println("a = " + a + "," + " b = " + b);
  }
}  