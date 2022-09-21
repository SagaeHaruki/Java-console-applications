package Save;

public class SavingAccount {

   private double balance;
   public static double interestRate = 0;

   // Balance
   public SavingAccount() {
      balance = 0;
   }

   // Interest
   public static void setInterestRate(double newRate) {
      interestRate = newRate;
   }

   // Get Interest
   public static double getInterestRate() {
      return interestRate;
   }

   // Add Interest
   public void addInterest() {
      double interest = balance * interestRate;
      balance = balance + interest;
      System.out.println("Your new Balance is: " + balance);
   }

   // Deposit
   public void deposit(double amount) {
      balance = balance + amount;
   }

   // Withdraw
   public double withdraw(double amount) {
      if (balance > amount) {
         balance = balance - amount;
      } else if (balance <= amount) {
         System.out.print("Insufficient Funds! ");
      } else {
         amount = 0;
      }
      return amount;
   }

   // Get Balance
   public double getBalance() {
      return balance;
   }

   // Show Balance
   public void showBalance(SavingAccount account) {
      System.out.println("Your balance is: " + account.getBalance());
   }
}
