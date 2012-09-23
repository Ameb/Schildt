/* Schildt
   This program is synchronized. */
class Callme {
  void call(String msg) {
    System.out.print("[" + msg);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("Interrupted.");
    }
    System.out.println("]");
  }
}

class Caller implements Runnable {
  String msg;
  Callme target;
  Thread t;

  public Caller(Callme targ, String s, int prior) {
    target = targ;
    msg = s;
    t = new Thread(this);
    t.setPriority(prior);
    t.start();
  }
  // synchronize calls to call()
  public void run() {
    synchronized(target) {  // synchronized block
      target.call(msg);
    }
  }
}

class Synch1 {
  public static void main(String args[]) {
    Callme maintarget = new Callme();
    Caller ob1 = new Caller(maintarget, "Hello", 10);
    try {
      ob1.t.join();
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }

    Caller ob2 = new Caller(maintarget, "Synchronized", 5);
    try {
      ob2.t.join();
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }

    Caller ob3 = new Caller(maintarget, "World", 1);
    // wait for threads to end
    try {
      ob3.t.join();
    } catch (InterruptedException e) {
      System.out.println("Interrupted");
    }
  }
}
