/* Schildt Ch13
   Compute the hypotenuse of a right triangle.
*/
package Schildt.Ch13;
import java.util.*;

class Hypot {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    double side1, side2;
	double hypot;
	System.out.print("Enter side1 value: ");
	side1 = s.nextDouble();
	System.out.println();
	System.out.print("Enter side2 value: ");
	side2 = s.nextDouble();
	System.out.println();
	
	/* Notice how sqrt() and pow() must be qualified by
	   their class name, which is Math. */
	hypot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
	
	System.out.println("Given sides of lengths " + side1 + " and " + 
	                   side2 + " the hypotenuse is " + hypot);
  }
}