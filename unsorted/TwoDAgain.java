//23. Schildt
//Ручное распределение различных размеров второго измерения
class TwoDAgain {
 public static void main(String args[]) {
  int twoD[][] = new int[4][]; 
  twoD[0] = new int[1];
  twoD[1] = new int[2];
  twoD[2] = new int[3];
  twoD[3] = new int[4];
  
  int i,j;
  int k=0;

  for(i=0; i<4; i++)
   for(j=0; j<i+1; j++) {
    twoD[i][j] = k;
    k++;
   }
 
  for(i=0; i<4; i++) {             //Всё дело в скобках!
   for(j=0; j<i+1; j++)            //этот цикл не выполняет второй println, 
                                   //т.к. не имеет скобок
    System.out.print(twoD[i][j] + " ");
    System.out.println();          //этот println выполняется первым циклом
  }
 }
}
