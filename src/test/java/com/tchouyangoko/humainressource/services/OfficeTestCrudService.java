/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Office;
import com.tchouyangoko.humainressource.services.crud.OfficeCrudService;
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
public class OfficeTestCrudService {
    
    
     @Mock
    OfficeCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(OfficeCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
       Office q = new Office.Builder("Direction").id("102").build();
       Office returnOffice = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnOffice);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
       Office q = new Office.Builder("Direction").id("102").build();
       Office returnOffice = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnOffice);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
         Office q = new Office.Builder("Accounting").id("102").build();
         Office returnOffice = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnOffice);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
      Office q = new Office.Builder("Accounting").id("102").build();
       Office returnOffice = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnOffice);
        Mockito.verify(crudService).remove(q);
              
    }
}
