/* Как делать НЕ НАДО
   Simple electronic circuit
*/
class Vdd {
  static double voltage;
}

class Res {
  static double resistance;
}

class VR {

  double current() {
  return Vdd.voltage / Res.resistance; 
  }
}

class VRTest {
  public static void main(String args[]) {
    VR vrcircuit;
    vrcircuit = new VR();
    
    Vdd.voltage = 5;
    Res.resistance = 2;
    
    System.out.println("current = " + vrcircuit.current());
  }
}
    
  
