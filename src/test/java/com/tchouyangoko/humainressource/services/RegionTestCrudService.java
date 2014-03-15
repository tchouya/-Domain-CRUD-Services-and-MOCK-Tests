/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Region;
import com.tchouyangoko.humainressource.services.crud.RegionCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import static org.testng.Assert.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mikiahidjo
 */
public class RegionTestCrudService {
    
   @Mock
    RegionCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(RegionCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
               
        Region q = new Region.Builder("North").id("12.5").build();
        Region returnRegion = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnRegion);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        Region q = new Region.Builder("North").id("12.5").build();
        Region returnRegion = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnRegion);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
       Region q = new Region.Builder("North East").id("12.5").build();
        Region returnRegion = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnRegion);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
       Region q = new Region.Builder("North").id("12.5").build();
        Region returnRegion = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnRegion);
        Mockito.verify(crudService).remove(q);
              
    }
    
}
