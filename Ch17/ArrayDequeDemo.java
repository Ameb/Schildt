// Demonstrate ArrayDeque.

package Schildt.Ch17;

import java.util.*;

class ArrayDequeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an array deque.
		ArrayDeque<String> adq = new ArrayDeque<String>();
		
		// Use an ArrayDeque like a stack.
		adq.push("A");
		adq.push("C");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.print("Popping the stack: ");
		
		while(adq.peek() != null)
			System.out.print(adq.pop() + " ");
		
		System.out.println();
	}

}
