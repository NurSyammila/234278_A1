/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._a1;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class CountFileTest {
    
    public CountFileTest() {
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

    @Test
    public void testCountFile() {
        System.out.println("countFile");
        File dir = new File("C:\\Users\\Win8\\Documents\\NetBeansProjects\\234278_A1\\Assignment1Test");
        int expResult = 4;
        int result = CountFile.countFile(dir);
        assertEquals(expResult, result);
    }
    
}
