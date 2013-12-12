/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lehigh.cse216.fall13.bugs.gui;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Group A
 */
public abstract class AbstractView extends javax.swing.JFrame {
    public enum ViewType {
        ABSTRACT, REPORT, ADD, EDIT
    }
    /**
     * Capture the parent frame when moving between frames
     */
    private MainGui parent;
    protected Bug currentBug;
    protected ViewType type; 
    /**
     * The no arg constructor should be used for ONLY testing. Creates new form AddView
     */
    public AbstractView() {
        type = ViewType.ABSTRACT;
        parent = null; //removing warning...
        initComponents();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                // clean up our current frame
                AbstractView.this.setVisible(false);
                AbstractView.this.dispose();

            }
        });
    }

    /**
     * The parent constructor
     *
     * @param p
     */
    public AbstractView(MainGui p) {
        type = ViewType.ABSTRACT;
        this.parent = p;

        initComponents();
        // We need this to attach any WindowListener events to this JFrame
        //this.addWindowListener(AbstractView.this);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // on close, set parent to active frame
                parent.revalidate();
                parent.repaint();
                parent.setVisible(true);
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // clean up our current frame
                AbstractView.this.setVisible(false);
                AbstractView.this.dispose();

            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        userTextField = new javax.swing.JTextField();
        productTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        userLabel = new javax.swing.JLabel();
        productLabel = new javax.swing.JLabel();
        versionLabel = new javax.swing.JLabel();
        versionTextField = new javax.swing.JTextField();
        osLabel = new javax.swing.JLabel();
        jdkLabel = new javax.swing.JLabel();
        severityLabel = new javax.swing.JLabel();
        priorityLabel = new javax.swing.JLabel();
        summaryLabel = new javax.swing.JLabel();
        summaryTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        descriptionLabel = new javax.swing.JLabel();
        osTextField = new javax.swing.JTextField();
        jdkTextField = new javax.swing.JTextField();
        severityTextField = new javax.swing.JTextField();
        priorityTextField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ABSTRACT");

        titleLabel.setText("ABSTRACT");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        userLabel.setText("User:");

        productLabel.setText("Product:");

        versionLabel.setText("Version:");

        osLabel.setText("OS:");

        jdkLabel.setText("JDK:");

        severityLabel.setText("Severity:");

        priorityLabel.setText("Priority: ");

        summaryLabel.setText("Summary:");

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane2.setViewportView(descriptionTextArea);

        descriptionLabel.setText("Description:");

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(productLabel)
                                            .add(userLabel))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(productTextField)
                                            .add(userTextField)))
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(versionLabel)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(versionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(39, 39, 39)
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(severityLabel)
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(osLabel)
                                        .add(44, 44, 44)
                                        .add(osTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .add(priorityLabel)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(priorityTextField))
                                    .add(jPanel2Layout.createSequentialGroup()
                                        .add(jdkLabel)
                                        .add(39, 39, 39)
                                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                            .add(severityTextField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                            .add(jdkTextField)))))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(descriptionLabel)
                                    .add(summaryLabel))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                    .add(summaryTextField))))
                        .addContainerGap(77, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(19, 19, 19)
                        .add(editButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(removeButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(submitButton)
                        .add(37, 37, 37))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(userLabel)
                    .add(userTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(osLabel)
                    .add(osTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(9, 9, 9)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(productLabel)
                    .add(productTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jdkLabel)
                    .add(jdkTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(versionLabel)
                    .add(versionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(severityLabel)
                    .add(severityTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(priorityLabel)
                    .add(priorityTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(summaryLabel)
                    .add(summaryTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(descriptionLabel)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 41, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(submitButton)
                    .add(editButton)
                    .add(removeButton))
                .add(20, 20, 20))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(titleLabel)
                .add(243, 243, 243))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(titleLabel)
                .add(8, 8, 8)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (type == ViewType.EDIT) {
            Bug b = fetchFields();
            b.setBugId(currentBug.getBugID());
            parent.model.add(b);
            new ReportView(parent, b).setVisible(true);
            this.setVisible(false);
            this.dispose();
        } else {        
        Bug b = fetchFields();
        parent.model.add(b);
        new ReportView(parent, b).setVisible(true);
        this.setVisible(false);
        this.dispose();
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,
                        "Are you sure?",
                        "Remove", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    parent.model.remove(currentBug.getID());
                    parent.setVisible(true);
                    this.setVisible(false);
                    this.dispose();
                }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        new EditView(parent, currentBug).setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_editButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jdkLabel;
    private javax.swing.JTextField jdkTextField;
    private javax.swing.JLabel osLabel;
    private javax.swing.JTextField osTextField;
    private javax.swing.JLabel priorityLabel;
    private javax.swing.JTextField priorityTextField;
    private javax.swing.JLabel productLabel;
    private javax.swing.JTextField productTextField;
    private javax.swing.JButton removeButton;
    private javax.swing.JLabel severityLabel;
    private javax.swing.JTextField severityTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel summaryLabel;
    private javax.swing.JTextField summaryTextField;
    protected javax.swing.JLabel titleLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextField;
    private javax.swing.JLabel versionLabel;
    private javax.swing.JTextField versionTextField;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param b
     */
    protected void fillFields(Bug b) {
        descriptionTextArea.setText(b.getDescription());
        jdkTextField.setText(b.getJdk());
        osTextField.setText(b.getOs());
        priorityTextField.setText(b.getPriority());
        productTextField.setText(b.getProduct());        
        severityTextField.setText(b.getSeverity());
        summaryTextField.setText(b.getSummary());
        userTextField.setText(b.getUser());
        versionTextField.setText(b.getVersion());
    }

    /**
     *
     * @param s
     */
    protected void setTitleText(String s) {
        titleLabel.setText(s);
    }
    
    protected void setFieldsImmutable(boolean isEdit) {
        descriptionTextArea.setEditable(isEdit);
        jdkTextField.setEditable(isEdit);
        osTextField.setEditable(isEdit);
        priorityTextField.setEditable(isEdit);
        productTextField.setEditable(isEdit);        
        severityTextField.setEditable(isEdit);
        summaryTextField.setEditable(isEdit);
        userTextField.setEditable(isEdit);
        versionTextField.setEditable(isEdit);
    }

    private Bug fetchFields() {
        Bug b = new Bug(
                false, descriptionTextArea.getText(), jdkTextField.getText(),
                osTextField.getText(), priorityTextField.getText(), 
                productTextField.getText(), severityTextField.getText(), 
                summaryTextField.getText(), userTextField.getText(), 
                versionTextField.getText()
        );
        
        return b;
    }

    protected void hideEditButton() {
        editButton.setVisible(false);
    }
    
    protected void hideRemoveButton() {
        removeButton.setVisible(false);
    }
}
