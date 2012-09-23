//Schildt p.104
// Демонстрирует if-then-else (? :)
class Ternary {
 public static void main(String args[]){
  int i, k;
  
  i=10;
  k = i < 0 ? -i : i;  // получить абсолютное значение i
  System.out.print("Абсолютное значение ");
  System.out.println(i + " равно " + k);
  
  i=-10;
  k= i<0 ? -i : i;
  System.out.print("Абсолютное значение ");
  System.out.println(i + " равно " + k);
 }
}