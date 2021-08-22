/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package healthComplex;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class ManageInformationPage extends javax.swing.JFrame {

    /**
     * Creates new form ManageInformationPage
     */
    public ManageInformationPage() {
        initComponents();
        lblWelcomePageBackground.setFocusable(true);
    }
    //personal details
    String ID;
    String patientFirstName;
    String patientLastName;
    String age;
    String gender;
    String phoneNo;
    String email;
    //medical records
    String problem;
    String doctorFirstName;
    String doctorLastName;
    String medicine;
    String wardNo;
    //payment details
    String doctorFess;
    String medicineCost;
    String wardCost;
    String operationCost;
    String paidAmount;
    String totalCost;
    String dueAmount;
    //operation details
    String operationName;
    String surgeonFirstName;
    String surgeonLastName;
    String date;
    
    double doctorFessD;
    double medicineCostD;
    double wardCostD;
    double operationCostD;
    double paidAmountD;
    double totalCostD;
    double dueAmountD;
    
    String searchID;
    
    public void billCalculation(){
        if(txtDoctorFees.getText().isEmpty()||txtMedicineCost.getText().isEmpty()||txtWardCost.getText().isEmpty()||txtOperationCost.getText().isEmpty()||txtPaidAmount.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Fill the previous fields...","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            doctorFessD=Double.parseDouble(txtDoctorFees.getText());
            medicineCostD=Double.parseDouble(txtMedicineCost.getText());
            wardCostD=Double.parseDouble(txtWardCost.getText());
            operationCostD=Double.parseDouble(txtOperationCost.getText());
            paidAmountD=Double.parseDouble(txtPaidAmount.getText());
            totalCostD=doctorFessD+medicineCostD+wardCostD+operationCostD;
            dueAmountD=totalCostD-paidAmountD;
            txtTotalCost.setText(String.valueOf(totalCostD));
            txtDueAmount.setText(String.valueOf(dueAmountD));
        }  
    }

    public void setValue(){
        //personal details
        ID = txtID.getText();
        patientFirstName = txtPatientFirstName.getText();
        patientLastName = txtPatientLastName.getText();
        age = txtlAge.getText();
        if(rbtMale.isSelected()){
            gender = "Male";
        }
        if(rbtFemale.isSelected()){
            gender = "Female";
        }
        phoneNo = txtPhoneNumber.getText();
        email = txtEmail.getText();
        //medical records
        problem = txtProblem.getText();
        doctorFirstName = txtDoctorFirstName.getText();
        doctorLastName = txtDoctorLastName.getText();
        medicine = txtMedicine.getText();
        wardNo = txtWardNo.getText();
        //payment details
        doctorFess = txtDoctorFees.getText();
        medicineCost = txtMedicineCost.getText();
        wardCost = txtWardCost.getText();
        operationCost = txtOperationCost.getText();
        paidAmount = txtPaidAmount.getText();
        totalCost = txtTotalCost.getText();
        dueAmount = txtDueAmount.getText();
        //operation details
        operationName = txtOperationName.getText();
        surgeonFirstName = txtSurgeonFirstName.getText();
        surgeonLastName = txtSurgeonLastName.getText();
        date = txtDate.getText();       
    }
    
    public int isFieldEmpty(){
        if(txtID.getText().isEmpty()||txtPatientFirstName.getText().isEmpty()||
        txtPatientLastName.getText().isEmpty()||txtlAge.getText().isEmpty()||
        (rbtMale.isSelected()==false&&rbtFemale.isSelected()==false)||
        txtPhoneNumber.getText().isEmpty()||txtEmail.getText().isEmpty()||
        
        txtProblem.getText().isEmpty()||txtDoctorFirstName.getText().isEmpty()||
        txtDoctorLastName.getText().isEmpty()||txtMedicine.getText().isEmpty()||
        txtWardNo.getText().isEmpty()||
                
        txtDoctorFees.getText().isEmpty()||txtMedicineCost.getText().isEmpty()||
        txtWardCost.getText().isEmpty()||txtOperationCost.getText().isEmpty()||
        txtPaidAmount.getText().isEmpty()||txtTotalCost.getText().isEmpty()||
        txtWardCost.getText().isEmpty()||
                
        txtOperationName.getText().isEmpty()||txtSurgeonFirstName.getText().isEmpty()||
        txtSurgeonLastName.getText().isEmpty()||txtDate.getText().isEmpty()){
           return 0; 
   
        }
        else{
            return 1;
        }  
    }


    public void clearField(){
        //personal details
        txtID.setText(null);
        txtPatientFirstName.setText(null);
        txtPatientLastName.setText(null);
        txtlAge.setText(null);
        rbtMale.setSelected(false);
        rbtFemale.setSelected(false);
        txtPhoneNumber.setText(null);
        txtEmail.setText(null);
        //medical records
        txtProblem.setText(null);
        txtDoctorFirstName.setText(null);
        txtDoctorLastName.setText(null);
        txtMedicine.setText(null);
        txtWardNo.setText(null);
        //payment details
        txtDoctorFees.setText(null);
        txtMedicineCost.setText(null);
        txtWardCost.setText(null);
        txtOperationCost.setText(null);
        txtPaidAmount.setText(null);
        txtTotalCost.setText(null);        
        txtDueAmount.setText(null);
        //operation details
        txtOperationName.setText(null);
        txtSurgeonFirstName.setText(null);
        txtSurgeonLastName.setText(null);       
        txtDate.setText(null);       
    }
    
    public void addInfo(){
        setValue();
        try{
            FileWriter file = new FileWriter("Patient.txt",true);
            //personal details
            file.write(ID+"\t");
            file.write(patientFirstName+"\t");
            file.write(patientLastName+"\t");
            file.write(age+"\t");
            file.write(gender+"\t");
            file.write(phoneNo+"\t");
            file.write(email+"\t");
            //medical records
            file.write(problem+"\t");
            file.write(doctorFirstName+"\t");
            file.write(doctorLastName+"\t");
            file.write(medicine+"\t");
            file.write(wardNo+"\t");
            //payment details
            file.write(doctorFess+"\t");
            file.write(medicineCost+"\t");
            file.write(wardCost+"\t");
            file.write(operationCost+"\t");
            file.write(paidAmount+"\t");
            file.write(totalCost+"\t");
            file.write(dueAmount+"\t");
            //operation details
            file.write(operationName+"\t");
            file.write(surgeonFirstName+"\t");
            file.write(surgeonLastName+"\t");
            file.write(date+"\n");
            file.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(this,"Operation failed , Try again...","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void createTempFile(){
        searchID = txtID.getText();
        try{
            File file = new File("Patient.txt");
            Scanner fileS = new Scanner(file);
            while(fileS.hasNext()){
                //personal detail
                ID=fileS.next();
                patientFirstName=fileS.next();
                patientLastName=fileS.next();
                age=fileS.next();
                gender=fileS.next();
                phoneNo=fileS.next();
                email=fileS.next();        
                //medical records
                problem=fileS.next();   
                doctorFirstName=fileS.next();
                doctorLastName=fileS.next();
                medicine=fileS.next();
                wardNo=fileS.next();
                //payment details
                doctorFess=fileS.next();
                medicineCost=fileS.next();        
                wardCost=fileS.next();
                operationCost=fileS.next();
                paidAmount=fileS.next();
                totalCost=fileS.next();                
                dueAmount=fileS.next();
                //operation details
                operationName=fileS.next();
                surgeonFirstName=fileS.next();
                surgeonLastName=fileS.next();
                date=fileS.next();
                if(!searchID.equals(ID)){
                    try{
                        FileWriter fileW = new FileWriter("Temp.txt",true);
                        //personal details
                        fileW.write(ID+"\t");
                        fileW.write(patientFirstName+"\t");
                        fileW.write(patientLastName+"\t");
                        fileW.write(age+"\t");
                        fileW.write(gender+"\t");
                        fileW.write(phoneNo+"\t");
                        fileW.write(email+"\t");
                        //medical records
                        fileW.write(problem+"\t");
                        fileW.write(doctorFirstName+"\t");
                        fileW.write(doctorLastName+"\t");
                        fileW.write(medicine+"\t");
                        fileW.write(wardNo+"\t");
                        //payment details
                        fileW.write(doctorFess+"\t");
                        fileW.write(medicineCost+"\t");
                        fileW.write(wardCost+"\t");
                        fileW.write(operationCost+"\t");
                        fileW.write(paidAmount+"\t");
                        fileW.write(totalCost+"\t");
                        fileW.write(dueAmount+"\t");
                        //operation details
                        fileW.write(operationName+"\t");
                        fileW.write(surgeonFirstName+"\t");
                        fileW.write(surgeonLastName+"\t");
                        fileW.write(date+"\n");
                        fileW.close();
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(this,"An  error occur...","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            fileS.close();
        }catch(Exception e){
                 JOptionPane.showMessageDialog(this,"No information added yet...","Error",JOptionPane.ERROR_MESSAGE);
        }  
    }
    
   

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblBangladeshHealthComplexMsg = new javax.swing.JLabel();
        panelOperationDetails = new javax.swing.JPanel();
        lblOperationDetails = new javax.swing.JLabel();
        lblOperationName = new javax.swing.JLabel();
        lblSurgeonsFirstName = new javax.swing.JLabel();
        lblSurgeonslastName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtOperationName = new javax.swing.JTextField();
        txtSurgeonFirstName = new javax.swing.JTextField();
        txtSurgeonLastName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        panelPaymentDetails = new javax.swing.JPanel();
        lblPaymentDetails = new javax.swing.JLabel();
        lblDoctorFees = new javax.swing.JLabel();
        lblMedicineCost = new javax.swing.JLabel();
        lblWardCost = new javax.swing.JLabel();
        lblOperationCost = new javax.swing.JLabel();
        lblPaidAmount = new javax.swing.JLabel();
        txtDoctorFees = new javax.swing.JTextField();
        txtMedicineCost = new javax.swing.JTextField();
        txtOperationCost = new javax.swing.JTextField();
        txtPaidAmount = new javax.swing.JTextField();
        txtTotalCost = new javax.swing.JTextField();
        txtWardCost = new javax.swing.JTextField();
        lblDueAmount = new javax.swing.JLabel();
        lblTotalCost = new javax.swing.JLabel();
        txtDueAmount = new javax.swing.JTextField();
        lbltk = new javax.swing.JLabel();
        lbltk1 = new javax.swing.JLabel();
        lbltk2 = new javax.swing.JLabel();
        lbltk3 = new javax.swing.JLabel();
        lbltk4 = new javax.swing.JLabel();
        lbltk5 = new javax.swing.JLabel();
        lbltk6 = new javax.swing.JLabel();
        panelMedicalRecord = new javax.swing.JPanel();
        lblMedicalRecord = new javax.swing.JLabel();
        lblDoctorFirstName = new javax.swing.JLabel();
        lblDoctorLastName = new javax.swing.JLabel();
        lblProblem = new javax.swing.JLabel();
        lblMedicine = new javax.swing.JLabel();
        lblWardNo = new javax.swing.JLabel();
        txtDoctorFirstName = new javax.swing.JTextField();
        txtDoctorLastName = new javax.swing.JTextField();
        txtMedicine = new javax.swing.JTextField();
        txtProblem = new javax.swing.JTextField();
        txtWardNo = new javax.swing.JTextField();
        panelPersonalInformation = new javax.swing.JPanel();
        lblPersonalInformation = new javax.swing.JLabel();
        lblPatientFirstName = new javax.swing.JLabel();
        lblPatientLastName = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPatientLastName = new javax.swing.JTextField();
        txtPatientFirstName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtlAge = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        rbtMale = new javax.swing.JRadioButton();
        rbtFemale = new javax.swing.JRadioButton();
        btSearchBox = new javax.swing.JButton();
        lblSearchBox = new javax.swing.JLabel();
        txtSearchBox = new javax.swing.JTextField();
        lblNoteMsg = new javax.swing.JLabel();
        btAdd = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        lblWelcomePageBackground = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBangladeshHealthComplexMsg.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        lblBangladeshHealthComplexMsg.setText("Bangladesh Health Complex");
        getContentPane().add(lblBangladeshHealthComplexMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 600, 100));

        panelOperationDetails.setBackground(new java.awt.Color(0, 153, 153));

        lblOperationDetails.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblOperationDetails.setText("Operation Details");

        lblOperationName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblOperationName.setText("Operation Name");

        lblSurgeonsFirstName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblSurgeonsFirstName.setText("Surgeon's First Name");

        lblSurgeonslastName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblSurgeonslastName.setText("Surgeon's Last Name");

        lblDate.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblDate.setText("Date");

        txtOperationName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtSurgeonFirstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtSurgeonLastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtDate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelOperationDetailsLayout = new javax.swing.GroupLayout(panelOperationDetails);
        panelOperationDetails.setLayout(panelOperationDetailsLayout);
        panelOperationDetailsLayout.setHorizontalGroup(
            panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperationDetailsLayout.createSequentialGroup()
                .addGroup(panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelOperationDetailsLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblOperationDetails))
                    .addGroup(panelOperationDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOperationDetailsLayout.createSequentialGroup()
                                .addComponent(lblSurgeonslastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSurgeonLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelOperationDetailsLayout.createSequentialGroup()
                                .addGroup(panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelOperationDetailsLayout.createSequentialGroup()
                                        .addComponent(lblOperationName)
                                        .addGap(36, 36, 36))
                                    .addComponent(lblSurgeonsFirstName, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSurgeonFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOperationName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelOperationDetailsLayout.createSequentialGroup()
                                .addComponent(lblDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOperationDetailsLayout.setVerticalGroup(
            panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOperationDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOperationDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOperationName)
                    .addComponent(txtOperationName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurgeonsFirstName)
                    .addComponent(txtSurgeonFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSurgeonslastName)
                    .addGroup(panelOperationDetailsLayout.createSequentialGroup()
                        .addComponent(txtSurgeonLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOperationDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(panelOperationDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 310, 180));

        panelPaymentDetails.setBackground(new java.awt.Color(0, 153, 153));

        lblPaymentDetails.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblPaymentDetails.setText("Payment Details");

        lblDoctorFees.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblDoctorFees.setText("Doctor Fees");

        lblMedicineCost.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblMedicineCost.setText("Medicine Cost");

        lblWardCost.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblWardCost.setText("Ward Cost");

        lblOperationCost.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblOperationCost.setText("Operation Cost");

        lblPaidAmount.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblPaidAmount.setText("Paid Amount");

        txtDoctorFees.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtMedicineCost.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtOperationCost.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPaidAmount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtTotalCost.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtTotalCost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTotalCostMousePressed(evt);
            }
        });

        txtWardCost.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        lblDueAmount.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblDueAmount.setText("Due Amount");

        lblTotalCost.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblTotalCost.setText("Total Cost");

        txtDueAmount.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDueAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDueAmountMousePressed(evt);
            }
        });

        lbltk.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbltk.setText("tk");

        lbltk1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbltk1.setText("tk");

        lbltk2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbltk2.setText("tk");

        lbltk3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbltk3.setText("tk");

        lbltk4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbltk4.setText("tk");

        lbltk5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbltk5.setText("tk");

        lbltk6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbltk6.setText("tk");

        javax.swing.GroupLayout panelPaymentDetailsLayout = new javax.swing.GroupLayout(panelPaymentDetails);
        panelPaymentDetails.setLayout(panelPaymentDetailsLayout);
        panelPaymentDetailsLayout.setHorizontalGroup(
            panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPaymentDetailsLayout.createSequentialGroup()
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPaymentDetailsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblDoctorFees))
                    .addGroup(panelPaymentDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMedicineCost)))
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPaymentDetailsLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDoctorFees, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbltk, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(panelPaymentDetailsLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(txtMedicineCost, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbltk1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(panelPaymentDetailsLayout.createSequentialGroup()
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPaymentDetailsLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblPaymentDetails))
                    .addGroup(panelPaymentDetailsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPaymentDetailsLayout.createSequentialGroup()
                                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOperationCost)
                                    .addComponent(lblWardCost)
                                    .addComponent(lblDueAmount)
                                    .addComponent(lblTotalCost))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtTotalCost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(txtPaidAmount, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOperationCost, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWardCost, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDueAmount)))
                            .addComponent(lblPaidAmount))
                        .addGap(12, 12, 12)
                        .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltk2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltk3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltk4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltk5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltk6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelPaymentDetailsLayout.setVerticalGroup(
            panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaymentDetailsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(lblPaymentDetails)
                .addGap(12, 12, 12)
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorFees)
                    .addComponent(txtDoctorFees, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltk, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicineCost)
                    .addComponent(txtMedicineCost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltk1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWardCost)
                    .addComponent(txtWardCost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltk2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOperationCost)
                    .addComponent(txtOperationCost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltk3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaidAmount)
                    .addComponent(txtPaidAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltk4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalCost, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotalCost)
                    .addComponent(lbltk5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPaymentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDueAmount)
                    .addComponent(txtDueAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltk6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        getContentPane().add(panelPaymentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 310, 260));

        panelMedicalRecord.setBackground(new java.awt.Color(0, 153, 153));

        lblMedicalRecord.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblMedicalRecord.setText("Medical Record");

        lblDoctorFirstName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblDoctorFirstName.setText("Doctor's First Name");

        lblDoctorLastName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblDoctorLastName.setText("Doctor's Last Name");

        lblProblem.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblProblem.setText("Problem");

        lblMedicine.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblMedicine.setText("Medicine");

        lblWardNo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblWardNo.setText("Ward No");

        txtDoctorFirstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtDoctorLastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtMedicine.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtProblem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtWardNo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelMedicalRecordLayout = new javax.swing.GroupLayout(panelMedicalRecord);
        panelMedicalRecord.setLayout(panelMedicalRecordLayout);
        panelMedicalRecordLayout.setHorizontalGroup(
            panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMedicalRecordLayout.createSequentialGroup()
                .addGroup(panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMedicalRecordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMedicine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWardNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMedicalRecordLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(lblMedicalRecord))
                    .addGroup(panelMedicalRecordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDoctorFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(lblDoctorLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDoctorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDoctorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMedicalRecordLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMedicalRecordLayout.setVerticalGroup(
            panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMedicalRecordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMedicalRecord)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProblem)
                    .addComponent(txtProblem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoctorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorFirstName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorLastName)
                    .addComponent(txtDoctorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicine)
                    .addComponent(txtMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(panelMedicalRecordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWardNo)
                    .addComponent(txtWardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        getContentPane().add(panelMedicalRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 300, 260));

        panelPersonalInformation.setBackground(new java.awt.Color(0, 153, 153));

        lblPersonalInformation.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        lblPersonalInformation.setText("Personal Information");

        lblPatientFirstName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblPatientFirstName.setText("First Name");

        lblPatientLastName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblPatientLastName.setText("Last Name");

        lblID.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblID.setText("ID");

        lblAge.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblAge.setText("Age");

        lblGender.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblGender.setText("Gender");

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblPhoneNumber.setText("Phone Number");

        lblEmail.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblEmail.setText("Email");

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPatientLastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPatientFirstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtlAge.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        rbtMale.setBackground(new java.awt.Color(0, 153, 153));
        rbtMale.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        rbtMale.setText("Male");
        rbtMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtMaleActionPerformed(evt);
            }
        });

        rbtFemale.setBackground(new java.awt.Color(0, 153, 153));
        rbtFemale.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        rbtFemale.setText("Female");
        rbtFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtFemaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPersonalInformationLayout = new javax.swing.GroupLayout(panelPersonalInformation);
        panelPersonalInformation.setLayout(panelPersonalInformationLayout);
        panelPersonalInformationLayout.setHorizontalGroup(
            panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPersonalInformationLayout.createSequentialGroup()
                        .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPersonalInformationLayout.createSequentialGroup()
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPersonalInformationLayout.createSequentialGroup()
                        .addComponent(lblPatientLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonalInformationLayout.createSequentialGroup()
                        .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPersonalInformationLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rbtMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbtFemale))
                            .addGroup(panelPersonalInformationLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(txtlAge))))
                    .addGroup(panelPersonalInformationLayout.createSequentialGroup()
                        .addComponent(lblPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPersonalInformationLayout.createSequentialGroup()
                        .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonalInformationLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPersonalInformation)
                .addGap(38, 38, 38))
        );
        panelPersonalInformationLayout.setVerticalGroup(
            panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPersonalInformation)
                .addGap(13, 13, 13)
                .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbtMale, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbtFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelPersonalInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 260));

        btSearchBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/Search Logo.png"))); // NOI18N
        btSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchBoxActionPerformed(evt);
            }
        });
        getContentPane().add(btSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 40, 40));

        lblSearchBox.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblSearchBox.setForeground(new java.awt.Color(153, 153, 153));
        lblSearchBox.setText("Patient's Id");
        getContentPane().add(lblSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 130, 40));

        txtSearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchBoxKeyTyped(evt);
            }
        });
        getContentPane().add(txtSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 360, 40));

        lblNoteMsg.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblNoteMsg.setText("Note : If you don't have any informatoin then fill none and zero for payment ");
        getContentPane().add(lblNoteMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        btAdd.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/add logo.png"))); // NOI18N
        btAdd.setText("Add");
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });
        getContentPane().add(btAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 150, 50));

        btDelete.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/delete logo.png"))); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 170, 50));

        btUpdate.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/update logo.png"))); // NOI18N
        btUpdate.setText("Update");
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 160, 50));

        btClear.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/clear logo.png"))); // NOI18N
        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        getContentPane().add(btClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, 150, 50));

        btBack.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/back logo.png"))); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 150, 50));

        lblWelcomePageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/healthComplex/Background2.jpg"))); // NOI18N
        lblWelcomePageBackground.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lblWelcomePageBackgroundFocusGained(evt);
            }
        });
        getContentPane().add(lblWelcomePageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtMaleActionPerformed
        rbtFemale.setSelected(false);
    }//GEN-LAST:event_rbtMaleActionPerformed

    private void rbtFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtFemaleActionPerformed
        rbtMale.setSelected(false);
    }//GEN-LAST:event_rbtFemaleActionPerformed

    private void txtTotalCostMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTotalCostMousePressed
         billCalculation();
    }//GEN-LAST:event_txtTotalCostMousePressed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        setVisible(false);
        MenuPage m = new MenuPage();
        m.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    private void lblWelcomePageBackgroundFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblWelcomePageBackgroundFocusGained
        lblSearchBox.setVisible(false);
        if(txtSearchBox.getText().isEmpty()){
            lblSearchBox.setVisible(true);
        }
    }//GEN-LAST:event_lblWelcomePageBackgroundFocusGained

    private void txtSearchBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBoxKeyTyped
        lblSearchBox.setVisible(false);
        if(txtSearchBox.getText().isEmpty()){
            lblSearchBox.setVisible(true);
        }
    }//GEN-LAST:event_txtSearchBoxKeyTyped

    private void txtDueAmountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDueAmountMousePressed
        billCalculation();
    }//GEN-LAST:event_txtDueAmountMousePressed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        if(txtID.getText().isEmpty()&&txtPatientFirstName.getText().isEmpty()&&
        txtPatientLastName.getText().isEmpty()&&txtlAge.getText().isEmpty()&&
        rbtMale.isSelected()==false&&rbtFemale.isSelected()==false&&
        txtPhoneNumber.getText().isEmpty()&&txtEmail.getText().isEmpty()&&
        
        txtProblem.getText().isEmpty()&&txtDoctorFirstName.getText().isEmpty()&&
        txtDoctorLastName.getText().isEmpty()&&txtMedicine.getText().isEmpty()&&
        txtWardNo.getText().isEmpty()&&
                
        txtDoctorFees.getText().isEmpty()&&txtMedicineCost.getText().isEmpty()&&
        txtWardCost.getText().isEmpty()&&txtOperationCost.getText().isEmpty()&&
        txtPaidAmount.getText().isEmpty()&&txtTotalCost.getText().isEmpty()&&
        txtWardCost.getText().isEmpty()&&
                
        txtOperationName.getText().isEmpty()&&txtSurgeonFirstName.getText().isEmpty()&&
        txtSurgeonLastName.getText().isEmpty()&&txtDate.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"All fields are empty...","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            clearField();
        }

    }//GEN-LAST:event_btClearActionPerformed

    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        if(isFieldEmpty()>0){
            addInfo();
            JOptionPane.showMessageDialog(this,"Information added successfully..."," ",JOptionPane.INFORMATION_MESSAGE);
            clearField();
        }
        else{
           JOptionPane.showMessageDialog(this,"Fill all the fields...","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btAddActionPerformed

    private void btSearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchBoxActionPerformed
        if(txtSearchBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Input patient's id first...","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            searchID = txtSearchBox.getText();
            clearField();
            try{
                File file = new File("Patient.txt");
                Scanner fileS = new Scanner(file);
                while(fileS.hasNext()){
                    //personal details
                    ID=fileS.next();
                    patientFirstName=fileS.next();
                    patientLastName=fileS.next();
                    age=fileS.next();
                    gender=fileS.next();
                    phoneNo=fileS.next();
                    email=fileS.next();        
                    //medical records
                    problem=fileS.next();
                    doctorFirstName=fileS.next();
                    doctorLastName=fileS.next();
                    medicine=fileS.next();
                    wardNo=fileS.next();
                    //payment details
                    doctorFess=fileS.next();
                    medicineCost=fileS.next();        
                    wardCost=fileS.next();
                    operationCost=fileS.next();
                    paidAmount=fileS.next();
                    totalCost=fileS.next();        
                    dueAmount=fileS.next();
                    //operation details
                    operationName=fileS.next();
                    surgeonFirstName=fileS.next();
                    surgeonLastName=fileS.next();  
                    date=fileS.next();
                    if(searchID.equals(ID)){
                        //personal details
                        txtID.setText(ID);
                        txtPatientFirstName.setText(patientFirstName);
                        txtPatientLastName.setText(patientLastName);
                        txtlAge.setText(age);
                        if(gender.equalsIgnoreCase("male")){
                            rbtMale.setSelected(true); 
                        }
                        if(gender.equalsIgnoreCase("female")){
                            rbtFemale.setSelected(true); 
                        }
                        txtPhoneNumber.setText(phoneNo);
                        txtEmail.setText(email);
                        //medical records
                        txtProblem.setText(problem);
                        txtDoctorFirstName.setText(doctorFirstName);
                        txtDoctorLastName.setText(doctorLastName);
                        txtMedicine.setText(medicine);
                        txtWardNo.setText(wardNo);
                        //payment details
                        txtDoctorFees.setText(doctorFess);
                        txtMedicineCost.setText(medicineCost);
                        txtWardCost.setText(wardCost);
                        txtOperationCost.setText(operationCost);
                        txtPaidAmount.setText(paidAmount);
                        txtTotalCost.setText(totalCost);        
                        txtDueAmount.setText(dueAmount);
                        //operation details
                        txtOperationName.setText(operationName);
                        txtSurgeonFirstName.setText(surgeonFirstName);
                        txtSurgeonLastName.setText(surgeonLastName);       
                        txtDate.setText(date); 
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Information not found...","Error",JOptionPane.ERROR_MESSAGE);
                    }           
                }
                fileS.close();
            }catch(Exception e){
                 JOptionPane.showMessageDialog(this,"No information added yet...","Error",JOptionPane.ERROR_MESSAGE);
            }
            txtSearchBox.setText(null);
        }
    }//GEN-LAST:event_btSearchBoxActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        if(isFieldEmpty()>0){
            int option=JOptionPane.showConfirmDialog(null,"Are you sure ? ","Delete",JOptionPane.YES_NO_OPTION);
            if(option==0){
                createTempFile();
                File file = new File("Patient.txt");
                file.delete();
                File tempFile = new File("Temp.txt");
                File newFile = new File("Patient.txt");
                tempFile.renameTo(newFile);
                JOptionPane.showMessageDialog(this,"Information Deleted Succesfully...");
                clearField();
            }
        }
        else{
           JOptionPane.showMessageDialog(this,"Search information first...","Warning",JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        if(isFieldEmpty()>0){
            int option=JOptionPane.showConfirmDialog(null,"Are you sure ? ","Delete",JOptionPane.YES_NO_OPTION);
            if(option==0){
                createTempFile();
                File file = new File("Patient.txt");
                file.delete();
                File tempFile = new File("Temp.txt");
                File newFile = new File("Patient.txt");
                tempFile.renameTo(newFile);
                addInfo();
                JOptionPane.showMessageDialog(this,"Information Updated Succesfully...");
                clearField();
            }
        }
        else{
           JOptionPane.showMessageDialog(this,"Search information first...","Warning",JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_btUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(ManageInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageInformationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageInformationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSearchBox;
    private javax.swing.JButton btUpdate;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBangladeshHealthComplexMsg;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctorFees;
    private javax.swing.JLabel lblDoctorFirstName;
    private javax.swing.JLabel lblDoctorLastName;
    private javax.swing.JLabel lblDueAmount;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblMedicalRecord;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblMedicineCost;
    private javax.swing.JLabel lblNoteMsg;
    private javax.swing.JLabel lblOperationCost;
    private javax.swing.JLabel lblOperationDetails;
    private javax.swing.JLabel lblOperationName;
    private javax.swing.JLabel lblPaidAmount;
    private javax.swing.JLabel lblPatientFirstName;
    private javax.swing.JLabel lblPatientLastName;
    private javax.swing.JLabel lblPaymentDetails;
    private javax.swing.JLabel lblPersonalInformation;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblProblem;
    private javax.swing.JLabel lblSearchBox;
    private javax.swing.JLabel lblSurgeonsFirstName;
    private javax.swing.JLabel lblSurgeonslastName;
    private javax.swing.JLabel lblTotalCost;
    private javax.swing.JLabel lblWardCost;
    private javax.swing.JLabel lblWardNo;
    private javax.swing.JLabel lblWelcomePageBackground;
    private javax.swing.JLabel lbltk;
    private javax.swing.JLabel lbltk1;
    private javax.swing.JLabel lbltk2;
    private javax.swing.JLabel lbltk3;
    private javax.swing.JLabel lbltk4;
    private javax.swing.JLabel lbltk5;
    private javax.swing.JLabel lbltk6;
    private javax.swing.JPanel panelMedicalRecord;
    private javax.swing.JPanel panelOperationDetails;
    private javax.swing.JPanel panelPaymentDetails;
    private javax.swing.JPanel panelPersonalInformation;
    private javax.swing.JRadioButton rbtFemale;
    private javax.swing.JRadioButton rbtMale;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctorFees;
    private javax.swing.JTextField txtDoctorFirstName;
    private javax.swing.JTextField txtDoctorLastName;
    private javax.swing.JTextField txtDueAmount;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtMedicineCost;
    private javax.swing.JTextField txtOperationCost;
    private javax.swing.JTextField txtOperationName;
    private javax.swing.JTextField txtPaidAmount;
    private javax.swing.JTextField txtPatientFirstName;
    private javax.swing.JTextField txtPatientLastName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtProblem;
    private javax.swing.JTextField txtSearchBox;
    private javax.swing.JTextField txtSurgeonFirstName;
    private javax.swing.JTextField txtSurgeonLastName;
    private javax.swing.JTextField txtTotalCost;
    private javax.swing.JTextField txtWardCost;
    private javax.swing.JTextField txtWardNo;
    private javax.swing.JTextField txtlAge;
    // End of variables declaration//GEN-END:variables
}
