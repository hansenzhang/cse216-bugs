/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lehigh.cse216.fall13.bugs.gui;

import edu.lehigh.cse216.fall13.bugs.business.Bug;

/**
 *
 * @author hansen
 */
public class ReportView extends AbstractView{

   public ReportView() {      
   }
    
    public ReportView(MainGui parent, Bug b) {
        super(parent);
        setFieldsImmutable(true);
        fillFields(b);
        titleLabel.setText("Bug " + b.getID().toString());
        setTitle("View Bug");
    }
    
}
