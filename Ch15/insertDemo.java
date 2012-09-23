// Schildt Ch15
// Demonstrate insert().

package Schildt.Ch15;

class insertDemo {
  public static void main(String args[]) {
	StringBuffer sb = new StringBuffer("I Java!");
	
	sb.insert(2, "like ");
	System.out.println(sb);
  }
}