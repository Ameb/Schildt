/*Schildt p.174
  методы доступа public и private
*/
class Acs {
  int a;            //public-доступ по умолчанию
  public int b;
  private int c;

  //методы для доступа к переменной c
  void setc(int i) {    //установить значение c
    c = i;
  }
  int getc() {          //получить значение c
    return c;
  }
}

class AccessTest {
  public static void main(String args[]) {
    Acs ob = new Acs();
  
  //Ok, к переменным a и b возможен прямой доступ.
  ob.a = 10;
  ob.b = 20;

  //НЕПРАВИЛЬНО
//ob.c = 100;  Error!

  //Нужен доступ к с через ее методы.
  ob.setc(100);   //Ok

  System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());
  }
} 
