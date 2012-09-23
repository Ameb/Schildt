// Demonstrate findInLine().
package Schildt.Ch18;
import java.util.*;

class FindInLineDemo {
	public static void main(String args[]) {
		String instr = "Name: Tom Age: 28 ID: 77";
		
		try (Scanner conin = new Scanner(instr)) {
			
			// Find and display age.
			conin.findInLine("Age:");  // Find Age
			
			if(conin.hasNext())
				System.out.println(conin.next());
			else
				System.out.println("Error!");
		}
	}
}
