import java.util.ArrayList;

public class ObjectDemo {

   public static void main(String[] args) {

      // get an integer
      Integer i = new Integer(50);

      // get a list
      ArrayList list = new ArrayList();

      // add some elements in list
      list.add(50);
      list.add("Hello World");

      // print their string representation
      System.out.println("" + i.toString());
      System.out.println("" + list);
   }
}