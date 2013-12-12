package edu.lehigh.cse216.fall13.bugs.controller;

import edu.lehigh.cse216.fall13.bugs.business.Bug;
import java.util.ArrayList;
import java.util.UUID;
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
public class MainControllerTest {
    Bug b;
    ArrayList<UUID> removeIds = new ArrayList();
    public MainControllerTest() {
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
        for (UUID id : removeIds) {
            MainController.instance.remove(id);
        }
    }

    /**
     * Test of add method, of class MainController.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Bug result = MainController.instance.add(b);
        assertEquals(b.getBugID(), result.getBugID());
        removeIds.add(result.getBugID());
    }

    /**
     * Test of list method, of class MainController.
     */
    @Test
    public void testList() {
        System.out.println("list");        
        ArrayList<Bug> expResult = MainController.instance.list();
        assertTrue(expResult instanceof ArrayList);
    }

    /**
     * Test of view method, of class MainController.
     */
    @Test
    public void testView() {
        System.out.println("view");
        Bug addResult = MainController.instance.add(b);
        Bug viewResult = MainController.instance.view(addResult.getBugID());
        assertEquals(addResult.getBugID(), viewResult.getBugID());
        removeIds.add(addResult.getBugID());
    }

    /**
     * Test of remove method, of class MainController.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Bug addResult = MainController.instance.add(b);
        MainController.instance.remove(addResult.getBugID());
        Bug result = MainController.instance.view(addResult.getBugID());
        assertEquals(result, null);
    }
    
}
