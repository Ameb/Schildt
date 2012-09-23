// Demonstrate TreeSet.

package Schildt.Ch17;

import java.util.*;

class TreeSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a TreeSet.
		TreeSet<String> ts = new TreeSet<String>();
		
		// Add elements to the tree set.
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
		System.out.println(ts);
		System.out.println(ts.subSet("C", "F"));
	}

}
