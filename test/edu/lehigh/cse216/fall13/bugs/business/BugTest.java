/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lehigh.cse216.fall13.bugs.business;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Group A
 */
public class BugTest {
    Bug instance;
    
    /**
     * 
     */
    public BugTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Bug(1);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of updateVersion method, of class Bug.
     */
    @Test
    public void testUpdateVersion() {
        System.out.println("updateVersion");
        
        instance.updateVersion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editDescription method, of class Bug.
     */
    @Test
    public void testEditDescription() {
        System.out.println("editDescription");
        String newDescription = "";
        instance.editDescription(newDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fixed method, of class Bug.
     */
    @Test
    public void testFixed() {
        System.out.println("fixed");
        instance.fixed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class Bug.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Bug.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVersion method, of class Bug.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        String expResult = "";
        String result = instance.getVersion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFixed method, of class Bug.
     */
    @Test
    public void testIsFixed() {
        System.out.println("isFixed");
        boolean expResult = false;
        boolean result = instance.isFixed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Bug.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }   
}
