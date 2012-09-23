/* Schildt
   Create multiple threads. */
class MyThread implements Runnable {
  String name;
  Thread t;

  MyThread(String name) {
    this.name = name;
    t = new Thread(this, name);
    System.out.println("My thread: " + t);
    t.start();  // Start the thread
  }

  // This is the entry point for thread.
  public void run() {
    try {
      for(int i = 5; i > 0; i--) {
        System.out.println(name + ": " + i); 
        Thread.sleep(1000);
      }
    } catch (InterruptedException e) {
      System.out.println(name + " interrupted");
    }
    System.out.println(name + " exiting.");
  }
}

class MultiThreadDemo {
  public static void main(String args[]) {
    new MyThread("One"); // start threads
    new MyThread("Two");
    new MyThread("Three");

    try { 
      // wait for other threads to end
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted");
    }
    System.out.println("Main thread exiting.");
  }
}
