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
public class OperationDetailsPage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public OperationDetailsPage() {
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

        lblBangladeshHealthComplexMsg = new javax.swing.JLabel();
        panelNumberOfUncompletedOperation = new javax.swing.JPanel();
        lblNumberOfUncomplitedOperation = new javax.swing.JLabel();
        panelNumberOfOperation = new javax.swing.JPanel();
        lblNumberOfOperation = new javax.swing.JLabel();
        panelNumberOfCompletedOperation = new javax.swing.JPanel();
        lblNumberOfComplitedOperation1 = new javax.swing.JLabel();
        lblSearchBox = new javax.swing.JLabel();
        txtSearchBox = new javax.swing.JTextField();
        btSearchBox = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOperationlDetails = new javax.swing.JTable();
        btReset = new javax.swing.JButton();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblBangladeshHealthComplexMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblBangladeshHealthComplexMsg.setText("Bangladesh Health Complex");

        panelNumberOfUncompletedOperation.setBackground(new java.awt.Color(153, 153, 255));

        lblNumberOfUncomplitedOperation.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblNumberOfUncomplitedOperation.setText("Number of operation which is uncompleted");

        javax.swing.GroupLayout panelNumberOfUncompletedOperationLayout = new javax.swing.GroupLayout(panelNumberOfUncompletedOperation);
        panelNumberOfUncompletedOperation.setLayout(panelNumberOfUncompletedOperationLayout);
        panelNumberOfUncompletedOperationLayout.setHorizontalGroup(
            panelNumberOfUncompletedOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNumberOfUncomplitedOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        panelNumberOfUncompletedOperationLayout.setVerticalGroup(
            panelNumberOfUncompletedOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumberOfUncompletedOperationLayout.createSequentialGroup()
                .addComponent(lblNumberOfUncomplitedOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        panelNumberOfOperation.setBackground(new java.awt.Color(153, 153, 255));

        lblNumberOfOperation.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblNumberOfOperation.setText("Total number of operation");

        javax.swing.GroupLayout panelNumberOfOperationLayout = new javax.swing.GroupLayout(panelNumberOfOperation);
        panelNumberOfOperation.setLayout(panelNumberOfOperationLayout);
        panelNumberOfOperationLayout.setHorizontalGroup(
            panelNumberOfOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNumberOfOperation, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        panelNumberOfOperationLayout.setVerticalGroup(
            panelNumberOfOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumberOfOperationLayout.createSequentialGroup()
                .addComponent(lblNumberOfOperation, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        panelNumberOfCompletedOperation.setBackground(new java.awt.Color(153, 153, 255));

        lblNumberOfComplitedOperation1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblNumberOfComplitedOperation1.setText("Number of operation which is completed");

        javax.swing.GroupLayout panelNumberOfCompletedOperationLayout = new javax.swing.GroupLayout(panelNumberOfCompletedOperation);
        panelNumberOfCompletedOperation.setLayout(panelNumberOfCompletedOperationLayout);
        panelNumberOfCompletedOperationLayout.setHorizontalGroup(
            panelNumberOfCompletedOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNumberOfComplitedOperation1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
        );
        panelNumberOfCompletedOperationLayout.setVerticalGroup(
            panelNumberOfCompletedOperationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNumberOfCompletedOperationLayout.createSequentialGroup()
                .addComponent(lblNumberOfComplitedOperation1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        lblSearchBox.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblSearchBox.setForeground(new java.awt.Color(153, 153, 153));
        lblSearchBox.setText("Patient's Id");

        txtSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBoxActionPerformed(evt);
            }
        });

        btSearchBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/Search Logo.png"))); // NOI18N

        tblOperationlDetails.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        tblOperationlDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patients Id", "Operation Name", "Surgeons Name", "Date"
            }
        ));
        jScrollPane1.setViewportView(tblOperationlDetails);

        btReset.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/reset logo.png"))); // NOI18N
        btReset.setText("Reset");

        btBack.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/back logo.png"))); // NOI18N
        btBack.setText("Back");

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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(panelNumberOfOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45)
                            .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(panelNumberOfCompletedOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(panelNumberOfUncompletedOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(lblBangladeshHealthComplexMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(459, Short.MAX_VALUE))
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
                    .addComponent(panelNumberOfCompletedOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelNumberOfUncompletedOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelNumberOfOperation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(OperationDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperationDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperationDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperationDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperationDetailsPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSearchBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBangladeshHealthComplexMsg;
    private javax.swing.JLabel lblNumberOfComplitedOperation1;
    private javax.swing.JLabel lblNumberOfOperation;
    private javax.swing.JLabel lblNumberOfUncomplitedOperation;
    private javax.swing.JLabel lblSearchBox;
    private javax.swing.JPanel panelNumberOfCompletedOperation;
    private javax.swing.JPanel panelNumberOfOperation;
    private javax.swing.JPanel panelNumberOfUncompletedOperation;
    private javax.swing.JTable tblOperationlDetails;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
}
