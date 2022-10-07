import java.util.*;
import java.io.*;

class exeException extends Exception {
   public exeException() {
      super("error");
   }
}

public class taskperf {
   static Scanner Scan = new Scanner(System.in);

   static int find_gdc(int num1, int num2) {
      if (num1 % num2 == 0)
         return num2;
      return find_gdc(num2, num1 % num2);
   }

   public taskperf() throws exeException {
      try {

         System.out.println("");
         part2();

      } catch (Exception ex) {
         throw new exeException();
      }
   }

   void part2() throws exeException {
      try {

         LinkedList Flavor = new LinkedList<String>();
         LinkedList FlavorCollection = new LinkedList<String>();

         Flavor.add("RockyRoad");
         Flavor.add("Coffee Crumble");
         Flavor.add("Vanilla");
         Flavor.add("Cheese");
         Flavor.add("Cookies and Cream");

         FlavorCollection.addAll(Flavor);

         System.out.print(FlavorCollection + "\n");

         System.out.print(FlavorCollection.get(0) + " is an Ice Cream Flavor \n");
         System.out.print(FlavorCollection.get(1) + " is an Ice Cream Flavor \n");
         System.out.print(FlavorCollection.get(2) + " is an Ice Cream Flavor \n");
         System.out.print(FlavorCollection.get(3) + " is an Ice Cream Flavor \n");
         System.out.print(FlavorCollection.get(4) + " is an Ice Cream Flavor \n");

      } catch (Exception ex) {
         throw new exeException();
      }
   }

   public static void main(String[] args) throws exeException {
      System.out.print("Enter first number: ");
      int num1 = Scan.nextInt();
      System.out.print("Enter second number: ");
      int num2 = Scan.nextInt();

      System.out.print("The GDC of " + (num1) + " and " + (num2) + " is " + (find_gdc(num1, num2)) + ".");

      new taskperf();
   }
}
