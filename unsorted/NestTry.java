/* Schildt
an example of nested try statements
*/
class NestTry {
  public static void main(String args[]) {
    try {
	  int a = args.length;
	  
	  /* if no command-line arguments are present,
	     the following statement will generate
		 a divide-by-zero exception.
	  */
	  int b = 42 / a;
	  
	  System.out.println("a = " + a);
	  
	  try {  // nested try block
	      /* If one arg is used, then a divide-by-zero
		     exception will be generated by the following code. */
	    if(a==1) a = a/(a-a);  // division by zero
	  
	    /* If two args are used,
	     then generate an out-of-bounds exception. */
	    if(a==2) {
	      int c[] = { 1 };
		  c[42] = 99;  // generates an out-of-bounds exception
	    }
	  }  catch(ArrayIndexOutOfBoundsException e) {
	     System.out.println("Array index out of bounds: " + e);
	  }
	}  catch(ArithmeticException e) {
	   System.out.println("Divide by 0: " + e);
	}
  }
}