/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Job;
import com.tchouyangoko.humainressource.services.crud.JobCrudService;
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
public class JobTestCrudService {
      
     @Mock
    JobCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(JobCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Job q = new Job.Builder("Development software",3000.0,8700.0).id("20").build();
        Job returnJob = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnJob);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        Job q = new Job.Builder("Development software",3000.0,8700.0).id("20").build();
        Job returnJob = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnJob);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
       Job q = new Job.Builder("Design",6000.0,1200.0).id("20").build();
        Job returnJob = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnJob);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Job q = new Job.Builder("Design",6000.0,1200.0).id("20").build();
        Job returnJob = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnJob);
        Mockito.verify(crudService).remove(q);
              
    }
    
}
