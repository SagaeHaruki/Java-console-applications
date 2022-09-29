class AmountDue {

   public void computeAmountdue(double prices) {
      final double tax = .12;
      double tax2 = prices * tax;
      double totaldue = prices * tax2;
      System.out.println("Amount due is: " + totaldue);
   }

   public void computeAmountdue(double prices, int count) {
      final double tax = .12;
      double tax2 = prices * tax;
      double totaldue2 = (prices * count) + tax2;
      System.out.println("Amount due is: " + totaldue2);
   }

   public void computeAmountdue(double prices, int count, double diss) {
      final double tax = .12;
      double tax2 = prices * tax;
      double totaldue3 = ((prices * count) - diss) + tax2;
      System.out.println("Amount due is: " + totaldue3);
   }
}
