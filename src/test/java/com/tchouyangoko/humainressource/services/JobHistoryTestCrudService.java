/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.JobHistory;
import com.tchouyangoko.humainressource.services.crud.JobHistoryCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 *
 * @author mikiahidjo
 */
public class JobHistoryTestCrudService {
    
   
     @Mock
    JobHistoryCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(JobHistoryCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
         JobHistory q = new JobHistory.Builder("End in january 2014").id("start in february 2013").build();
        JobHistory returnJobHistory = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnJobHistory);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        JobHistory q = new JobHistory.Builder("End in january 2014").id("start in february 2013").build();
        JobHistory returnJobHistory = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnJobHistory);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
       JobHistory q = new JobHistory.Builder("End in february 2014").id("start in february 2013").build();
        JobHistory returnJobHistory = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnJobHistory);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
         JobHistory q = new JobHistory.Builder("End in february 2014").id("start in february 2013").build();
        JobHistory returnJobHistory = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnJobHistory);
        Mockito.verify(crudService).remove(q);
              
    }
    
}
