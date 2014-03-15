/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.model;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mikiahidjo
 */
public class DepartementHistoryTest {
    
    public DepartementHistoryTest() {
    }

    @Test
    public  void testCreate()throws Exception {
        
        DepartementHistory q = new DepartementHistory.Builder("have realise two projets").id("201").build();
        Assert.assertEquals(q.getId(),"201");
        Assert.assertEquals(q.getName(),"have realise two projets");
       
       }
    
     @Test
    public  void testUpdate()throws Exception {
        
        DepartementHistory q = new DepartementHistory.Builder("have realise two projets and have vote in 2001 first company of the region").id("201").build();
        Assert.assertEquals(q.getId(),"201");
        Assert.assertEquals(q.getName(),"have realise two projets and have vote in 2001 first company of the region");
       
        
        
       }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
