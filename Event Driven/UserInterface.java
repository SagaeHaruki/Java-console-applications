public class UserInterface extends javax.swing.JFrame {

      public UserInterface() {
            initComponents();
      }

      private void initComponents() {

            FnameT = new javax.swing.JTextField();
            SnameT = new javax.swing.JTextField();
            MnameT = new javax.swing.JTextField();
            ContT = new javax.swing.JTextField();
            EmailT = new javax.swing.JTextField();
            jLabel1 = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            this.setTitle("INPUT");

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            FnameT.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        FnameTActionPerformed(evt);
                  }
            });

            EmailT.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        EmailTActionPerformed(evt);
                  }
            });

            jLabel1.setText("First Name");

            jLabel2.setText("Second Name");

            jLabel3.setText("Middle Name");

            jLabel4.setText("Contact Num");

            jLabel5.setText("Email");

            jButton1.setText("Submit");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            jButton2.setText("Clear");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                            .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                        .addGap(95, 95, 95)
                                                                        .addGroup(
                                                                                    layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                false)
                                                                                                .addComponent(SnameT)
                                                                                                .addComponent(FnameT)
                                                                                                .addComponent(MnameT)
                                                                                                .addComponent(ContT)
                                                                                                .addComponent(EmailT,
                                                                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                            215,
                                                                                                            Short.MAX_VALUE)))
                                                            .addGroup(layout.createSequentialGroup()
                                                                        .addGap(166, 166, 166)
                                                                        .addComponent(jLabel1))
                                                            .addGroup(layout.createSequentialGroup()
                                                                        .addGap(166, 166, 166)
                                                                        .addComponent(jLabel2))
                                                            .addGroup(layout.createSequentialGroup()
                                                                        .addGap(166, 166, 166)
                                                                        .addComponent(jLabel3))
                                                            .addGroup(layout.createSequentialGroup()
                                                                        .addGap(166, 166, 166)
                                                                        .addComponent(jLabel4))
                                                            .addGroup(layout.createSequentialGroup()
                                                                        .addGap(166, 166, 166)
                                                                        .addComponent(jLabel5)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44,
                                                            Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(72, 72, 72)));
            layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(FnameT, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(SnameT, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MnameT, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ContT, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel5)
                                                .addGap(10, 10, 10)
                                                .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                            javax.swing.GroupLayout.DEFAULT_SIZE,
                                                            javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout
                                                            .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jButton1,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                            .addComponent(jButton2))
                                                .addGap(22, 22, 22)));

            pack();
      }

      private void FnameTActionPerformed(java.awt.event.ActionEvent evt) {
      }

      private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
            String Fname = FnameT.getText();
            String Sname = SnameT.getText();
            String Mname = MnameT.getText();
            String Cont = ContT.getText();
            String Email = EmailT.getText();

            UserInterface2 ob = new UserInterface2();

            ob.getFName().setText(Fname);
            ob.getSName().setText(Sname);
            ob.getMName().setText(Mname);
            ob.getCont().setText(Cont);
            ob.getEmail().setText(Email);
            ob.setVisible(true);
      }

      private void EmailTActionPerformed(java.awt.event.ActionEvent evt) {
      }

      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
            FnameT.setText(null);
            SnameT.setText(null);
            MnameT.setText(null);
            ContT.setText(null);
            EmailT.setText(null);
      }

      public static void main(String args[]) {

            java.awt.EventQueue.invokeLater(new Runnable() {
                  public void run() {
                        new UserInterface().setVisible(true);
                  }
            });
      }

      private javax.swing.JTextField ContT;
      private javax.swing.JTextField EmailT;
      private javax.swing.JTextField FnameT;
      private javax.swing.JTextField MnameT;
      private javax.swing.JTextField SnameT;
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton2;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
}
