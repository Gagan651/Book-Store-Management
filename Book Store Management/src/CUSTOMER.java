
//import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Project.ConncetionProvider;
import java.awt.Color;
import static java.lang.String.valueOf;
import static javafx.beans.binding.Bindings.not;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gagan
 */
public class CUSTOMER extends javax.swing.JFrame {

    /**
     * Creates new form CUSTOMER
     */
    public CUSTOMER() {
        initComponents();
           DefaultTableModel model=( DefaultTableModel)jTableCustomer.getModel();
        
        try
                {
                     Connection con=ConncetionProvider.getCon();
						String query="select * from CUSTOMER";
						PreparedStatement pst1=con.prepareStatement(query);
						ResultSet rs=pst1.executeQuery();
                    
                    while(rs.next())
                    {
                       model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
                    }
                    
                }
            catch(Exception e)
                    {
                        
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

        jLabelCID = new javax.swing.JLabel();
        jLabelCname = new javax.swing.JLabel();
        jLabelPhoneNo = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelMailID = new javax.swing.JLabel();
        jTextFieldCID = new javax.swing.JTextField();
        jTextFieldCName = new javax.swing.JTextField();
        jTextFieldPhoneNo = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldMailID = new javax.swing.JTextField();
        jButtonADD = new javax.swing.JButton();
        jButtonVIEW = new javax.swing.JButton();
        jButtonRESET = new javax.swing.JButton();
        jButtonDELETE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustomer = new javax.swing.JTable();
        jButtonEXIT = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCID.setText("CID");
        getContentPane().add(jLabelCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabelCname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCname.setText("CNAME");
        getContentPane().add(jLabelCname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabelPhoneNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelPhoneNo.setText("PHONE NO");
        getContentPane().add(jLabelPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        jLabelAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelAddress.setText("ADDRESS");
        getContentPane().add(jLabelAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jLabelMailID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMailID.setText("MAIL ID");
        getContentPane().add(jLabelMailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jTextFieldCID.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jTextFieldCID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 200, -1));

        jTextFieldCName.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jTextFieldCName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 200, -1));

        jTextFieldPhoneNo.setBackground(new java.awt.Color(255, 255, 204));
        jTextFieldPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneNoKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 200, -1));

        jTextFieldAddress.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jTextFieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 200, -1));

        jTextFieldMailID.setBackground(new java.awt.Color(255, 255, 204));
        jTextFieldMailID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMailIDKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldMailID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 200, -1));

        jButtonADD.setBackground(new java.awt.Color(255, 255, 204));
        jButtonADD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonADD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jButtonADD.setText("ADD");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        jButtonVIEW.setBackground(new java.awt.Color(255, 255, 204));
        jButtonVIEW.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonVIEW.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view.png"))); // NOI18N
        jButtonVIEW.setText("VIEW");
        jButtonVIEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVIEWActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVIEW, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        jButtonRESET.setBackground(new java.awt.Color(255, 255, 204));
        jButtonRESET.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRESET.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset.png"))); // NOI18N
        jButtonRESET.setText("RESET");
        jButtonRESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRESETActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, -1));

        jButtonDELETE.setBackground(new java.awt.Color(255, 255, 204));
        jButtonDELETE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonDELETE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButtonDELETE.setText("DELETE");
        jButtonDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDELETEActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 430, -1, -1));

        jTableCustomer.setBackground(new java.awt.Color(255, 255, 204));
        jTableCustomer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CUSTOMER_ID", "CUSTOMER_NAME", "PH0NE_NO", "ADDRESS", "MAIL_ID"
            }
        ));
        jScrollPane1.setViewportView(jTableCustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 670, 230));

        jButtonEXIT.setBackground(new java.awt.Color(255, 255, 204));
        jButtonEXIT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonEXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit1.png"))); // NOI18N
        jButtonEXIT.setText("EXIT");
        jButtonEXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEXITActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEXIT, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel2.setText("CUSTOMER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 100, -1));

        jLabel4.setFont(new java.awt.Font("Colonna MT", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/123456 - Copy.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed
        // TODO add your handling code here:
        String CID = jTextFieldCID.getText();
        String Phoneno= jTextFieldPhoneNo.getText();
	String address = jTextFieldAddress.getText();
	String mailid = jTextFieldMailID.getText();
	String cname = jTextFieldCName.getText();
        
     
        
          if(Phoneno.matches("^[0-9]*$") && Phoneno.length()==10 && mailid .matches("^[_a-za-z0-9-]+(\\.[_a-za-z0-9-]+)*@[a-za-z0-9-]+(\\.[a-za-z0-9-]+)*(\\.[a-za-z]{2,})$") )
          {
              
         
			try {
                        
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","disha","gagan");
				        
			
                        String sql="INSERT INTO CUSTOMER (Customer_id,Customer_name,PHone_NO,ADDRESS,MAIL_ID)VALUES('"+CID+"','"+cname+"','"+Phoneno+"','"+address+"','"+mailid+"')";
                        PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
                        
			JOptionPane.showMessageDialog(null,"Data Inserted Successfully");
				       		       
				    } catch(Exception e) 
                                    {
                                        System.out.println(e);
                    JOptionPane.showMessageDialog(null,"enter data is incorrect please check once \n *Customerid exist \n *Customerid invalid (Check the format of Customerid ) \n *invalid Mailid or Phonenumber");
				}
                         }
         else
         {
            
            JOptionPane.showMessageDialog(null,"enter data is incorrect please check once \n *Customerid exist \n *Customerid invalid (Check the format of Customerid ) \n *invalid Mailid or Phonenumber");
             
         }
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonVIEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVIEWActionPerformed
        // TODO add your handling code here:
          try 
	{
            Connection con=ConncetionProvider.getCon();
            String query="select * from CUSTOMER";
            PreparedStatement pst1=con.prepareStatement(query);
            ResultSet rs=pst1.executeQuery();
            jTableCustomer.setModel(DbUtils.resultSetToTableModel(rs));
	}
            catch (Exception e) 
		{
                    e.printStackTrace();
		}
    }//GEN-LAST:event_jButtonVIEWActionPerformed

    private void jButtonRESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRESETActionPerformed
        // TODO add your handling code here:
        jTextFieldAddress.setText(null);
        jTextFieldCName.setText(null);
        jTextFieldCID.setText(null);
        jTextFieldMailID.setText(null);
        jTextFieldPhoneNo.setText(null);
       
    }//GEN-LAST:event_jButtonRESETActionPerformed

    private void jButtonDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDELETEActionPerformed
        // TODO add your handling code here:
           int row = jTableCustomer.getSelectedRow();
				System.out.println(row);
				String cell = jTableCustomer.getModel().getValueAt(row, 0).toString();
				String query="delete from customer where CUSTOMER_ID='"+cell+"'";
				System.out.println(query);
				
				
				try 
				{
                                        Connection con=ConncetionProvider.getCon();
					PreparedStatement pst2=con.prepareStatement(query);
					pst2.executeQuery();
					JOptionPane.showMessageDialog(null,"Row Deleted Successful");
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
    }//GEN-LAST:event_jButtonDELETEActionPerformed

    private void jButtonEXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEXITActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButtonEXITActionPerformed

    private void jTextFieldPhoneNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNoKeyReleased
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jTextFieldPhoneNoKeyReleased

    private void jTextFieldMailIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMailIDKeyReleased
        // TODO add your handling code here:

                    
        
    }//GEN-LAST:event_jTextFieldMailIDKeyReleased

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
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CUSTOMER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CUSTOMER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonDELETE;
    private javax.swing.JButton jButtonEXIT;
    private javax.swing.JButton jButtonRESET;
    private javax.swing.JButton jButtonVIEW;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelCID;
    private javax.swing.JLabel jLabelCname;
    private javax.swing.JLabel jLabelMailID;
    private javax.swing.JLabel jLabelPhoneNo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustomer;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldCID;
    private javax.swing.JTextField jTextFieldCName;
    private javax.swing.JTextField jTextFieldMailID;
    private javax.swing.JTextField jTextFieldPhoneNo;
    // End of variables declaration//GEN-END:variables
}
