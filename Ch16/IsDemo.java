// Demonstrate several Is… methods.

package Schildt.Ch16;

class IsDemo {
  public static void main(String args[]) {
    char a[] = { 'a', 'b', '5', '?', 'A', ' ' };
    
    for(int i=0; i<a.length; i++) {
      if(Character.isDigit(a[i]))
        System.out.println(a[i] + " is a digit.");
      if(Character.isLetter(a[i]))
        System.out.println(a[i] + " is a letter.");
      if(Character.isWhitespace(a[i]))
        System.out.println(a[i] + " is whitespace.");
      if(Character.isUpperCase(a[i]))
        System.out.println(a[i] + " is lowercase.");
     // Character.toTitleCase(a[i]);  // What is TitleCase ?
     // System.out.println(a[i]);
      System.out.println(Character.digit(a[i], 2));
    }
  }
}
