
package cliniqe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DZ Laptops
 */
public class Prescription extends javax.swing.JFrame {

   Connection con;
    PreparedStatement pst;
    ResultSet rs;
    public Prescription() {
        initComponents();
        table();
        patient();
        Traitement();
    }
    
    public void patient(){
        try {
            connect();
            String sql="select nom from patient";
            pst= con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next()){
                txtpatients.addItem(rs.getString("nom"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  public void Traitement(){
        try {
            connect();
            String sql="select nom from traitement";
            pst= con.prepareStatement(sql);
            rs=pst.executeQuery();
            
            while(rs.next()){
                txttraitement.addItem(rs.getString("nom"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public void connect(){
        try {
          Class.forName("com.mysql.jdbc.Driver");	
          con=DriverManager.getConnection("jdbc:mysql://localhost/cabinet?user=root");
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtalergie = new javax.swing.JTextField();
        txtpatients = new javax.swing.JComboBox<>();
        txttraitement = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtmedicament = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        txtdose = new javax.swing.JTextField();
        txtprix = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(26);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 255));
        jButton1.setText("MODIFER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 204, 102));
        jButton2.setText("ACTUALISER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setText("AJOUTER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 0, 51));
        jButton4.setText("MENUE PRINCIPAL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 0, 51));
        jButton5.setText("SUPPRIMER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AJOUTER LES PRESCRIPTION");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel2.setText("PATIENTS");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel3.setText("ALERGIE");

        txtalergie.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N

        txtpatients.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N

        txttraitement.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel4.setText("TRAITEMENT");

        jButton6.setBackground(new java.awt.Color(255, 102, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        jLabel5.setText("MEDICAMENT");

        txtmedicament.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        txtmedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmedicamentActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 204, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        txtdose.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        txtdose.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdose.setText("dose");

        txtprix.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        txtprix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprix.setText("prix");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtpatients, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                        .addComponent(txtalergie)))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                            .addComponent(txttraitement, 0, 327, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                            .addComponent(txtmedicament)
                                            .addComponent(txtprix, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtpatients, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txttraitement, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtalergie, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1243, 715));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     
      txtalergie.setText("");
      txtmedicament.setText("");
     
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Prescription.super.dispose();
        MenuePrincipal men=new MenuePrincipal();
        men.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
              try {
            connect();
            pst=con.prepareStatement("delete from prescription where code=?");
                     int code =jTable1.getSelectedRow();
                     String selectionner=(String)jTable1.getValueAt(code, 0);
                       pst.setString(1, selectionner);
                       pst.executeUpdate();
                       con.close();
                       JOptionPane.showMessageDialog(null,"Prescription Supprimer ");
                       table();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"erreur"+e.getMessage());
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            connect();
            pst=con.prepareStatement("insert into  prescription (patient,alergie,traitement,medicament,prix,dose)"+"values(?,?,?,?,?,?)");
                       pst.setString(1,txtpatients.getSelectedItem().toString().toUpperCase());
                       pst.setString(2,txtalergie.getText().toUpperCase());
                       pst.setString(3,txttraitement.getSelectedItem().toString().toUpperCase());
                       pst.setString(4,txtmedicament.getText().toUpperCase());
                       pst.setString(5,txtprix.getText().toUpperCase());
                       pst.setString(6,txtdose.getText().toUpperCase());
                       pst.executeUpdate();
                       con.close();
                       JOptionPane.showMessageDialog(null,"Prescription est  ajouter ");
                       table();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"erreur"+e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             try {
            connect();
            pst=con.prepareStatement("update prescription set patient=?,alergie=?,traitement=?,medicament=?,prix=?,dose=?"+
                       "where code=?");
                     int code =jTable1.getSelectedRow();
                     String selectionner=(String)jTable1.getValueAt(code, 0);
                       pst.setString(1,txtpatients.getSelectedItem().toString().toUpperCase());
                       pst.setString(2,txtalergie.getText().toUpperCase());
                       pst.setString(3,txttraitement.getSelectedItem().toString().toUpperCase());
                       pst.setString(4,txtmedicament.getText().toUpperCase());
                       pst.setString(5,txtprix.getText().toUpperCase());
                       pst.setString(6,txtdose.getText().toUpperCase());
                       pst.setString(7, selectionner);
                       pst.executeUpdate();
                       con.close();
                       JOptionPane.showMessageDialog(null,"Prescription Modifer ");
                       table();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"erreur"+e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
       int select =jTable1.getSelectedRow();
       DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        txtpatients.setSelectedItem(model.getValueAt(select, 1).toString());
        txtalergie.setText(model.getValueAt(select, 2).toString());
        txttraitement.setSelectedItem(model.getValueAt(select, 3).toString());
        txtmedicament.setText(model.getValueAt(select, 4).toString());
        txtprix.setText(model.getValueAt(select, 5).toString());
        txtdose.setText(model.getValueAt(select, 6).toString());
    }//GEN-LAST:event_jTable1MouseReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try {
            connect();
            String sql="select alergie from patient where nom=?";
            pst= con.prepareStatement(sql);
            pst.setString(1,txtpatients.getSelectedItem().toString());
            rs=pst.executeQuery();
            
            while(rs.next()){
                txtalergie.setText(rs.getString("alergie"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            connect();
            String sql="select medicament,prix,dose from traitement where nom=?";
            pst= con.prepareStatement(sql);
            pst.setString(1,txttraitement.getSelectedItem().toString());
            rs=pst.executeQuery();
            
            while(rs.next()){
                txtmedicament.setText(rs.getString("medicament"));
                txtprix.setText(rs.getString("prix"));
                txtdose.setText(rs.getString("dose"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtmedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmedicamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedicamentActionPerformed
    //for show the tabel in application             
    public void table(){
         String []patient={"CODE","PATIENT","ALERGIE","TRAITEMENT","MEDICAMENT","PRIX(DA)","DOSE"}; 
                  String [] montrer=new String[8];
                  DefaultTableModel model= new DefaultTableModel(null,patient);
                   String sql="select *from prescription"; 
                    try {
                     connect();
                        Statement st = con.createStatement();
                        rs= st.executeQuery(sql);
                        while (rs.next()) {
                            montrer[0]=rs.getString("code");
                            montrer[1]=rs.getString("patient");
                            montrer[2]=rs.getString("alergie");
                            montrer[3]=rs.getString("traitement");
                            montrer[4]=rs.getString("medicament");
                            montrer[5]=rs.getString("prix");
                            montrer[6]=rs.getString("dose");
                            model.addRow(montrer);
                        }
               jTable1.setModel(model);
               con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
                }
        
    
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
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prescription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtalergie;
    private javax.swing.JTextField txtdose;
    private javax.swing.JTextField txtmedicament;
    private javax.swing.JComboBox<String> txtpatients;
    private javax.swing.JTextField txtprix;
    private javax.swing.JComboBox<String> txttraitement;
    // End of variables declaration//GEN-END:variables
}
