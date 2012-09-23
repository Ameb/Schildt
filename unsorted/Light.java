//7
/* Вычисляет расстояние, пройденное световым сигналом,
   используя long-переменные
*/
class Light {
 public static void main(String args[]) {
  int lightspeed;
  long days;
  long seconds;
  long distance;

  // аппроксимация скорости света в километры в секунду
  lightspeed = 300000;
  days = 1000;                     // задать количество дней
  seconds = days * 24 * 60 * 60;   // преобразовать в секунды
  distance = lightspeed * seconds; // вычислить расстояние

  System.out.print("За " + days);
  System.out.print(" дней световой сигнал пройдет около ");
  System.out.println(distance + " километров.");
  }
}
