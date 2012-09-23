//Schildt p.116
//Тело цикла может быть пустым
class NoBody {
 public static void main(String args[]) {
  int i, j;
  i=100;
  j=200;
  
  //найти среднюю точку между i и j
  while(++i<--j);  //в этом цикле нет тела
  
  System.out.println("Средняя точка " +i);
 }
}