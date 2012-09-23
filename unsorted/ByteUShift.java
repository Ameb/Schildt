//32. Schildt p.97
//Беззнаковый сдвиг byte-значения.
class ByteUShift {
 static public void main(String args[]) {
  char hex[] = {
   '0', '1', '2', '3', '4', '5', '6', '7',
   '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
  };
  byte b = (byte) 0xf1; /* 1111 0001 : старший бит определяет знак "-", 111 0001 = 113. Т.к. это явный перевод в byte, то результатом будет остаток от деления по модулю 128 (7 бит): -113 - 15 = -128; ответ -15. Или просто инвертируем число 1111 0001 в 0000 1110 = 15 со знаком минус */
  System.out.println("b = " + b); 
  byte c = (byte) (b>>4); /* сначала b расширяется до int (32bit): 1111 1111 1111 1111 1111 1111 1111 0001, потом сдвигается на 4 бита, когда старшие биты повторяют значение сдвинутых, и потом число обрезается до 8 бит: 1111 1111 = 0xff */ 
  System.out.println("c = " + c);
  byte d = (byte) (b>>>4); /* b расширяется до int (32bit), затем сдвигается на 4 бита с заполнением старших битов нулями, и обрезается до 8 бит: 1111 1111 = 0xff */
  System.out.println("d = " + d);
  byte e = (byte) ((b&0xff) >> 4); /* т.к. здесь производится лог. операция (&), то числа остаются 8-битными (маскировка), затем число расширяется до int (32bit) и сдвигается на 4 бита, старшие биты повторяют сдвинутые, затем обрезается обратно до 8 бит : 0000 1111 = 0x0f */
  System.out.println("d = " + d + "\n");

  System.out.println("               b = 0x" + hex[(b>>4)&0x0f] + hex[b&0x0f]);
  System.out.println("          b >> 4 = 0x" + hex[(c>>4)&0x0f] + hex[c&0x0f]);
  System.out.println("         b >>> 4 = 0x" + hex[(d>>4)&0x0f] + hex[d&0x0f]);
  System.out.println(" (b & 0xff) >> 4 = 0x" + hex[(e>>4)&0x0f] + hex[e&0x0f]);
 }
}