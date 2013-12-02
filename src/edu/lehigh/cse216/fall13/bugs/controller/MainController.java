/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lehigh.cse216.fall13.bugs.controller;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import edu.lehigh.cse216.fall13.bugs.database.DatabaseManager;
import java.util.ArrayList;

/**
 *
 * @author hansen
 */
public class MainController {
    public static MainController instance = new MainController();
    
    /**
     * 
     */
    private MainController() {
        //default constructor
    }
    
    /**
     * Create an exception here if needed;
     * 
     * @param b
     * @param isEdit
     * @return 
     */
    public Bug add(Bug b, boolean isEdit) {
        // TODO: we should check to see if the bug exists in the database already
        // and append to it if needed.
        if (isEdit) {
            DatabaseManager.instance.updateBug(b);           
        }
        int bugId = DatabaseManager.instance.addBug(b);
        
        return view(bugId);
    }
    
    /**
     * 
     * @return 
     */
    public ArrayList<Bug> list() {
        return DatabaseManager.instance.listBugs();        
    }
    
    /**
     * 
     * @param bugId
     * @return 
     */
    public Bug view(int bugId) {
        return DatabaseManager.instance.getBug(bugId);
    }
    
    /**
     * Because default behavior of JTable allows us to sort, hopefully we'll
     * be able to search there with more ease.
     * @deprecated 
     * 
     * @param strings
     * @return 
     */
    @Deprecated
    public ArrayList<Bug> search(String... strings) {
        return null;
    }
    
    /**
     * 
     * @param b 
     */
    public void edit(Bug b) {
        DatabaseManager.instance.editBug(b);
        //TODO: return the correct bug to the gui.
    }
}
