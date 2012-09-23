// Using reverse() to reverse a StringBuffer.

package Schildt.Ch15;

class ReverseDemo {
  public static void main(String args[]) {
	StringBuffer s = new StringBuffer("live");
	System.out.println(s);
	s.reverse();
	System.out.println(s);
  }
}