// Demonstrate HashSet.

package Schildt.Ch17;

import java.util.*;

class HashSetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a hash set.
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		
		// Add elements to the hash set.
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		hs.add("F");
		
		System.out.println(hs);
	}

}
