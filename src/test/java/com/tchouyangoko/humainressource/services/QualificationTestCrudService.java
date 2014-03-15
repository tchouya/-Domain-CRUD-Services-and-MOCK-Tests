/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Qualification;
import com.tchouyangoko.humainressource.services.crud.QualificationCrudService;
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
public class QualificationTestCrudService {
  /*
     @Test
    public  void testCreate() throws Exception{
               
        Qualification q = new Qualification.Builder("Degre").id("NQL6").build();
        Assert.assertEquals(q.getId(),"NQL6");
        Assert.assertEquals(q.getName(),"Degre");
        
        }
    
     @Test
    public  void testUpdate() throws Exception{
               
        Qualification q = new Qualification.Builder("national Diploma").id("NQL6").build();
        
    */ 
     @Mock
    QualificationCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(QualificationCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Qualification q = new Qualification.Builder("Degre").id("NQL6").build();
        Qualification returnQualification = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnQualification);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
         Qualification q = new Qualification.Builder("Degre").id("NQL6").build();
         Qualification returnQualification = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnQualification);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
       Qualification q = new Qualification.Builder("national Diploma").id("NQL6").build();
        Qualification returnQualification = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnQualification);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Qualification q = new Qualification.Builder("national Diploma").id("NQL6").build();
        Qualification returnQualification = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnQualification);
        Mockito.verify(crudService).remove(q);
              
    }
   
}
