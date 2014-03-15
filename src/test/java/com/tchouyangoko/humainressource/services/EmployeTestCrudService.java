/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;


import com.tchouyangoko.humainressource.model.Employee;
import com.tchouyangoko.humainressource.services.crud.EmployeeCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mikiahidjo
 */
public class EmployeTestCrudService {
  
 @Mock
    EmployeeCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(EmployeeCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Employee q = new Employee.Builder("Tchouya","Israel").id("2021").build();
        Employee returnEmployee = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnEmployee);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
       Employee q = new Employee.Builder("Tchouya","Israel").id("2021").build();
        Employee returnEmployee = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnEmployee);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
        Employee q = new Employee.Builder("Tchouya","Israel").id("2021").build();
        Employee returnEmployee = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnEmployee);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Employee q = new Employee.Builder("Tchouya","Israel").id("2021").build();
        Employee returnEmployee = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnEmployee);
        Mockito.verify(crudService).remove(q);
              
    }
    
    
}
