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
public class EditView extends AbstractView{

    public EditView() {
    
    }
    
    /**
     *
     * @param p
     * @param b
     */
    public EditView(MainGui p, Bug b) {
        super(p);
        titleLabel.setText("Editing Bug " + b.getID().toString());
        setTitle("Edit Bug");
        
        hideEditButton();
    }
}
