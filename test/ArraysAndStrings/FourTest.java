/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysAndStrings;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mm
 */
public class FourTest {
    
    public FourTest() {
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
     * Test of main method, of class Four.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = new String[]{"hello good day!"};
        Four.main(args);

        
    }

    /**
     * Test of replaceSpaces method, of class Four.
     */
    @Test
    public void testReplaceSpaces() {
        System.out.println("replaceSpaces");
        String s = "hello good world!";
        char[] expResult = new String("hello%20good%20world!").toCharArray();
        char[] result = Four.replaceSpaces(s);
        assertArrayEquals(expResult, result);

    }
    
}
