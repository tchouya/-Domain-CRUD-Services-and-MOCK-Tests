/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.JobGrade;
import com.tchouyangoko.humainressource.services.crud.JobGradeCrudService;
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
public class JobGradeTestCrudService {
 
    
     @Mock
    JobGradeCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(JobGradeCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        JobGrade q = new JobGrade.Builder("Project manager").id("A").build();
        JobGrade returnJobGrade = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnJobGrade);
        Mockito.verify(crudService).persist(q);
        
     }
     @Test
    public void testRead() throws Exception {
        JobGrade q =new JobGrade.Builder("South").id("+27").build();
        JobGrade returnJobGrade = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnJobGrade);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
       JobGrade q = new JobGrade.Builder("chief of Departement").id("A").build();
        JobGrade returnJobGrade = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnJobGrade);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
       JobGrade q = new JobGrade.Builder("chief of Departement").id("A").build();
        JobGrade returnJobGrade = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnJobGrade);
        Mockito.verify(crudService).remove(q);
              
    }
    
    
}
