//Schildt p.104
// ������������� if-then-else (? :)
class Ternary {
 public static void main(String args[]){
  int i, k;
  
  i=10;
  k = i < 0 ? -i : i;  // �������� ���������� �������� i
  System.out.print("���������� �������� ");
  System.out.println(i + " ����� " + k);
  
  i=-10;
  k= i<0 ? -i : i;
  System.out.print("���������� �������� ");
  System.out.println(i + " ����� " + k);
 }
}