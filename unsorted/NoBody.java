//Schildt p.116
//���� ����� ����� ���� ������
class NoBody {
 public static void main(String args[]) {
  int i, j;
  i=100;
  j=200;
  
  //����� ������� ����� ����� i � j
  while(++i<--j);  //� ���� ����� ��� ����
  
  System.out.println("������� ����� " +i);
 }
}