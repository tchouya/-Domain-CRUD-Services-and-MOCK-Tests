/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Email;
import com.tchouyangoko.humainressource.services.crud.EmailCrudService;
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
public class EmailTestCrudService {
    
   
     @Mock
    EmailCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(EmailCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Email q = new Email.Builder("christian").name("mikiahidjo").build();
        Email returnEmail = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnEmail);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        Email q =new Email.Builder("christian").name("mikiahidjo").build();
        Email returnEmail = crudService.find(q.getName());
        when(crudService.find(q.getName())).thenReturn(returnEmail);
        Mockito.verify(crudService).find(q.getName());       
    }
     @Test
    public void testUpdate() throws Exception {
        
        Email q = new Email.Builder("israel").name("mikiahidjo").build();
        Email returnEmail = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnEmail);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Email q = new Email.Builder("israel").name("mikiahidjo").build();
        Email returnEmail = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnEmail);
        Mockito.verify(crudService).remove(q);
              
    }
    
    

    
}
