package edu.lehigh.cse216.fall13.bugs.controller;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import edu.lehigh.cse216.fall13.persistence.dao.PersistenceFactory;
import edu.lehigh.cse216.fall13.persistence.interfaces.IBugsAndIssues;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Group A
 */
public class BugTableModel extends AbstractTableModel {
    
    /**
     * This is a constant for our table.
     */
    private static final int COLUMNS = 7;
    public ArrayList<Bug> bugList;

    /**
     * Default constructor to pull list of bugs from database.
     */
    public BugTableModel() {       
        this.bugList = MainController.instance.list();
    }

    /**
     * Testing constructor to pull user generated list of bugs.
     * @param list
     */
    public BugTableModel(ArrayList<Bug> list) {
        bugList = list;
    }

    /**
     * Implementing interface methods.
     * @return 
     */
    @Override
    public int getRowCount() {
        return bugList.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    /**
     * Assign column titles to our columns.
     * @param columnIndex
     * @return column title
     */
    @Override
    public String getColumnName(int columnIndex) {
        String name = "??";
        switch (columnIndex) {
            case 0:
                name = "ID";
                break;
            case 1:
                name = "Description";
                break;
            case 2:
                name = "User";
                break;
            case 3:
                name = "Date";
                break;
            case 4:
                name = "Product";
                break;
            case 5:
                name = "Severity";
                break;
            case 6:
                name = "Priority";
                break;
            default:
                break;
        }
        return name;
    }

    /**
     * Retrieving values from our table in this implemented method.
     * @param rowIndex
     * @param columnIndex
     * @return 
     */
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Bug b = bugList.get(rowIndex);
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = b.getID();
                break;
            case 1:
                value = b.getDescription();
                break;
            case 2:
                value = b.getUser();
                break;
            case 3:
                value = b.getDate();
                break;
            case 4:
                value = b.getProduct();
                break;
            case 5:
                value = b.getSeverity();
                break;
            case 6:
                value = b.getPriority();
                break;
            default:
                break;
        }
        return value;
    }
    
    /**
     * Method to refresh our list after adding a bug to our database.
     * @param b 
     */
    public void add(Bug b) {        
        MainController.instance.add(b);        
        bugList = MainController.instance.list();
        fireTableDataChanged();
    }

    /**
     * Method to refresh our list after removing a bug from the database.
     * @param bugID 
     */
    public void remove(UUID bugID) {
        MainController.instance.remove(bugID);
        bugList = MainController.instance.list();
        fireTableDataChanged();
    }
}
