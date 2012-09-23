/* Schildt Ch15
   Construct one String from another.
*/

package Schildt.Ch15;

class MakeString {
  public static void main(String args[]) {
    char c[] = { 'J', 'a', 'v', 'a' };
    String s1 = new String(c);
    String s2 = new String(s1);
	String v;
	System.out.println("Use valueOf(): " + String.valueOf(c));
    
    System.out.println(s1);
    System.out.println(s2);
    
    String s3 = new String(c, 1, c.length - 2);
    System.out.println(s3);
    
    // Construct string from subset of byte array.
    byte ascii[] = { 65, 66, 67, 68, 69, 70 };
    System.out.println("Use valueOf(): " + String.valueOf(ascii));
    String s4 = new String(ascii);
    System.out.println(s4 + ", string length: " + s4.length());
    System.out.println("Use valueOf(): " + String.valueOf(s4));
    String s5 = new String(ascii, 2, 3);
    System.out.println(s5);
    
    char ch;
    ch = "compilation".charAt(5);
    System.out.println(ch);
    
    String str = "java";
    System.out.println(str + ", char at 2 is: " + str.charAt(2)); 
    
    String s = "This is a demo of the getChars method.";
    int start = 10;
    int end = 14;
    char buf[] = new char[ end - start ];  // initialize array length
    
    s.getChars(start, end, buf, 0);
    System.out.println(buf);
    System.out.println(s.getBytes());
    
    char buf1[] = new char [ s.length() ]; // create an array 
                                           // with length of string.
    System.out.println(buf1.length);       // display array length.
    buf1 = s.toCharArray();                // convert string characters to array.
    System.out.println(buf1);
    System.out.println(buf1[3]);
    
    // Demonstrate equals() and equalsIgnoreCase()
    String e1 = "Hello";
    String e2 = "Hello";
    String e3 = "Good-bye";
    String e4 = "HELLO";
    
    System.out.println(e1 + " equals " + e2 + " -> " + e1.equals(e2));
    System.out.println(e1 + " equals " + e3 + " -> " + e1.equals(e3));
    System.out.println(e1 + " equals " + e4 + " -> " + e1.equals(e4));
    System.out.println(e1 + " equalsIgnoreCase " + e4 + " -> " 
                       + e1.equalsIgnoreCase(e4));
    System.out.println("------------------------");                   
    // equals() vs ==
    String a1 = "Java";
    String a2 = new String(a1);
    System.out.println(a1 + " equals " + a2 + " -> " + a1.equals(a2));
    System.out.println(a1 + " == " + a2 + " -> " + (a1==a2));
	
	// toUpperCase(), toLowerCase()
	String s6 = "This is a TEST for toUpperCase() and toLowerCase().";
	System.out.println(s6);
	System.out.println(s6.toUpperCase());
	System.out.println(s6.toLowerCase());
	System.out.println(s6);
	s6 = s6.toUpperCase();
	System.out.println(s6);
	
	// replace()
	String s7 = "HelloWorld";
	s7 = s7.replace('l', 'p');
	System.out.println("Using replace(): " + s7);
	s7 = "HelloWorld";
	System.out.println(s7.replace("Hello", "ByeBye"));
  }
}
