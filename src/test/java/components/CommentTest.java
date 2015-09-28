/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.util.Date;
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
public class CommentTest {
    
    public CommentTest() {
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
     * Test of getId method, of class Comment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Comment instance = new Comment();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Comment.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Comment instance = new Comment();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getContent method, of class Comment.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        Comment instance = new Comment();
        String expResult = "";
        String result = instance.getContent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContent method, of class Comment.
     */
    @Test
    public void testSetContent() {
        System.out.println("setContent");
        String content = "";
        Comment instance = new Comment();
        instance.setContent(content);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimestamp method, of class Comment.
     */
    @Test
    public void testGetTimestamp() {
        System.out.println("getTimestamp");
        Comment instance = new Comment();
        Date expResult = null;
        Date result = instance.getTimestamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeStamp method, of class Comment.
     */
    @Test
    public void testSetTimeStamp() {
        System.out.println("setTimeStamp");
        Date timestamp = null;
        Comment instance = new Comment();
        instance.setTimeStamp(timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMoodStatus method, of class Comment.
     */
    @Test
    public void testGetMoodStatus() {
        System.out.println("getMoodStatus");
        Comment instance = new Comment();
        MoodStatus expResult = null;
        MoodStatus result = instance.getMoodStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoodStatus method, of class Comment.
     */
    @Test
    public void testSetMoodStatus() {
        System.out.println("setMoodStatus");
        MoodStatus moodStatus = null;
        Comment instance = new Comment();
        instance.setMoodStatus(moodStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class Comment.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        Comment instance = new Comment();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class Comment.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        Comment instance = new Comment();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Comment.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Comment instance = new Comment();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Comment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Comment instance = new Comment();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Comment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Comment instance = new Comment();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
