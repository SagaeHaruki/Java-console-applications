import java.util.*;
import java.io.*;

class exeException extends Exception {
   public exeException() {
      super("error");
   }
}

public class taskperf {
   static Scanner Scan = new Scanner(System.in);

   static int factorial(int n) {
      if (n == 0)
         return 1;
      else
         return (n * factorial(n - 1));
   }

   public taskperf() throws exeException {
      try {
         part2();

      } catch (Exception ex) {
         throw new exeException();
      }
   }

   void part2() throws exeException {
      try {

         LinkedList Flavor = new LinkedList<String>();
         LinkedList Collection = new LinkedList<String>();

         Flavor.add("Vanilla");
         Flavor.add("Chocolate");
         Flavor.add("Strawberry");
         Flavor.add("Cheese");
         Flavor.add("Cookies and Cream");

         Collection.addAll(Flavor);

         System.out.print(Collection + "\n");

         System.out.print(Collection.get(0) + " is an Ice Cream Flavor \n");
         System.out.print(Collection.get(1) + " is an Ice Cream Flavor \n");
         System.out.print(Collection.get(2) + " is an Ice Cream Flavor \n");
         System.out.print(Collection.get(3) + " is an Ice Cream Flavor \n");
         System.out.print(Collection.get(4) + " is an Ice Cream Flavor \n");

      } catch (Exception ex) {
         throw new exeException();
      }
   }

   public static void main(String[] args) throws exeException {
      System.out.print("Enter factorial: ");
      int inpt = Scan.nextInt();
      int i, fact = 1;
      fact = factorial(inpt);

      System.out.print("Factorial of " + inpt + " is: " + fact + "\n");

      new taskperf();
   }
}
