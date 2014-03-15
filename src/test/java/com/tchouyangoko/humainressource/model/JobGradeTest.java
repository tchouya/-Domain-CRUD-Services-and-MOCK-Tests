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
public class JobGradeTest {
    
    public JobGradeTest() {
    }
 @Test
    public  void testCreate() throws Exception{
        
        
        JobGrade q = new JobGrade.Builder("Project manager").id("A").build();
        Assert.assertEquals(q.getId(),"A");
        Assert.assertEquals(q.getName(),"Project manager");
        
        }
    
    
   @Test
    public  void testUpdate() throws Exception{
        
        
        JobGrade q = new JobGrade.Builder("chief of Departement").id("A").build();
        Assert.assertEquals(q.getId(),"A");
        Assert.assertEquals(q.getName(),"chief of Departement");
        
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
