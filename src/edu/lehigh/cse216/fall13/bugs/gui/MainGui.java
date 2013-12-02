/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lehigh.cse216.fall13.bugs.gui;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import edu.lehigh.cse216.fall13.bugs.controller.BugTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author hansen
 */
public class MainGui extends javax.swing.JFrame implements WindowListener {

    /**
     * List model allows us to add any object type to our JList In our case we
     * will be using bugs. We should double check to see if this loads correctly
     * with auto-generated code.
     */
    private final ArrayList bugList = new ArrayList<>();

    /**
     * Creates new form EditView
     */
    public MainGui() {
        initComponents();

        // We can't actually use this code yet because our database manager 
        // does not fetch correctly.
        for (int i = 1; i < 6; i++) {
            bugList.add(new Bug(i)); //TODO: Refactor to tests
        }

        /*
         for (Bug b : DatabaseManager.instance.listBugs()) {
         listModel.addElement(b);
         }
         */
        quitButton.addActionListener(new ExitListener());
        this.addWindowListener(this);

        //consider having custom TableRowSorter, test deafult first!
        bugTable.setAutoCreateRowSorter(true); 
        bugTable.setAutoCreateColumnsFromModel(true);
        
        bugTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
       
        ListSelectionModel selectionModel = bugTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // Attach our row listener to create a ReportView when clicked on.
        selectionModel.addListSelectionListener(new RowListener(this));

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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        bugTable.setModel(new BugTableModel(bugList));
        bugTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bugTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bugTable);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(22, 22, 22)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(layout.createSequentialGroup()
                        .add(addButton)
                        .add(48, 48, 48)
                        .add(quitButton)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
                .addContainerGap())
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
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        this.setVisible(false);
        new AddView(this).setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void bugTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bugTableMouseClicked
        this.setVisible(false);
        //Bug b = 
        //new ReportView(this, b);
    }//GEN-LAST:event_bugTableMouseClicked

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
            @Override
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

    /**
     * 
     * @param e 
     */
    @Override
    public void windowClosing(WindowEvent e) {
        int confirm = JOptionPane.showConfirmDialog(null,
                "Are You Sure to Close this Application?",
                "Exit Confirmation", JOptionPane.YES_NO_OPTION);
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
     * Could be refactored into anonymous declaration.
     * @author hansen
     *
     */
    private class ExitListener implements ActionListener {

        /**
         * 
         * @param e 
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Are you sure you want to exit?",
                    "Exit Confirmation", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
                //TODO: check if we need to close our database connections
            }
        }

    }

    /**
     * Class RowListener waits for a row to be clicked on and returns the
     * corresponding bug.  This class is declared as inner instead of 
     * anonymous because we need access to the parent frame.
     * 
     * @author hansen
     */
    private class RowListener implements ListSelectionListener {

        /**
         * 
         */
        MainGui parent;

        /**
         * 
         * @param m 
         */
        public RowListener(MainGui m) {
            this.parent = m;
        }

        /**
         * 
         * @param e 
         */
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                parent.setVisible(false);
                
                ListSelectionModel ls = parent.bugTable.getSelectionModel();
                Bug b = (Bug) bugList.get(bugTable.convertRowIndexToModel(ls.getLeadSelectionIndex()));
                
                new ReportView(parent, b).setVisible(true);
                
                //We need to clear here in case we want to reorder.
                ls.clearSelection();
            }
        }
    }

}
