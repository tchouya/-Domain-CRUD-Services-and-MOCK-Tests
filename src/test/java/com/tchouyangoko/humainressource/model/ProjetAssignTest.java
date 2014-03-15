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
public class ProjetAssignTest {
    
    public ProjetAssignTest() {
    }
@Test
    public  void testCreate()throws Exception {
        
        ProjetAssign q = new ProjetAssign.Builder("20 mai 2013",100000.0).id("201").build();
        Assert.assertEquals(q.getId(),"201");
        Assert.assertEquals(q.getDate(),"20 mai 2013");
        Assert.assertEquals(q.getBudget(),100000.0);
       
       }
    @Test
    public  void testUpdate()throws Exception {
        
        ProjetAssign q = new ProjetAssign.Builder("30 june 2013",100000.0).id("201").build();
        Assert.assertEquals(q.getId(),"201");
        Assert.assertEquals(q.getDate(),"30 june 2013");
        Assert.assertEquals(q.getBudget(),100000.0);
       
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
