package edu.lehigh.cse216.fall13.bugs.gui;

import edu.lehigh.cse216.fall13.bugs.business.Bug;

/**
 *
 * @author Group A
 */
public class ReportView extends AbstractView {

    /**
     * Default constructor for testing.  Dont use otherwise.
     */
   public ReportView() {   
       type = ViewType.REPORT;
   }
    
   /**
    * This is the main constructor used.  This method helps to modify
    * the abstract elements of AbstractView
    * @param parent
    * @param b 
    */
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
