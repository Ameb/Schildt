// Use Scanner to compute an average of the values.
package Schildt.Ch18;
import java.util.*;

class AvgNums {
	public static void main(String args[]) {
		try (Scanner conin = new Scanner(System.in)) {
		
			int count = 0;
			double sum = 0.0;
			
			System.out.println("Enter numbers to average." + '\7');
			
			// Read and sum numbers.
			while(conin.hasNext()) {
				if(conin.hasNextDouble()) {
					sum += conin.nextDouble();
					count++;
				}
				else {
					String str = conin.next();
					if(str.equals("done")) break;
					else {
						System.out.println("Data format error.");
						return;
					}
				}
			}
			
			
			System.out.println("Average is " + sum / count);
		}
	}
    

}
