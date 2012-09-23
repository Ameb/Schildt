/* Schildt Ch15
   Override toString() for Box class.
*/

package Schildt.Ch15;

class Box {
  double width;
  double height;
  double depth;
  
  Box(double width, double height, double depth) {
    this.width = width;
    this.height = height;
    this.depth = depth;
  }
  
  public String toString() {
    return "Dimensions are " + width + " by " + height + 
           " by " + depth + "."; 
  }
}

class toStringDemo {
  public static void main(String args[]) {
    Box b = new Box(10, 15, 18);
    String s = "Box b: " + b;  // concatenate Box object
    
    System.out.println(b);
    System.out.println(s);
  }
}
