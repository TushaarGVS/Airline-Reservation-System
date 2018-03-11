/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import javax.swing.JOptionPane;

/**
 *
 * @author tushaar
 */
public class Guest_Page extends javax.swing.JFrame {

    /**
     * Creates new form Guest_Page
     */
    public Guest_Page() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1026, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(251, 252, 253));
        jLabel1.setText("Bon Voyage Airline Reservation System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 90, 465, 44);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Welcome, passenger!");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 210, 260, 44);

        jList1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jList1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Search for Flights", "Enter Passenger Information", "Ticket Reservation", "Ticket Information" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jList1.setToolTipText("");
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(170, 280, 370, 110);

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton2.setText("Continue");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(440, 470, 100, 30);

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(690, 470, 100, 30);

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(860, 470, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airline/resources/air_29.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, -20, 1050, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jList1.getSelectedValue() == "Enter Passenger Information") {  
            Passenger p=new Passenger();
            p.setVisible(true);
            this.setVisible(false);
        } else if(jList1.getSelectedValue() == "Ticket Reservation") {
            TicketReservation TR = new TicketReservation();
            TR.setVisible(true);
            this.setVisible(false);
        } else if(jList1.getSelectedValue() == "Ticket Information") {
            FlightInformation FI = new FlightInformation();
            FI.setVisible(true);
            this.setVisible(false);
        } else {
            Flight_Guest FG = new Flight_Guest() ;
            FG.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: 
        Select_User su = new Select_User();
        su.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane exit=new JOptionPane();
        exit.showMessageDialog (null, "Thanks For using\n Bon Voyage Airline Reservation System", "Airline", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Guest_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guest_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guest_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guest_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guest_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
