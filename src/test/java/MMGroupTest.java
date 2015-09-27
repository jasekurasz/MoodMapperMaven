/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author faithfulokoye & geoffbrown
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
     * Test of getOwnerId method, of class MMGroup.
     */
    @Test
    public void testGetOwnerId() {
        System.out.println("getOwnerId");
        MMGroup instance = new MMGroup();
        User expResult = null;
        User result = instance.getOwnerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOwnerId method, of class MMGroup.
     */
    @Test
    public void testSetOwnerId() {
        System.out.println("setOwnerId");
        User ownerId = null;
        MMGroup instance = new MMGroup();
        instance.setOwnerId(ownerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsers method, of class MMGroup.
     */
    @Test
    public void testGetUsers() {
        System.out.println("getUsers");
        MMGroup instance = new MMGroup();
        Collection<User> expResult = null;
        Collection<User> result = instance.getUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsers method, of class MMGroup.
     */
    @Test
    public void testSetUsers() {
        System.out.println("setUsers");
        Collection<User> users = null;
        MMGroup instance = new MMGroup();
        instance.setUsers(users);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
