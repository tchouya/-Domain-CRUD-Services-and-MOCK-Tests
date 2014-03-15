/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Location;
import com.tchouyangoko.humainressource.services.crud.LocationCrudService;
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
public class LocationTestCrudService {

     @Mock
    LocationCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(LocationCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Location q = new Location.Builder("william Street","Cape town").id("7460").build();
        Location returnLocation = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnLocation);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        Location q = new Location.Builder("william Street","Cape town").id("7460").build();
        Location returnLocation = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnLocation);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
        Location q = new Location.Builder("Monte amiata,william Street","Cape town").id("7460").build();
        Location returnLocation = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnLocation);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Location q = new Location.Builder("Monte amiata,william Street","Cape town").id("7460").build();
        Location returnLocation = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnLocation);
        Mockito.verify(crudService).remove(q);
              
    }
}
