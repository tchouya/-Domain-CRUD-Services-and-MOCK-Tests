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
public class EmailTest {
    
    public EmailTest() {
    }

     @Test
    public  void testCreate() {
        
        Email q = new Email.Builder("christian").name("mikiahidjo").build();
        Assert.assertEquals(q.getName(),"mikiahidjo");
        Assert.assertEquals(q.getPassword(),"christian");
        
    }
    
      @Test
    public  void testUpdate() {
        
        Email q = new Email.Builder("israel").name("mikiahidjo").build();
        Assert.assertEquals(q.getName(),"mikiahidjo");
        Assert.assertEquals(q.getPassword(),"israel");
        
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
