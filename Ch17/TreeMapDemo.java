// TreeMap.

package Schildt.Ch17;

import java.util.*;

class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a tree map
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		
		// Put elements to the map.
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.32));
		tm.put("Jane Baker", new Double(1389.44));
		tm.put("Tod Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-16.55));
		
		// Get a set of the entries.
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		
		// Display the elements.
		for(Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();
		
		// Deposit 1000 into John Doe's account.
		double balance = tm.get("John Doe");
		tm.put("John Doe", balance + 1000);
		
		System.out.println("John Doe's new balance: " + 
		                   tm.get("John Doe"));
	}

}
