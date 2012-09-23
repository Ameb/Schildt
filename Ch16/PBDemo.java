// ProcessBuilder

package Schildt.Ch16;

class PBDemo {
  public static void main(String args[]) {
    
    try {
      ProcessBuilder proc = new ProcessBuilder("gedit", "testfile.java");
      proc.start();
    } catch (Exception e) {
      System.out.println("Error executing gedit.");
    }
  }
}
