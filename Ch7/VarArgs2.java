/* Schildt Ch7 varargs.
   Use varargs with standard arguments.
*/
package Schildt.Ch7;

class VarArgs2 {
  static void vaTest(String msg, int ... v) {
    System.out.print(msg + v.length + " Contents: ");

    for(int x : v)
      System.out.print(x + " ");
    System.out.println();
  }

  public static void main(String args[]) 
  {
    // Notice how vaTest() can be called with a
    // variable number of argument.
    
    vaTest("One vararg: ", 10); // 1 arg
    vaTest("Three varargs: ", 1, 2, 3); // 3 args 
    vaTest("No varargs: "); // no args
  }
}
