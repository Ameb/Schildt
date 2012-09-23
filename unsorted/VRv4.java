/* VR version 4 with constructors and methods
*/
class V {
  private double voltage;
  V(double voltage) {
    this.voltage = voltage;
  } 
}

class Res {
  private double resistance;
  Res(double resistance) {
    this.resistance = resistance;
  }
}

class VR {
  private double v1, r1;
  V volt1 = new V(v1);
  Res res1 = new Res(r1);

  VR(double v1, double r1) {
  this.v1 = v1;
  this.r1 = r1;
  }

  double current() {
  return v1 / r1;
  }

  double power() {
  return v1 * v1 / r1;
  }
}

class VRv4 {
  public static void main(String args[]) {
    VR vr1 = new VR(5, 2);

    System.out.println("\ncurrent = " + vr1.current() + "A");
    System.out.println("  power = " + vr1.power()+ "W\n");
  }
}
