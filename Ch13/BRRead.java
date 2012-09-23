/* Schildt. Chapter 13. I/O
   Use a BufferedReader to read characters from the console. */
package Schildt.Ch13;
import java.io.*;

class BRRead {
  public static void main(String args[]) throws IOException
  {
    char c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter characters, 'q' to quit.");
    // read characters
    do {
       c = (char) br.read();
       System.out.print(c);
    } while(c != 'q');

    System.out.println();
  }
}
