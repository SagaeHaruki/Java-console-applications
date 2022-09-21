package Save;

import java.util.Scanner;

// Exeption

class exeException extends Exception {
   public exeException() {
      super("Error"); // Throw if error was found
   }
}

public class RunSavingAccount {

   double depositinpt;
   double interestRateinpt;
   double withdrawinpt;

   // Saving Account
   Scanner scan = new Scanner(System.in);

   // Account
   SavingAccount account = new SavingAccount();

   public RunSavingAccount() throws exeException {
      try {
         // Input
         System.out.print(">>> Enter interest rate: ");
         interestRateinpt = scan.nextDouble();
         SavingAccount.setInterestRate(interestRateinpt);

         System.out.print(">>> Enter deposit amount: ");
         depositinpt = scan.nextDouble();
         account.deposit(depositinpt);

         account.showBalance(account);

         enter();

      } catch (Exception ex) {
         throw new exeException(); // Throw if error was found
      }
   }

   // D & W input

   void enter() throws exeException {
      try {
         System.out.print(">>> Press D for another deposit or W to withdraw: ");
         char inpt = scan.next().charAt(0);

         if (inpt == 'd' || inpt == 'D') {
            depositcc();
         } else if (inpt == 'w' || inpt == 'W') {
            withdrawcc();
         } else {
            System.out.print(">>> Invalid Input <<<");
            enter();
         }
      } catch (Exception ex) {
         throw new exeException();
      }
   }

   // Deposit

   void depositcc() throws exeException {
      try {

         System.out.print(">>> Enter deposit amount: ");
         depositinpt = scan.nextDouble();
         account.deposit(depositinpt);
         account.addInterest();

         System.out.println(">>> ----- <<<");

         new RunSavingAccount(); // Loop

      } catch (Exception ex) {
         throw new exeException(); // Throw if error was found
      }

   }

   // Withdraw

   void withdrawcc() throws exeException {
      try {

         System.out.print(">>> Enter withdraw amount: ");
         withdrawinpt = scan.nextDouble();
         account.withdraw(withdrawinpt);
         account.showBalance(account);

         System.out.println(">>> ----- <<<");

         new RunSavingAccount(); // Loop

      } catch (Exception ex) {

         throw new exeException(); // Throw if error was found
      }

   }

   // Main Method
   public static void main(String[] args) throws exeException {
      new RunSavingAccount();
   }
}
