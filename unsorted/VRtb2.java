/* my
   Voltage + resistor, constructor
*/
class VR3 {
  double voltage, resistance;

  VR3(double v, double r) {
    voltage = v;
    resistance = r;
  }

  double power() {
    System.out.println("  Parameters initialised\n");
    return voltage*voltage/resistance;
  }

  double current() {
    return voltage/resistance;
  }
}

class VRtb2 {
  public static void main(String args[]) {
    VR3 myvr1 = new VR3(10, 5);
    VR3 myvr2 = new VR3(10, 3);

  System.out.println("  Power of myvr1 = " + myvr1.power() + "\n");
  System.out.println("  Power of myvr2 = " + myvr2.power() + "\n");
  System.out.println("Current of myvr2 = " + myvr2.current() + "\n");
  }
}
