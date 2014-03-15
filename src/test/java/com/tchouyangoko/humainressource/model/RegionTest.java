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
public class RegionTest {
    
    public RegionTest() {
    }

     @Test
    public  void testCreate() throws Exception{
               
        Region q = new Region.Builder("North").id("12.5").build();
        Assert.assertEquals(q.getId(),"12.5");
        Assert.assertEquals(q.getName(),"North");
        
        }
    
     @Test
    public  void testUpdate() throws Exception{
         Region q = new Region.Builder("North East").id("12.5").build();
        Assert.assertEquals(q.getId(),"12.5");
        Assert.assertEquals(q.getName(),"North East");
        
        }

    
}
