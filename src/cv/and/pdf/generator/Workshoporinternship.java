/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv.and.pdf.generator;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sony
 */
public class Workshoporinternship extends javax.swing.JFrame {
String username;
    /**
     * Creates new form Workshoporinternship
     */
    public Workshoporinternship() {
        initComponents();
    }
 public Workshoporinternship(String u) {
        initComponents();
        username=u;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        button1 = new java.awt.Button();
        t1 = new java.awt.TextArea();
        t2 = new java.awt.TextArea();
        label6 = new java.awt.Label();
        t3 = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        label2.setText("WORKSHOP ATTENDED");

        label4.setText("INTERNSHIP");

        button1.setFont(new java.awt.Font("Baskerville Old Face", 1, 12)); // NOI18N
        button1.setLabel("NEXT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label6.setText("ACHIEVEMENT");

        jLabel1.setFont(new java.awt.Font("Pristina", 1, 12)); // NOI18N
        jLabel1.setText("PLEASE FILL THE WORKSHOP DETAILS");

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 12)); // NOI18N
        jLabel2.setText("PLEASE FILL THE INTERNSHIP DETAILS");

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 12)); // NOI18N
        jLabel3.setText("PLEASE FILL THE ACHIEVEMENTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(140, 140, 140)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(141, 141, 141))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       String w;
       w=t1.getText();
       myconnection obj=new myconnection();
       try
       {
           String q2="select * from tbworkshop where user=?";
           PreparedStatement pst1=obj.db.prepareStatement(q2);
           pst1.setString(1, username);
           ResultSet rs;
           rs=pst1.executeQuery();
           if(rs.next())
           {
               String q3="update tbworkshop set workshop=? where user=?";
              PreparedStatement pst2=obj.db.prepareStatement(q3);
              pst2.setString(1, w);
              pst2.setString(2,username);
              pst2.executeUpdate();
           }
           else
           {
       try
       {
String q="insert into tbworkshop(user,workshop) values(?,?)";
        PreparedStatement pst=obj.db.prepareStatement(q);
pst.setString(1,username);
pst.setString(2, w);
pst.executeUpdate();
       }
catch(SQLException e)
{
    System.out.println(e.getMessage());// TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed
           }
       }
       catch(Exception e)
       {
           System.out.println(e.getMessage());
       }
       String i;
i=t2.getText();
try
{
    String q1="select * from tbinternship where user=?";
    PreparedStatement pst1=obj.db.prepareStatement(q1);
           pst1.setString(1, username);
           ResultSet rs;
           rs=pst1.executeQuery();
           if(rs.next())
           {
               String q4="update tbinernship set internship=? where user=?";
              PreparedStatement pst2=obj.db.prepareStatement(q4);
              pst2.setString(1, i);
              pst2.setString(2,username);
              pst2.executeUpdate(); 
           }
           else
           {
try
{
    String q="insert into tbinternship(user,internship) values(?,?)";
    PreparedStatement pst=obj.db.prepareStatement(q);
    pst.setString(1,username);
    pst.setString(2, i);
    pst.executeUpdate();
}
catch(SQLException e)
{
    System.out.println(e.getMessage());
}}
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}
String a;
a=t3.getText();
try
{
      String q5="select * from tbachievement where user=?";
    PreparedStatement pst1=obj.db.prepareStatement(q5);
           pst1.setString(1, username);
           ResultSet rs;
           rs=pst1.executeQuery();
           if(rs.next())
           {         
               String q6="update tbachievement set achievement=? where user=?";
               PreparedStatement pst2=obj.db.prepareStatement(q6);
              pst2.setString(1, a);
              pst2.setString(2,username);
              pst2.executeUpdate(); 
           }
           else
           {
try
{
    String q="insert into tbachievement(user,achievement) values(?,?)";
    PreparedStatement pst=obj.db.prepareStatement(q);
    pst.setString(1, username);
    pst.setString(2, a);
    pst.executeUpdate();
}
catch(SQLException e)
{
    System.out.println(e.getMessage());
}
           }
}
catch(Exception e)
{
    System.out.println(e.getMessage());
}
Choice obj1=new Choice(username);
obj1.setVisible(true);
this.setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(Workshoporinternship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workshoporinternship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workshoporinternship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workshoporinternship.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workshoporinternship().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label6;
    private java.awt.TextArea t1;
    private java.awt.TextArea t2;
    private java.awt.TextArea t3;
    // End of variables declaration//GEN-END:variables
}
