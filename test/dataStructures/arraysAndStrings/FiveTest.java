/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructures.arraysAndStrings;

import dataStructures.arraysAndStrings.Five;
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
public class FiveTest {
    
    public FiveTest() {
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
     * Test of main method, of class Five.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = {"aabcccccaaa"};
        Five.main(args);
        
    }

    /**
     * Test of compress method, of class Five.
     */
    @Test
    public void testCompress1() {
        System.out.println("compress 1");
        String a = "aabcccccaaa";
        String expResult = "a2b1c5a3";
        String result = Five.compress(a);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of compress method, of class Five.
     */
    @Test
    public void testCompress2() {
        System.out.println("compress 2");
        String a = "aaaaaaaa";
        String expResult = "a8";
        String result = Five.compress(a);
        assertEquals(expResult, result);
        
    }
    /**
     * Test of compress method, of class Five.
     */
    @Test
    public void testCompress3() {
        System.out.println("compress 3");
        String a = "abcd";
        String expResult = "abcd";
        String result = Five.compress(a);
        assertEquals(expResult, result);
        
    }
    
}
