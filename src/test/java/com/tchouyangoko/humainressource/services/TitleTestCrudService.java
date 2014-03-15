/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Title;
import com.tchouyangoko.humainressource.services.crud.TitleCrudService;
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
public class TitleTestCrudService {
  
      @Mock
    TitleCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(TitleCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Title q = new Title.Builder("history of the company").id("01").build();
        Title returnTitle = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnTitle);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
       Title q = new Title.Builder("history of the company").id("01").build();
        Title returnTitle = crudService.find(q.getId());
        when(crudService.find(q.getName())).thenReturn(returnTitle);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
        Title q = new Title.Builder("history of the company until our day").id("01").build();
        Title returnTitle = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnTitle);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Title q = new Title.Builder("history of the company until our day").id("01").build();
        Title returnTitle = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnTitle);
        Mockito.verify(crudService).remove(q);
              
    }
}
