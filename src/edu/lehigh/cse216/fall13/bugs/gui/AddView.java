/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lehigh.cse216.fall13.bugs.gui;

import javax.swing.JFrame;

/**
 *
 * @author hansen
 */
class AddView extends AbstractView{

    
    public AddView() {
    
    }
    
    /**
     * 
     * @param aThis 
     */
    public AddView(MainGui aThis) {
        super(aThis);
        titleLabel.setText("Add New Bug");
        setTitle("Add Bug");
    }
    
}
