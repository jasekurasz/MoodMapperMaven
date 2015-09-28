/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author faithfulokoye
 */
public class MMGroupTest {
    
    public MMGroupTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class MMGroup.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        MMGroup instance = new MMGroup();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class MMGroup.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        MMGroup instance = new MMGroup();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class MMGroup.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        MMGroup instance = new MMGroup();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class MMGroup.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        MMGroup instance = new MMGroup();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJoinCode method, of class MMGroup.
     */
    @Test
    public void testGetJoinCode() {
        System.out.println("getJoinCode");
        MMGroup instance = new MMGroup();
        String expResult = "";
        String result = instance.getJoinCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJoinCode method, of class MMGroup.
     */
    @Test
    public void testSetJoinCode() {
        System.out.println("setJoinCode");
        String joinCode = "";
        MMGroup instance = new MMGroup();
        instance.setJoinCode(joinCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupMembers method, of class MMGroup.
     */
    @Test
    public void testGetGroupMembers() {
        System.out.println("getGroupMembers");
        MMGroup instance = new MMGroup();
        Set<User> expResult = null;
        Set<User> result = instance.getGroupMembers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupMembers method, of class MMGroup.
     */
    @Test
    public void testSetGroupMembers() {
        System.out.println("setGroupMembers");
        Set<User> groupMembers = null;
        MMGroup instance = new MMGroup();
        instance.setGroupMembers(groupMembers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOwner method, of class MMGroup.
     */
    @Test
    public void testGetOwner() {
        System.out.println("getOwner");
        MMGroup instance = new MMGroup();
        User expResult = null;
        User result = instance.getOwner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOwner method, of class MMGroup.
     */
    @Test
    public void testSetOwner() {
        System.out.println("setOwner");
        User owner = null;
        MMGroup instance = new MMGroup();
        instance.setOwner(owner);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class MMGroup.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        MMGroup instance = new MMGroup();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class MMGroup.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        MMGroup instance = new MMGroup();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MMGroup.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MMGroup instance = new MMGroup();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
