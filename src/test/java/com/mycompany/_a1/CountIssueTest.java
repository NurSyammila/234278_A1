/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany._a1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
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
public class CountIssueTest {
    
    public CountIssueTest() {
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
    public void testSet() {
        System.out.println("set");
        File file = new File("C:\\Users\\Win8\\Documents\\NetBeansProjects\\234278_A2\\Assignment1Test");
        Collection<File> all = new ArrayList<>();
        CountIssue.set(file, all);
    }

    @Test
    public void testFilterjava() {
        System.out.println("filterjava");
        Collection<File> a = new ArrayList<>();
        String[] expResult = {};
        String[] result = CountIssue.filterjava(a);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void testCount() {
        System.out.println("Count");
        String[] list = new String[0];
//        CountIssue instance = new CountIssue;
//        instance.Count(list);
    }
    
}
