import java.util.Scanner;

class exeException extends Exception {
   public exeException() {
      super("Error"); // Throw if error was found
   }
}

public class RunAmountDue {

   Scanner Scan = new Scanner(System.in);
   AmountDue tots = new AmountDue();

   public RunAmountDue() throws exeException {

      try {

         System.out.print("Press any of the following then enter the values separated by space: E");
         System.out.print("\n 1 - Price only");
         System.out.print("\n 2 - Price and quantity");
         System.out.print("\n 3 - Price, quantity and discount amountn\n");

         part2();

      } catch (Exception ex) {
         throw new exeException();
      }
   }

   void part2() throws exeException {

      try {
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
      } catch (Exception ex) {
         throw new exeException();
      }
   }

   public static void main(String[] args) throws exeException {
      new RunAmountDue();
   }
}
