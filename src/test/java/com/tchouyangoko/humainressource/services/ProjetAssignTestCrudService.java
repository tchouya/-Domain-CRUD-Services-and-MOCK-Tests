/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.ProjetAssign;
import com.tchouyangoko.humainressource.services.crud.ProjetAssignCrudService;
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
public class ProjetAssignTestCrudService {
  
     @Mock
    ProjetAssignCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ProjetAssignCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        ProjetAssign q = new ProjetAssign.Builder("20 mai 2013",100000.0).id("201").build();
         ProjetAssign returnProjetAssign = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnProjetAssign);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        ProjetAssign q = new ProjetAssign.Builder("20 mai 2013",100000.0).id("201").build();
        ProjetAssign returnProjetAssign = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnProjetAssign);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
       ProjetAssign q = new ProjetAssign.Builder("30 june 2013",100000.0).id("201").build();
        ProjetAssign returnProjetAssign = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnProjetAssign);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        ProjetAssign q = new ProjetAssign.Builder("30 june 2013",100000.0).id("201").build();
        ProjetAssign returnProjetAssign = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnProjetAssign);
        Mockito.verify(crudService).remove(q);
              
    }
}
