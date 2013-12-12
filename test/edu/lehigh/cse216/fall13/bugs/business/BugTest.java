/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.lehigh.cse216.fall13.bugs.business;

import java.util.Date;
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
public class BugTest {
    Bug instance = null;
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
        instance = new Bug(
                "Description test", "JDK test", "OS test", "Priority test",
                "Product test", "Severity test", "Summary test", "User test",
                "Version test"
        );
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getID method, of class Bug.
     */
    @Test
    public void testGetBugID() {
        System.out.println("getBugID");
        UUID temp = instance.getBugID();
        assertTrue(temp instanceof UUID);
    }

    /**
     * Test of getDate method, of class Bug.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Date result = instance.getDate();
        assertTrue(result instanceof Date);

    }

    /**
     * Test of getVersion method, of class Bug.
     */
    @Test
    public void testGetVersion() {
        System.out.println("getVersion");
        String expResult = "Version test";
        String result = instance.getVersion();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Bug.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");        
        String expResult = "Description test";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSummary method, of class Bug.
     */
    @Test
    public void testGetSummary() {
        System.out.println("getSummary");
        String expResult = "Summary test";
        String result = instance.getSummary();
        assertEquals(expResult, result);

    }

    /**
     * Test of getJdk method, of class Bug.
     */
    @Test
    public void testGetJdk() {
        System.out.println("getJdk");
        String expResult = "JDK test";
        String result = instance.getJdk();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProduct method, of class Bug.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        String expResult = "Product test";
        String result = instance.getProduct();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOs method, of class Bug.
     */
    @Test
    public void testGetOs() {
        System.out.println("getOs");
        String expResult = "OS test";
        String result = instance.getOs();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSeverity method, of class Bug.
     */
    @Test
    public void testGetSeverity() {
        System.out.println("getSeverity");
        String expResult = "Severity test";
        String result = instance.getSeverity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPriority method, of class Bug.
     */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        String expResult = "Priority test";
        String result = instance.getPriority();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUser method, of class Bug.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String expResult = "User test";
        String result = instance.getUser();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Bug.
     */
    @Test
    public void testToString() {  
        System.out.println("testToString");
        String result = instance.toString();
        assertTrue(result instanceof String);
    }

    /**
     * Test of setBugId method, of class Bug.
     */
    @Test
    public void testSetBugId() {
        System.out.println("setBugId");
        UUID bugID = UUID.randomUUID();
        instance.setBugId(bugID);
        assertEquals(bugID, instance.getBugID());
    }
    
}
