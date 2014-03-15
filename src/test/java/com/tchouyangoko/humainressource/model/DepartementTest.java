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
public class DepartementTest {
    
      @Test
    public  void testCreate() throws Exception{
        
        
        Departement q = new Departement.Builder("Information technology").id("10").build();
        Assert.assertEquals(q.getId(),"10");
        Assert.assertEquals(q.getName(),"Information technology");
         }
    
    @Test
    public  void testUpdate() throws Exception{
        
        
        Departement q = new Departement.Builder("Administration").id("10").build();
        Assert.assertEquals(q.getId(),"10");
        Assert.assertEquals(q.getName(),"Administration");
        
        
        
       }

   
}
