/* Schildt Ch13
   Display a text file.

   This version of the ShowFile program uses a try-with-resources
   statement to automatically close a file after it is no longer needed.

   Note: This code requires JDK 7 or later.

   To use this program, specify the name
   of the file that you want to see.
   For example, to see a file called TEST.TXT,
   use the following command line.

   java ShowFile2 TEST.TXT

   This variation wraps the code that opens and
   accesses the file within a single try block.
   The file is closed by the finally block.
*/
package Schildt.Ch13;
import java.io.*;

class ShowFile2 {
  public static void main(String args[])
  {
    int i;
    
    // First, confirm, that a filename has been specified.
    if(args.length != 1) {
      System.out.println("Usage: ShowFile filename");
      return;
    }

    // The following code uses a try-with-resources statement to open
    // a file and then automatically close it when the try block is left.
    try (FileInputStream fin = new FileInputStream(args[0])) {
         
      do {
        i = fin.read();
        if(i != -1) System.out.print((char) i);
      } while(i != -1);

    } catch (FileNotFoundException e) {
      System.out.println("File Not Found." + e);
    } catch(IOException e) {
      System.out.println("An I/O Error Occured");
    }
  }
}
