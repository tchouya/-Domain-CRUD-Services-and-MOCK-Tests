/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.DepartementHistory;
import com.tchouyangoko.humainressource.services.crud.DepartementHistoryCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
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
public class DepartementHistoryTestCrudService {   
    @Mock
    DepartementHistoryCrudService crudService;

   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DepartementHistoryCrudService.class);
    }
     @Test
    public  void testCreate()  throws Exception {
        DepartementHistory q = new DepartementHistory.Builder("have realise two projets").id("201").build();         
        DepartementHistory returnDepartementHistory =  crudService.persist(q);
       when(crudService.persist(q)).thenReturn(returnDepartementHistory);
        Mockito.verify(crudService).persist(q);
         }
     @Test
    public void testRead() throws Exception {
        DepartementHistory q = new DepartementHistory.Builder("have realise two projets").id("201").build(); 
        DepartementHistory returnDepartementHistory =  crudService.find(q.getId());
         when(crudService.find(q.getId())).thenReturn(returnDepartementHistory);
        Mockito.verify(crudService).find(q.getId());
    }
     @Test
    public void testUpdate() throws Exception {
        
         DepartementHistory q = new DepartementHistory.Builder("have realise two projets and have vote in 2001 first company of the region").id("201").build(); 
        DepartementHistory returnDepartementHistory =  crudService.merge(q);
         when(crudService.find(q.getId())).thenReturn(returnDepartementHistory);
        Mockito.verify(crudService).merge(q);
    }

    @Test
    public void testDelete() throws Exception {
       DepartementHistory q = new DepartementHistory.Builder("have realise two projets and have vote in 2001 first company of the region").id("201").build(); 
        DepartementHistory returnDepartementHistory =  crudService.remove(q);
         when(crudService.find(q.getId())).thenReturn(returnDepartementHistory);
        Mockito.verify(crudService).remove(q);
    }
}
