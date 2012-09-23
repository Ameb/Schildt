/* Schildt
   Using join() to wait for threads to finish. 
   Set priority. */
class MyThread implements Runnable {
  String name; // name of thread
  Thread t;

  MyThread(String name, int prior) {
    this.name = name;
    t = new Thread(this, name);
    t.setPriority(prior);
    System.out.println("My thread: " + t + " Priority: " + t.getPriority());
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

class MultiThreadJoinDemo {
  public static void main(String args[]) {
    MyThread ob1 = new MyThread("One", 10); // start threads
    MyThread ob2 = new MyThread("Two", 1);
    MyThread ob3 = new MyThread("Three", 7);
        
    System.out.println("Thread One is alive: " + ob1.t.isAlive());
    System.out.println("Thread Two is alive: " + ob2.t.isAlive());
    System.out.println("Thread Three is alive: " + ob3.t.isAlive());

    try { 
      // wait for threads to finish
      System.out.println("Waiting for threads to finish.");
      ob1.t.join();
      ob2.t.join();
      ob3.t.join();
    } catch (InterruptedException e) {
      System.out.println("Main thread interrupted");
    }
    System.out.println("Thread One is alive: " + ob1.t.isAlive());
    System.out.println("Thread Two is alive: " + ob2.t.isAlive());
    System.out.println("Thread Three is alive: " + ob3.t.isAlive());

    System.out.println("Main thread exiting.");
  }
}
