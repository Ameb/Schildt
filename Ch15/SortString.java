/* Schildt Ch15
   A bubble sort for Strings.
*/

package Schildt.Ch15;

class SortString {
  static String arr[] = {
    "Now", "is", "the", "time", "for", "all", "good", "men",
    "to", "come", "to", "the", "aid", "of", "their", "country"
    } ;
  public static void main(String[] args) {
    System.out.println();
    for(int i=0; i<arr.length; i++)
      System.out.print(arr[i] + " ");
    System.out.println();
    System.out.println("-----------------------------");
    
    System.out.println("Bubble sort:\n");
    try {
      for(int j=0; j<arr.length; j++) {
        System.out.println("Take " + (j+1) + " word");
        Thread.sleep(2000);
        for(int i=j+1; i<arr.length; i++) {
          System.out.println("Compare " + (i+1) + " word (" + arr[i] + ") to " 
                             + (j+1) + " word (" + arr[j] + ")");
          Thread.sleep(1000);
          if(arr[i].compareToIgnoreCase(arr[j]) < 0) {
            String t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
            System.out.println("Change places " + arr[j] + " and " + arr[i]);
            Thread.sleep(2000);
         }
       }
     }
     System.out.println();
     for(int i=0; i<arr.length; i++)
       System.out.print(arr[i] + " ");
     System.out.println("\n");
   } catch (InterruptedException e) {
     System.out.println("Interrupted: " + e);
   }
  }
}
