/*17. Schildt p.68
Эта программа не будет компилироваться
*/
class ScopeErr {
 public static void main(String args[]) {
  int bar=1;
  {               //создается новая область действия
   int bar=2;     //ошибка времени выполнения - bar уже определена!
  }
 }
}
