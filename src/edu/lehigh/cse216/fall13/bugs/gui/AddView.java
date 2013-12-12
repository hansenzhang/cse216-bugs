/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lehigh.cse216.fall13.bugs.gui;

/**
 *
 * @author Group A
 */
class AddView extends AbstractView{

    /**
     * Default constructor for testing.  Dont use otherwise.
     */
    public AddView() {
        type = ViewType.ADD;
    }
    
   /**
    * This is the main constructor used.  This method helps to modify
    * the abstract elements of AbstractView
    * @param aThis
    */
    public AddView(MainGui aThis) {
        super(aThis);
        type = ViewType.ADD;
        titleLabel.setText("Add New Bug");
        setTitle("Add Bug");
        hideEditButton();
        hideRemoveButton();
    }
    
}
