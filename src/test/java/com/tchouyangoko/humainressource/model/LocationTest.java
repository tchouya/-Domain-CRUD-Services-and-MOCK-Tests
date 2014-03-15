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
public class LocationTest {
    
    public LocationTest() {
    }

      @Test
    public  void testCreate() throws Exception{
        
        
        Location q = new Location.Builder("william Street","Cape town").id("7460").build();
        Assert.assertEquals(q.getId(),"7460");
        Assert.assertEquals(q.getStreet_address(),"william Street");
        Assert.assertEquals(q.getCity(),"Cape town");
        }
    
     @Test
    public  void testUpdate() throws Exception{
        
        
        Location q = new Location.Builder("Monte amiata,william Street","Cape town").id("7460").build();
        Assert.assertEquals(q.getId(),"7460");
        Assert.assertEquals(q.getStreet_address(),"Monte amiata,william Street");
        Assert.assertEquals(q.getCity(),"Cape town");
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
