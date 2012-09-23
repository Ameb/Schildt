/* Schildt p.186
   Строки
*/
class StringDemo {
  public static void main(String args[]) {
    String str1 = "First string";
    String str2 = "Second string";
    String str3 = str1 + " & " + str2;
    String str4 = str1;

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);

    System.out.println("str1 length: " + str1.length());

    System.out.println("Symbol with index 3 in str1: " + str1.charAt(3));

    if(str1.equals(str2))
      System.out.println("str1 == str2");
    else
      System.out.println("str1 != str2");

    if(str1.equals(str4))
      System.out.println("str1 == str4");
    else
      System.out.println("str1 != str4");
  }
}
