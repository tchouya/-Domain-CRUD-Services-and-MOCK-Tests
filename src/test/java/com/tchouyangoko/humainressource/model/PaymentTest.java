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
public class PaymentTest {
    
    public PaymentTest() {
    }

    @Test
    public  void testCreate() throws Exception{
               
        Payment q = new Payment.Builder("1 may 2010",5000.0).id("0012").build();
        Assert.assertEquals(q.getId(),"0012");
        Assert.assertEquals(q.getDate(),"1 may 2010");
        Assert.assertEquals(q.getSalary(),5000.0);
        
        }
    
    @Test
    public  void testUpdate() throws Exception{
               
        Payment q = new Payment.Builder("31 april 2010",6000.0).id("0012").build();
        Assert.assertEquals(q.getId(),"0012");
        Assert.assertEquals(q.getDate(),"31 april 2010");
        Assert.assertEquals(q.getSalary(),6000.0);
        
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
