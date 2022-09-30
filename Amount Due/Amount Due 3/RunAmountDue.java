import java.util.Scanner;

public class RunAmountDue {
   public static void main(String[] args) {
      Scanner Scan = new Scanner(System.in);
      AmountDue tots = new AmountDue();

      System.out.print("Press any of the following then enter the values separated by space: E");
      System.out.print("\n 1 - Price only");
      System.out.print("\n 2 - Price and quantity");
      System.out.print("\n 3 - Price, quantity and discount amountn\n");
      System.out.print(">> ");

      int inpt = Scan.nextInt();

      switch (inpt) {
         case 1:
            tots.computeAmountdue(Scan.nextDouble());
            break;
         case 2:
            tots.computeAmountdue(Scan.nextDouble(), Scan.nextInt());
            break;
         case 3:
            tots.computeAmountdue(Scan.nextDouble(), Scan.nextInt(), Scan.nextDouble());
            break;
         default:
            System.out.println("INVALID INPUT");
            break;
      }
   }
}
