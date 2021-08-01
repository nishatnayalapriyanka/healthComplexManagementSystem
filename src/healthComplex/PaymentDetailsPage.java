/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthComplex;

/**
 *
 * @author user
 */
public class PaymentDetailsPage extends javax.swing.JFrame {

    /**
     * Creates new form PaymentDetailsPage
     */
    public PaymentDetailsPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSearchBox = new javax.swing.JLabel();
        txtSearchBox = new javax.swing.JTextField();
        lblBangladeshHealthComplexMsg = new javax.swing.JLabel();
        btSearchBox = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaymentlDetails = new javax.swing.JTable();
        panelTotalPaid = new javax.swing.JPanel();
        lblTotalPaid = new javax.swing.JLabel();
        btReset = new javax.swing.JButton();
        panelTotalDue = new javax.swing.JPanel();
        lblTotalDue = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();
        panelTotalPayable = new javax.swing.JPanel();
        lblTotalPayable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSearchBox.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblSearchBox.setForeground(new java.awt.Color(153, 153, 153));
        lblSearchBox.setText("Patient's Id");

        txtSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBoxActionPerformed(evt);
            }
        });

        lblBangladeshHealthComplexMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblBangladeshHealthComplexMsg.setText("Bangladesh Health Complex");

        btSearchBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/Search Logo.png"))); // NOI18N

        tblPaymentlDetails.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        tblPaymentlDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patients Id", "Doctor Fees", "Medicine Fees", "Ward Cost", "Operation Cost", "Paid Ammount", "Total Cost", "Due Ammount"
            }
        ));
        jScrollPane1.setViewportView(tblPaymentlDetails);

        panelTotalPaid.setBackground(new java.awt.Color(153, 153, 255));

        lblTotalPaid.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblTotalPaid.setText("Total Paid");

        javax.swing.GroupLayout panelTotalPaidLayout = new javax.swing.GroupLayout(panelTotalPaid);
        panelTotalPaid.setLayout(panelTotalPaidLayout);
        panelTotalPaidLayout.setHorizontalGroup(
            panelTotalPaidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotalPaid, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        panelTotalPaidLayout.setVerticalGroup(
            panelTotalPaidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalPaidLayout.createSequentialGroup()
                .addComponent(lblTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        btReset.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/reset logo.png"))); // NOI18N
        btReset.setText("Reset");

        panelTotalDue.setBackground(new java.awt.Color(153, 153, 255));

        lblTotalDue.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblTotalDue.setText("Total Due");

        javax.swing.GroupLayout panelTotalDueLayout = new javax.swing.GroupLayout(panelTotalDue);
        panelTotalDue.setLayout(panelTotalDueLayout);
        panelTotalDueLayout.setHorizontalGroup(
            panelTotalDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotalDue, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        panelTotalDueLayout.setVerticalGroup(
            panelTotalDueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalDueLayout.createSequentialGroup()
                .addComponent(lblTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        btBack.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/back logo.png"))); // NOI18N
        btBack.setText("Back");

        panelTotalPayable.setBackground(new java.awt.Color(153, 153, 255));

        lblTotalPayable.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblTotalPayable.setText("Total Payable");

        javax.swing.GroupLayout panelTotalPayableLayout = new javax.swing.GroupLayout(panelTotalPayable);
        panelTotalPayable.setLayout(panelTotalPayableLayout);
        panelTotalPayableLayout.setHorizontalGroup(
            panelTotalPayableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTotalPayable, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        panelTotalPayableLayout.setVerticalGroup(
            panelTotalPayableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTotalPayableLayout.createSequentialGroup()
                .addComponent(lblTotalPayable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(lblSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(panelTotalPayable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(panelTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblBangladeshHealthComplexMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblBangladeshHealthComplexMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTotalPayable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelTotalPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(panelTotalDue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaymentDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentDetailsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSearchBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBangladeshHealthComplexMsg;
    private javax.swing.JLabel lblSearchBox;
    private javax.swing.JLabel lblTotalDue;
    private javax.swing.JLabel lblTotalPaid;
    private javax.swing.JLabel lblTotalPayable;
    private javax.swing.JPanel panelTotalDue;
    private javax.swing.JPanel panelTotalPaid;
    private javax.swing.JPanel panelTotalPayable;
    private javax.swing.JTable tblPaymentlDetails;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
}
