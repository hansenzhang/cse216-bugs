package edu.lehigh.cse216.fall13.bugs.gui;

import edu.lehigh.cse216.fall13.bugs.business.Bug;

/**
 *
 * @author Group A
 */
public class EditView extends AbstractView{

    /**
     * Default constructor for testing.  Dont use otherwise.
     */
    public EditView() {
        type = ViewType.EDIT;
    }
    
   /**
    * This is the main constructor used.  This method helps to modify
    * the abstract elements of AbstractView
    * @param p
    * @param b 
    */
    public EditView(MainGui p, Bug b) {
        super(p);        
        type = ViewType.EDIT;
        titleLabel.setText("Editing Bug " + b.getBugID().toString());
        setTitle("Edit Bug");
        fillFields(b);
        currentBug = b;
        hideEditButton();
    }
      
}
