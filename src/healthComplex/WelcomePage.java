
package healthComplex;

public class WelcomePage extends javax.swing.JFrame {

    public WelcomePage() {
        initComponents();
        panelAboutUsMsg.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBangladeshHealthComplexMsg = new javax.swing.JLabel();
        lblWelcomeMsg = new javax.swing.JLabel();
        lblToMsg = new javax.swing.JLabel();
        btExit = new javax.swing.JButton();
        panelAboutUsMsg = new javax.swing.JPanel();
        lblHealthComplexPic = new javax.swing.JLabel();
        lblAboutUsMsg1 = new javax.swing.JLabel();
        lblAboutUsMsg2 = new javax.swing.JLabel();
        lblAboutUsMsg3 = new javax.swing.JLabel();
        lblAboutUsMsg4 = new javax.swing.JLabel();
        lblAboutUsMsg = new javax.swing.JLabel();
        lblAboutUsMsg5 = new javax.swing.JLabel();
        lblAboutUsMsg8 = new javax.swing.JLabel();
        lblAboutUsMsg6 = new javax.swing.JLabel();
        lblAboutUsMsg7 = new javax.swing.JLabel();
        TbtAbotUs = new javax.swing.JToggleButton();
        btLOgIn = new javax.swing.JButton();
        lblWelcomePageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBangladeshHealthComplexMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblBangladeshHealthComplexMsg.setText("Bangladesh Health Complex");
        getContentPane().add(lblBangladeshHealthComplexMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 600, 100));

        lblWelcomeMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblWelcomeMsg.setText("Welcome ");
        getContentPane().add(lblWelcomeMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 210, 100));

        lblToMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblToMsg.setText("to");
        getContentPane().add(lblToMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 210, 100));

        btExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/exit logo.png"))); // NOI18N
        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });
        getContentPane().add(btExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 150, 40));

        panelAboutUsMsg.setBackground(new java.awt.Color(0, 153, 153));

        lblHealthComplexPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/hospital pic.jpg"))); // NOI18N

        lblAboutUsMsg1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblAboutUsMsg1.setText("Name : ");

        lblAboutUsMsg2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblAboutUsMsg2.setText("Number : ");

        lblAboutUsMsg3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblAboutUsMsg3.setText("Address :");

        lblAboutUsMsg4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblAboutUsMsg4.setText("Hour :");

        lblAboutUsMsg.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblAboutUsMsg.setText("........!!!!!!!Your Health Is Our Responsibility!!!!!!!........");

        lblAboutUsMsg5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblAboutUsMsg5.setText("Bangladesh Health Complex");

        lblAboutUsMsg8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblAboutUsMsg8.setText("24/7");

        lblAboutUsMsg6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblAboutUsMsg6.setText("01641496294");

        lblAboutUsMsg7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblAboutUsMsg7.setText("Dhaka");

        javax.swing.GroupLayout panelAboutUsMsgLayout = new javax.swing.GroupLayout(panelAboutUsMsg);
        panelAboutUsMsg.setLayout(panelAboutUsMsgLayout);
        panelAboutUsMsgLayout.setHorizontalGroup(
            panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAboutUsMsgLayout.createSequentialGroup()
                .addGroup(panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                                .addComponent(lblAboutUsMsg4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAboutUsMsg8))
                            .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                                .addComponent(lblAboutUsMsg3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAboutUsMsg7))
                            .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                                .addGroup(panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                                        .addComponent(lblAboutUsMsg1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAboutUsMsg5))
                                    .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                                        .addComponent(lblAboutUsMsg2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblAboutUsMsg6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblHealthComplexPic))))
                    .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addComponent(lblAboutUsMsg)))
                .addGap(24, 24, 24))
        );
        panelAboutUsMsgLayout.setVerticalGroup(
            panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                .addGroup(panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAboutUsMsg1)
                            .addComponent(lblAboutUsMsg5))
                        .addGap(15, 15, 15)
                        .addGroup(panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAboutUsMsg2)
                            .addComponent(lblAboutUsMsg6)))
                    .addGroup(panelAboutUsMsgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHealthComplexPic)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAboutUsMsg3)
                    .addComponent(lblAboutUsMsg7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAboutUsMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAboutUsMsg4)
                    .addComponent(lblAboutUsMsg8))
                .addGap(18, 18, 18)
                .addComponent(lblAboutUsMsg)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        getContentPane().add(panelAboutUsMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 490, 270));

        TbtAbotUs.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TbtAbotUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/hospital logo.png"))); // NOI18N
        TbtAbotUs.setText("About Us");
        TbtAbotUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbtAbotUsActionPerformed(evt);
            }
        });
        getContentPane().add(TbtAbotUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 170, 40));

        btLOgIn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btLOgIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/login logo.png"))); // NOI18N
        btLOgIn.setText("Log In");
        btLOgIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLOgInActionPerformed(evt);
            }
        });
        getContentPane().add(btLOgIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 150, 40));

        lblWelcomePageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/Background.jpg"))); // NOI18N
        getContentPane().add(lblWelcomePageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btExitActionPerformed

    private void TbtAbotUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbtAbotUsActionPerformed
        if(TbtAbotUs.isSelected()){
            panelAboutUsMsg.setVisible(true);
        }
        else{
            panelAboutUsMsg.setVisible(false);
        }
    }//GEN-LAST:event_TbtAbotUsActionPerformed

    private void btLOgInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLOgInActionPerformed
        setVisible(false);
        LogInPage l = new LogInPage();
        l.setVisible(true);
    }//GEN-LAST:event_btLOgInActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton TbtAbotUs;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btLOgIn;
    private javax.swing.JLabel lblAboutUsMsg;
    private javax.swing.JLabel lblAboutUsMsg1;
    private javax.swing.JLabel lblAboutUsMsg2;
    private javax.swing.JLabel lblAboutUsMsg3;
    private javax.swing.JLabel lblAboutUsMsg4;
    private javax.swing.JLabel lblAboutUsMsg5;
    private javax.swing.JLabel lblAboutUsMsg6;
    private javax.swing.JLabel lblAboutUsMsg7;
    private javax.swing.JLabel lblAboutUsMsg8;
    private javax.swing.JLabel lblBangladeshHealthComplexMsg;
    private javax.swing.JLabel lblHealthComplexPic;
    private javax.swing.JLabel lblToMsg;
    private javax.swing.JLabel lblWelcomeMsg;
    private javax.swing.JLabel lblWelcomePageBackground;
    private javax.swing.JPanel panelAboutUsMsg;
    // End of variables declaration//GEN-END:variables
}
