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
public class CountriesTest {
    
   @Test
    public  void testCreate() {
        
        Countries q = new Countries.Builder("South").id("+27").build();
        Assert.assertEquals(q.getName(),"South");
        Assert.assertEquals(q.getId(),"+27");
        
    }
    
    @Test
    public void testUpdate() {
        Countries q = new Countries.Builder("South Africa").id("+27").build();
       Assert.assertEquals(q.getName(),"South Africa");
        Assert.assertEquals(q.getId(),"+27");
        
        
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
