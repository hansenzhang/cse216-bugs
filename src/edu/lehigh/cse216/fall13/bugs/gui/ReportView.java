/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lehigh.cse216.fall13.bugs.gui;

import edu.lehigh.cse216.fall13.bugs.business.Bug;

/**
 *
 * @author Group A
 */
public class ReportView extends AbstractView{

   public ReportView() {   
       type = ViewType.REPORT;
   }
    
    public ReportView(MainGui parent, Bug b) {        
        super(parent);
        type = ViewType.REPORT;
        setFieldsImmutable(false);
        fillFields(b);
        currentBug = b;
        titleLabel.setText("Bug " + b.getID().toString());
        setTitle("View Bug");
        
    }
    
}
