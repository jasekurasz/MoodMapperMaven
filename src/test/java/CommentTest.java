/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
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
     * Test of getMoodStatusId method, of class Comment.
     */
    @Test
    public void testGetMoodStatusId() {
        System.out.println("getMoodStatusId");
        Comment instance = new Comment();
        MoodStatus expResult = null;
        MoodStatus result = instance.getMoodStatusId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMoodStatusId method, of class Comment.
     */
    @Test
    public void testSetMoodStatusId() {
        System.out.println("setMoodStatusId");
        MoodStatus moodStatusId = null;
        Comment instance = new Comment();
        instance.setMoodStatusId(moodStatusId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of getUserId method, of class Comment.
     */
    @Test
    public void testGetUserId() {
        System.out.println("getUserId");
        Comment instance = new Comment();
        User expResult = null;
        User result = instance.getUserId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUserId method, of class Comment.
     */
    @Test
    public void testSetUserId() {
        System.out.println("setUserId");
        User userId = null;
        Comment instance = new Comment();
        instance.setUserId(userId);
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
     * Test of setTimestamp method, of class Comment.
     */
    @Test
    public void testSetTimestamp() {
        System.out.println("setTimestamp");
        Date timestamp = null;
        Comment instance = new Comment();
        instance.setTimestamp(timestamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
