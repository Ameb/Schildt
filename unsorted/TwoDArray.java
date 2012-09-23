//22 Schildt p.76
//Демонстрирует двумерный массив
class TwoDArray {
 public static void main(String args[]) {
  int twoD[][] = new int[4][5]; //определяем переменную массива и
                                //раздаем ей память
  int i, j, k = 0;
  
  for(i=0; i<4; i++)        //присваиваем значения ячейкам массива
   for(j=0; j<5; j++) {     //от 0 до 19 
    twoD[i][j] = k;
    k++;
   }

  for(i=0; i<4; i++) {     //выводим массив в виде таблицы
   for(j=0; j<5; j++)
    System.out.print(twoD[i][j] + " ");
   System.out.println();
  }
 }
} 

