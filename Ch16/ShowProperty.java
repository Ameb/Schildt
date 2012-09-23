// Environment properties

package Schildt.Ch16;

class ShowProperty {
  public static void main(String args[]) {
    System.out.println(System.getProperty("user.dir"));
    System.out.println(System.getProperty("java.class.path"));
    System.out.println(System.getProperty("java.class.version"));
    System.out.println(System.getProperty("java.vendor"));
    System.out.println(System.getProperty("java.version"));
    System.out.println(System.getProperty("java.vm.name"));
    System.out.println(System.getProperty("os.name"));
    System.out.println(System.getProperty("os.version"));
    System.out.println(System.getProperty("os.arch"));
  }
}
