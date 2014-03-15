/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;


import com.tchouyangoko.humainressource.model.Departement;
import com.tchouyangoko.humainressource.services.crud.DepartementCrudService;
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
public class DepartementTestrudService {
    

 @Mock
    DepartementCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(DepartementCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Departement q = new Departement.Builder("Information technology").id("10").build();
        Departement returnDepartement = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnDepartement);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        Departement q =new Departement.Builder("Information technology").id("10").build();
        Departement returnDepartement = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnDepartement);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
        Departement q = new Departement.Builder("Administration").id("10").build();
        Departement returnDepartement = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnDepartement);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Departement q = new Departement.Builder("Administration").id("10").build();
        Departement returnDepartement = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnDepartement);
        Mockito.verify(crudService).remove(q);
              
    }    
}
