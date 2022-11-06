public class UserInterface2 extends javax.swing.JFrame {

   public UserInterface2() {
      initComponents();
   }

   // Jlabel 2
   public javax.swing.JLabel getFName() {
      return jLabel2;
   }

   public void setFName(javax.swing.JLabel jLabel2) {
      this.jLabel2 = jLabel2;
   }

   // Jlabel 1
   public javax.swing.JLabel getSName() {
      return jLabel1;
   }

   public void setSName(javax.swing.JLabel jLabel1) {
      this.jLabel1 = jLabel1;
   }

   // JLabel 3
   public javax.swing.JLabel getMName() {
      return jLabel3;
   }

   public void setMName(javax.swing.JLabel jLabel3) {
      this.jLabel3 = jLabel3;
   }

   // JLabel 4
   public javax.swing.JLabel getCont() {
      return jLabel4;
   }

   public void setCont(javax.swing.JLabel jLabel4) {
      this.jLabel4 = jLabel4;
   }

   // JLabel 5
   public javax.swing.JLabel getEmail() {
      return jLabel5;
   }

   public void setEmail(javax.swing.JLabel jLabel5) {
      this.jLabel5 = jLabel5;
   }

   private void initComponents() {

      setFName(new javax.swing.JLabel());
      setSName(new javax.swing.JLabel());
      setMName(new javax.swing.JLabel());
      setCont(new javax.swing.JLabel());
      setEmail(new javax.swing.JLabel());

      this.setTitle("OUTPUT");

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                              .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(getFName(), javax.swing.GroupLayout.DEFAULT_SIZE,
                                          javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                          javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                          javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(312, Short.MAX_VALUE)));
      layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(getFName(), javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                              javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(84, Short.MAX_VALUE)));

      pack();
   }

   public static void main(String args[]) {

      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new UserInterface2().setVisible(true);
         }
      });
   }

   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
}
