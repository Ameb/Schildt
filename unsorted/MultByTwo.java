//30. Леввый сдвиг как быстрый способ умножения на 2.
class MultByTwo {
 public static void main(String main[]) {
  int i;
  int num = 0xFFFFFFE;
 
  for(i=0; i<4; i++) {
   num = num << 1;
   System.out.println(num);
  }
 }
}
