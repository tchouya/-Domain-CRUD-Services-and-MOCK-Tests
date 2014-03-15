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
public class JobTest {
    
    public JobTest() {
    }

      @Test
    public  void testCreate() throws Exception{
        
        
        Job q = new Job.Builder("Development software",3000.0,8700.0).id("20").build();
        Assert.assertEquals(q.getId(),"20");
        Assert.assertEquals(q.getTitle(),"Development software");
        Assert.assertEquals(q.getMin_salary(),3000.0);
        Assert.assertEquals(q.getMax_salary(),8700.0);
        }
    
    @Test
    public  void testUpdate() throws Exception{
         
        Job q = new Job.Builder("Design",6000.0,1200.0).id("20").build();
        Assert.assertEquals(q.getId(),"20");
        Assert.assertEquals(q.getTitle(),"Design");
        Assert.assertEquals(q.getMin_salary(),6000.0);
        Assert.assertEquals(q.getMax_salary(),1200.0);  
                
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
