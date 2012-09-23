/* Convert an integer into binary, hexadecimal,
   and octal.
*/

package Schildt.Ch16;

class StringConversions {
  public static void main(String args[]) {
    int num = 32748;
    System.out.println(num + " in binary: " + Integer.toBinaryString(num));
    
    System.out.println(num + " in octal: " + Integer.toOctalString(num));
    
    System.out.println(num + " in hexadecimal: " + Integer.toHexString(num));
    
  }
}
