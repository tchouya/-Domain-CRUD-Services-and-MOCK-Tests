/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.model;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mikiahidjo
 */
public class EmployeTest {
    
    public EmployeTest() {
    }

    
    @Test
    public  void testCreate()throws Exception {
        
        Employee q = new Employee.Builder("Tchouya","Ngoko").id("2021").build();
        Assert.assertEquals(q.getId(),"2021");
        Assert.assertEquals(q.getFirstname(),"Tchouya");
        Assert.assertEquals(q.getLastname(),"Ngoko");
       
       }
    
     @Test
    public  void testUpdate()throws Exception {
        
       Employee q = new Employee.Builder("Tchouya","Israel").id("2021").build();
        Assert.assertEquals(q.getId(),"2021");
        Assert.assertEquals(q.getFirstname(),"Tchouya");
        Assert.assertEquals(q.getLastname(),"Israel");
        
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
