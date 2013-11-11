/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lehigh.cse216.fall13.bugs.gui;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import edu.lehigh.cse216.fall13.bugs.controller.BugTableModel;
import edu.lehigh.cse216.fall13.bugs.database.DatabaseManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * 
 * @author hansen
 */
public class MainGui extends javax.swing.JFrame implements WindowListener {

    /**
     * List model allows us to add any object type to our JList
     * In our case we will be using bugs.
     * We should double check to see if this loads correctly with
     * autogenerated code.
     */
    private ArrayList bugList = new ArrayList<Bug>();
    
    /**
     * Creates new form EditView
     */
    public MainGui() {
        initComponents();
        
        // We can't actually use this code yet because our database manager 
        // does not fetch correctly.
        for (int i = 1; i< 6 ; i++){
            bugList.add(new Bug(i)); //TODO: Refactor to tests
        }
        
        /*
        for (Bug b : DatabaseManager.instance.listBugs()) {
            listModel.addElement(b);
        }
        */
        quitButton.addActionListener(new ExitListener());
        this.addWindowListener(this);
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
        addButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bugTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setText("WELCOME to bugs and issues!");

        addButton.setText("Add Bug");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        quitButton.setText("Quit");

        bugTable.setModel(new BugTableModel(bugList));
        jScrollPane1.setViewportView(bugTable);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 326, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1)
                    .add(layout.createSequentialGroup()
                        .add(addButton)
                        .add(48, 48, 48)
                        .add(quitButton)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(26, 26, 26)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(addButton)
                    .add(quitButton))
                .add(18, 18, 18)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 262, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        this.setVisible(false);
        new AddView(this).setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTable bugTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quitButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int confirm = JOptionPane.showConfirmDialog (null, 
                                        "Are You Sure to Close this Application?",
                                        "Exit Confirmation",JOptionPane.YES_NO_OPTION);           
        if (confirm == JOptionPane.YES_OPTION) {                   
            System.exit(0);
            //TODO: check if we need to close our database connections
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {   
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
    /**
     * Class ExitListener check to see if the main program is being closed and 
     * brings up a prompt for closing.
     * @author hansen
     *
     */
    private class ExitListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int confirm = JOptionPane.showConfirmDialog (null, 
                                    "Are you sure you want to exit?",
                                    "Exit Confirmation",JOptionPane.YES_NO_OPTION);           
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
                //TODO: check if we need to close our database connections
            }
        }
        
    }

}
