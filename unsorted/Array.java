//19. Schildt p.74
//Демонстрирует одномерный массив
class Array {
 public static void main(String args[]) {
  int month_days[];           //объявляем переменную массива и ее тип
  month_days = new int[12];   //выделяем память под массив
  month_days[0] = 31;
  month_days[1] = 28;
  month_days[2] = 31;
  month_days[3] = 30;
  month_days[4] = 31;
  month_days[5] = 30;
  month_days[6] = 31;
  month_days[7] = 31;
  month_days[8] = 30;
  month_days[9] = 31;
  month_days[10] = 30;
  month_days[11] = 31;
  System.out.println("Количество дней в апреле = " + month_days[3]);
 }
} 