/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

/**
 *
 * @author tushaar
 */
public class Help extends javax.swing.JFrame {

    /**
     * Creates new form Help
     */
    private static Help helpInstance = null ;
    
    public Help() {
        initComponents();
    }

    static Help getInstance() {
        if(helpInstance == null)
            helpInstance = new Help() ;
        return helpInstance ;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Help");
        setPreferredSize(new java.awt.Dimension(1026, 600));
        getContentPane().setLayout(null);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(100, 380, 826, 10);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 34, 45));
        jLabel1.setText("Contact Us");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 420, 130, 44);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(26, 34, 45));
        jLabel2.setText("Help");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 50, 60, 44);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(26, 34, 45));
        jLabel3.setText("+1 (703) 282-9446");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(790, 510, 150, 21);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(26, 34, 45));
        jLabel4.setText("Reservation");
        jLabel4.setToolTipText("");
        jLabel4.setDoubleBuffered(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 175, 130, 24);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(26, 34, 45));
        jLabel5.setText("   info@bonvoyage.com");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(750, 470, 190, 21);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(26, 34, 45));
        jLabel6.setText("            Bon Voyage");
        jLabel6.setToolTipText("");
        jLabel6.setDoubleBuffered(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(790, 430, 150, 21);

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(26, 34, 45));
        jLabel7.setText("Further details and information about us can be viewed at");
        jLabel7.setToolTipText("");
        jLabel7.setDoubleBuffered(true);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(100, 310, 540, 24);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(26, 34, 45));
        jLabel8.setText(" bonvoyage.com");
        jLabel8.setToolTipText("");
        jLabel8.setDoubleBuffered(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(640, 310, 170, 24);

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(26, 34, 45));
        jLabel9.setText("can be used to cancel booked tickets using the obtained ticket number");
        jLabel9.setToolTipText("");
        jLabel9.setDoubleBuffered(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(290, 220, 660, 24);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(26, 34, 45));
        jLabel10.setText("Ticket Availability ");
        jLabel10.setToolTipText("");
        jLabel10.setDoubleBuffered(true);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 130, 180, 24);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(26, 34, 45));
        jLabel11.setText("   can be used to check the availability of flights for a particular date and route");
        jLabel11.setToolTipText("");
        jLabel11.setDoubleBuffered(true);
        getContentPane().add(jLabel11);
        jLabel11.setBounds(260, 130, 730, 24);

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(26, 34, 45));
        jLabel12.setText("Ticket Cancellation");
        jLabel12.setToolTipText("");
        jLabel12.setDoubleBuffered(true);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(100, 220, 190, 24);

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(26, 34, 45));
        jLabel13.setText("can be used to book flight tickets for a particular date by entering the bank details");
        jLabel13.setToolTipText("");
        jLabel13.setDoubleBuffered(true);
        getContentPane().add(jLabel13);
        jLabel13.setBounds(220, 176, 790, 24);

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(26, 34, 45));
        jLabel14.setText("Ticket Number");
        jLabel14.setToolTipText("");
        jLabel14.setDoubleBuffered(true);
        getContentPane().add(jLabel14);
        jLabel14.setBounds(100, 265, 150, 24);

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(26, 34, 45));
        jLabel15.setText(" obtained during ticket booking is to be noted and used while cancellation");
        jLabel15.setToolTipText("");
        jLabel15.setDoubleBuffered(true);
        getContentPane().add(jLabel15);
        jLabel15.setBounds(240, 264, 700, 30);

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton1.setLabel("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(920, 60, 60, 32);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airline/resources/air_8.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(-230, -80, 1350, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Welcome welcome = Welcome.getInstance() ;
        welcome.main() ;
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Help.getInstance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}