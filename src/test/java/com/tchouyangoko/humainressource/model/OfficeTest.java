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
public class OfficeTest {
    
    public OfficeTest() {
    }

      @Test
    public  void testCreate() throws Exception{
        
        
        Office q = new Office.Builder("Direction").id("102").build();
        Assert.assertEquals(q.getId(),"102");
        Assert.assertEquals(q.getName(),"Direction");
        
        }
    
     @Test
    public  void testUpdate() throws Exception{
         Office q = new Office.Builder("Accounting").id("102").build();
        Assert.assertEquals(q.getId(),"102");
        Assert.assertEquals(q.getName(),"Accounting");
        
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
