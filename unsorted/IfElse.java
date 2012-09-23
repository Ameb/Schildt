// Schildt p.109
// Демонстрирует операторы if-else-if.
import java.io.*;
import java.util.*;
class IfElse {
 public static void main(String args[]) {
  Scanner in = new Scanner(System.in);
  PrintWriter out = new PrintWriter(System.out);
  System.out.print("number of month: ");
  int month = in.nextInt();
  
  String season;
  
  if(month == 12 || month == 1 || month == 2)
   season = "Winter";
  else if(month == 3 || month == 4 || month == 5)
   season = "Spring";
  else if(month == 6 || month == 7 || month == 8)
   season = "Summer";
  else if(month == 9 || month == 10 || month == 11)
   season = "Autumn";
  else
   season = "Error";
   
  out.println(month + " month is " + season + ".");
  out.flush();
 }
}