/* Schildt p.118
   Использование do-while для обработки выборки из меню
   -- простая справочная система
*/
class Menu {
 public static void main(String args[]) 
  throws java.io.IOException {
  char choice;
  
  do {
   System.out.println("Справка:");  
   System.out.println(" 1. if");
   System.out.println(" 2. switch");
   System.out.println(" 3. while");
   System.out.println(" 4. do while");
   System.out.println(" 5. for\n");
   System.out.println("Выберите раздел:");
   choice = (char) System.in.read();
  }while ( choice < '1' || choice > '5' );

  System.out.println("\n");

  switch (choice) {
   case '1':
    System.out.println("Условный оператор if:\n");   
	System.out.println("if(condition) statement1;");   
	System.out.println(" else statement2;");
    break;
   case '2':
    System.out.println("Оператор выбора switch:\n");   
	System.out.println("switch(expression) {"); 
	System.out.println(" case value:"); 
	System.out.println("  последовательность операторов"); 
	System.out.println(" break;"); 
	System.out.println(" // ..."); 
	System.out.println("}"); 
	break;
   case '3':
    System.out.println("Оператор цикла while:\n");
	System.out.println("while(condition) тело цикла;");
    break;
   case '4':
    System.out.println("Оператор цикла do while:\n");
    System.out.println("do {");
    System.out.println(" тело цикла;");
    System.out.println("} while (condition);");
    break;
   case '5':
    System.out.println("Оператор цикла for:\n");   
	System.out.println("for(init; condition; iteration)");   
	System.out.println(" тело цикла;");
    break;
  }
 }
} 