/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.util.Date;
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
public class MoodStatusTest {
    
    public MoodStatusTest() {
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
     * Test of getId method, of class MoodStatus.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        MoodStatus instance = new MoodStatus();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class MoodStatus.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        MoodStatus instance = new MoodStatus();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTimeStamp method, of class MoodStatus.
     */
    @Test
    public void testGetTimeStamp() {
        System.out.println("getTimeStamp");
        MoodStatus instance = new MoodStatus();
        Date expResult = null;
        Date result = instance.getTimeStamp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeStamp method, of class MoodStatus.
     */
    @Test
    public void testSetTimeStamp() {
        System.out.println("setTimeStamp");
        Date time_stamp = null;
        MoodStatus instance = new MoodStatus();
        instance.setTimeStamp(time_stamp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPleasantnessRating method, of class MoodStatus.
     */
    @Test
    public void testGetPleasantnessRating() {
        System.out.println("getPleasantnessRating");
        MoodStatus instance = new MoodStatus();
        Integer expResult = null;
        Integer result = instance.getPleasantnessRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPleasantnessRating method, of class MoodStatus.
     */
    @Test
    public void testSetPleasantnessRating() {
        System.out.println("setPleasantnessRating");
        Integer pleasantnessRating = null;
        MoodStatus instance = new MoodStatus();
        instance.setPleasantnessRating(pleasantnessRating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescriptiveWord method, of class MoodStatus.
     */
    @Test
    public void testGetDescriptiveWord() {
        System.out.println("getDescriptiveWord");
        MoodStatus instance = new MoodStatus();
        String expResult = "";
        String result = instance.getDescriptiveWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescriptiveWord method, of class MoodStatus.
     */
    @Test
    public void testSetDescriptiveWord() {
        System.out.println("setDescriptiveWord");
        String descriptiveWord = "";
        MoodStatus instance = new MoodStatus();
        instance.setDescriptiveWord(descriptiveWord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getReflectiveParagraph method, of class MoodStatus.
     */
    @Test
    public void testGetReflectiveParagraph() {
        System.out.println("getReflectiveParagraph");
        MoodStatus instance = new MoodStatus();
        String expResult = "";
        String result = instance.getReflectiveParagraph();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setReflectiveParagraph method, of class MoodStatus.
     */
    @Test
    public void testSetReflectiveParagraph() {
        System.out.println("setReflectiveParagraph");
        String reflectiveParagraph = "";
        MoodStatus instance = new MoodStatus();
        instance.setReflectiveParagraph(reflectiveParagraph);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnergyRating method, of class MoodStatus.
     */
    @Test
    public void testGetEnergyRating() {
        System.out.println("getEnergyRating");
        MoodStatus instance = new MoodStatus();
        Integer expResult = null;
        Integer result = instance.getEnergyRating();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnergyRating method, of class MoodStatus.
     */
    @Test
    public void testSetEnergyRating() {
        System.out.println("setEnergyRating");
        Integer energyRating = null;
        MoodStatus instance = new MoodStatus();
        instance.setEnergyRating(energyRating);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIsPrivate method, of class MoodStatus.
     */
    @Test
    public void testGetIsPrivate() {
        System.out.println("getIsPrivate");
        MoodStatus instance = new MoodStatus();
        Boolean expResult = null;
        Boolean result = instance.getIsPrivate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsPrivate method, of class MoodStatus.
     */
    @Test
    public void testSetIsPrivate() {
        System.out.println("setIsPrivate");
        Boolean isPrivate = null;
        MoodStatus instance = new MoodStatus();
        instance.setIsPrivate(isPrivate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComments method, of class MoodStatus.
     */
    @Test
    public void testGetComments() {
        System.out.println("getComments");
        MoodStatus instance = new MoodStatus();
        Set<Comment> expResult = null;
        Set<Comment> result = instance.getComments();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComments method, of class MoodStatus.
     */
    @Test
    public void testSetComments() {
        System.out.println("setComments");
        Set<Comment> comments = null;
        MoodStatus instance = new MoodStatus();
        instance.setComments(comments);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUser method, of class MoodStatus.
     */
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        MoodStatus instance = new MoodStatus();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUser method, of class MoodStatus.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        User user = null;
        MoodStatus instance = new MoodStatus();
        instance.setUser(user);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class MoodStatus.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        MoodStatus instance = new MoodStatus();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class MoodStatus.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        MoodStatus instance = new MoodStatus();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class MoodStatus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MoodStatus instance = new MoodStatus();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
