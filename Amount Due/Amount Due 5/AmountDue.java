class AmountDue {
   final double taxes = .12;

   public void computeAmountdue(double prices) {
      double taxes2 = prices * taxes;
      double totaldue = prices * taxes2;
      System.out.println("Amount due is: " + totaldue);
   }

   public void computeAmountdue(double prices, int count) {
      double taxes2 = prices * taxes;
      double totaldue2 = (prices * count) + taxes2;
      System.out.println("Amount due is: " + totaldue2);
   }

   public void computeAmountdue(double prices, int count, double diss) {
      double taxes2 = prices * taxes;
      double totaldue3 = ((prices * count) - diss) + taxes2;
      System.out.println("Amount due is: " + totaldue3);
   }
}
