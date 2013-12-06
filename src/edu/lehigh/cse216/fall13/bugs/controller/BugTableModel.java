/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lehigh.cse216.fall13.bugs.controller;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import edu.lehigh.cse216.fall13.persistence.dao.PersistenceFactory;
import edu.lehigh.cse216.fall13.persistence.interfaces.IBugsAndIssues;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hansen
 */
public class BugTableModel extends AbstractTableModel {
    private static final int COLUMNS = 7;
    ArrayList<Bug> bugList;

    /**
     * Default constructor to pull list of bugs from database.
     */
    public BugTableModel() {
        // we can close this afterwards        
        IBugsAndIssues dao = PersistenceFactory.create();
        dao.load();
        this.bugList = dao.listBugs(); 
        //do we need to save here?
    }
    
    /**
     * Testing constructor to pull user generated list of bugs.
     * @param list 
     */
    public BugTableModel(ArrayList<Bug> list) {
        bugList = list;
    }
    

    @Override
    public int getRowCount() {
        return bugList.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        String name = "??";
        switch (columnIndex) {
            case 0 : name = "ID";  
                break;
            case 1 : name = "Description";
                break;
            default :
                break;
        }
        return name;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bug b = bugList.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = b.getID();
                break;
            case 1:
                value = b;
            default:
                break;
        }
        return value;
    }

}
