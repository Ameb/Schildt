/*Schildt p.132
  return operator
*/
class Return {
  public static void main(String args[]) {
    boolean t = true;
    
    System.out.println("Before return");
   
    if(t) return;    //возврат в вызывающую программу
 
    System.out.println("Этот оператор никогда не выведется");
  }
}
