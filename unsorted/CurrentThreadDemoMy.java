/* Schildt p.268
   Controlling the main thread */
class CurrentThreadDemo {
  public static void main(String args[]) {
    Thread t = Thread.currentThread();
	
	System.out.println("Current thread: " + t);
	
	// change the name of the thread
	t.setName("My Thread");
	System.out.println("After name change: " + t);
	
	
	  for(int n = 5; n > 0; n--) {
	    System.out.println(n);
		Thread.sleep(1000);
      }
	
  }
}