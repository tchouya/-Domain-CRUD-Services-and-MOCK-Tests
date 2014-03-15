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
public class QualificationTest {
    
    public QualificationTest() {
    }

    @Test
    public  void testCreate() throws Exception{
               
        Qualification q = new Qualification.Builder("Degre").id("NQL6").build();
        Assert.assertEquals(q.getId(),"NQL6");
        Assert.assertEquals(q.getName(),"Degre");
        
        }
    
     @Test
    public  void testUpdate() throws Exception{
               
        Qualification q = new Qualification.Builder("national Diploma").id("NQL6").build();
        Assert.assertEquals(q.getId(),"NQL6");
        Assert.assertEquals(q.getName(),"national Diploma");
        
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
