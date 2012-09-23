/* my
   Voltage + resistor
*/
class VR2 {
  double resistance, voltage;
  
  void setParam(double v, double r) {
    voltage = v;
    resistance = r;
  }
  
  double current() {
    return voltage/resistance;
  }
}

class VRtb {
  public static void main(String args[]) {
    VR2 myvr1 = new VR2();
    VR2 myvr2 = new VR2();
 
    myvr1.setParam(10, 5);
    myvr2.setParam(10, 3);
    
    System.out.println("Current in myvr1 = " + myvr1.current());
    System.out.println("Current in myvr2 = " + myvr2.current());
  }
}
