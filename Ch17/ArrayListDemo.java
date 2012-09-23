// Demonstrate ArrayList.
package Schildt.Ch17;

import java.util.*;

class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array list.
		long start, end;
		ArrayList<String> al = new ArrayList<String>();
		al.ensureCapacity(10);
		
		System.out.println("Initial size of al: " + al.size());
		start = System.nanoTime();	
		// Add elements to the array list.
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		end = System.nanoTime();
		System.out.println("Size of al after additions: " + al.size());
		System.out.println("Elapsed time: " + (end-start));
		
		// Display the array list.
		System.out.println("Contents of al: " + al);
		
		// Remove elements from the array list.
		al.remove("F");
		al.remove(2);
		
		System.out.println("Size of al after deletions: " + al.size());
		
		System.out.println("Contents of al: " + al);
		
		al.trimToSize();
		System.out.println("Size of al after trimToSize: " + al.size());
	}

}
