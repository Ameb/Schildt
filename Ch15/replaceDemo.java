// Schildt Ch15
// Demonstrate replace()

package Schildt.Ch15;

class replaceDemo {
  public static void main(String args[]) {
    StringBuffer sb = new StringBuffer("This is a test.");
	System.out.println(sb);
	sb.replace(5, 7, "was");
	System.out.println(sb);
  }
}