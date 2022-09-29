import java.util.Scanner;

public class RunAmountDue {
   public static void main(String[] args) {
      Scanner Scan = new Scanner(System.in);
      AmountDue tots = new AmountDue();

      System.out.print("Press any of the following then enter the values separated by space: ");
      System.out.print("\n 1 - Price only");
      System.out.print("\n 2 - Price and quantity");
      System.out.print("\n 3 - Price, quantity and discount amountn\n");
      System.out.print(">> ");

      String inpt = Scan.nextLine();

      if (inpt.equals("1")) {
         tots.computeAmountdue(Scan.nextDouble());
      } else if (inpt.equals("2")) {
         tots.computeAmountdue(Scan.nextDouble(), Scan.nextInt());
      } else if (inpt.equals("3")) {
         tots.computeAmountdue(Scan.nextDouble(), Scan.nextInt(), Scan.nextDouble());
      } else {
         System.out.print("Invalid Input");
      }
   }
}
