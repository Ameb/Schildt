/* Schildt eng 2011
   A nested interface example.
*/
import java.io.*;
import java.util.*;

// This class contains a member interface.
class Aa {
  // this is a nested interface
  public interface NestedIF {
    boolean isNotNegative(int x);
  }
}

// Ba implements the nested interface.
class Ba implements Aa.NestedIF {
  public boolean isNotNegative(int x) {
    return x < 0 ? false: true;
  }
}

class NestedIFDemo {
  public static void main(String[] args) {
  
    // use a nested interface reference
	Aa.NestedIF nif = new Ba();
	Scanner in = new Scanner(System.in);
	PrintWriter out = new PrintWriter(System.out);
	System.out.println("Enter number:");
	int x = in.nextInt();
	if(nif.isNotNegative(x))
	  System.out.println("number is positive");
	  else System.out.println("number is negative");
	 
	out.flush();
  }
}