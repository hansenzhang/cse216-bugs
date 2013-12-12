/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lehigh.cse216.fall13.bugs.controller;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import java.util.UUID;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hansen
 */
public class BugTableModelTest {
    Bug b;
    public BugTableModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {    
        b = new Bug(
                "Description test", "JDK test", "OS test", "Priority test",
                "Product test", "Severity test", "Summary test", "User test",
                "Version test"
        );
    }
    
    @After
    public void tearDown() {
        MainController.instance.remove(b.getBugID());
    }

    /**
     * Test of getRowCount method, of class BugTableModel.
     */
    @Test
    public void testGetRowCount() {
        System.out.println("getRowCount");
        BugTableModel instance = new BugTableModel();        
        int result = instance.getRowCount();
        int actual = MainController.instance.list().size();
        assertEquals(actual, result);
    }

    /**
     * Test of getColumnCount method, of class BugTableModel.
     */
    @Test
    public void testGetColumnCount() {
        System.out.println("getColumnCount");
        BugTableModel instance = new BugTableModel();
        int expResult = BugTableModel.COLUMNS;
        int result = instance.getColumnCount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColumnName method, of class BugTableModel.
     */
    @Test
    public void testGetColumnName() {
        System.out.println("getColumnName");
        int columnIndex = 0;
        BugTableModel instance = new BugTableModel();
        String expResult = "ID";
        String result = instance.getColumnName(columnIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of getValueAt method, of class BugTableModel.
     */
    @Test
    public void testGetValueAt() {
        System.out.println("getValueAt");
        int rowIndex = 0;
        int columnIndex = 0;
        BugTableModel instance = new BugTableModel();
        Object result = instance.getValueAt(rowIndex, columnIndex);
        assertTrue(result instanceof UUID);
    }

    /**
     * Test of add method, of class BugTableModel.
     */
    @Test
    public void testAdd() {
        System.out.println("add");        
        BugTableModel instance = new BugTableModel();
        instance.add(b);        
    }

    /**
     * Test of remove method, of class BugTableModel.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        BugTableModel instance = new BugTableModel();
        UUID tempID = b.getBugID();
        instance.remove(tempID);
        Bug result = MainController.instance.view(tempID);
        assertEquals(result, null);
    }
    
}
