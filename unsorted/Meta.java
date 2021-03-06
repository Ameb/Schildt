// Schildt
import java.lang.annotation.*;
import java.lang.reflect.*;

// An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str();
  int val();
}

class Meta {

  // Annotate a method.
  // myMeth now has two arguments.
  @MyAnno(str = "Two Parameters", val = 19)
  public static void myMeth(String str, int i)
  {
    Meta ob = new Meta();

    // Obtain the annotation for this method
    // and display the values of the members.
    try {
      
      // First, get a Class object that represents
      // this class.
      Class<?> c = ob.getClass();

   
      // Now, get a Method object that represents
      // this method.
      // Here, the parameters types are specified.
      Method m = c.getMethod("myMeth", String.class, int.class);

      // Next, get the annotation for this class.
      MyAnno anno = m.getAnnotation(MyAnno.class);

      // Finally, display the values.
      System.out.println(anno.str() + " " + anno.val());
    } catch (NoSuchMethodException exc) {
      System.out.println("Method not found.");
    }
  }

  public static void main(String args[]) {
    myMeth("test", 10);
  }
} 
