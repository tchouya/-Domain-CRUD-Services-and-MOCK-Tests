/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Countries;
import com.tchouyangoko.humainressource.services.crud.CountriesCrudService;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
//import static org.testng.Assert.*;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author mikiahidjo
 */
public class CountriesTestCrudService {
    
     @Mock
    CountriesCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(CountriesCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Countries q = new Countries.Builder("South").id("+27").build();
        Countries returnCountries = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnCountries);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        Countries q =new Countries.Builder("South").id("+27").build();
        Countries returnCountries = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnCountries);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
        Countries q = new Countries.Builder("South Africa").id("+27").build();
        Countries returnCountries = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnCountries);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Countries q = new Countries.Builder("South Africa").id("+27").build();
        Countries returnCountries = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnCountries);
        Mockito.verify(crudService).remove(q);
              
    }
    
    
   
}

    
   
