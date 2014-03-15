/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Projet;
import com.tchouyangoko.humainressource.services.crud.ProjetCrudService;
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
public class ProjetTestCrudService {
    
     @Mock
    ProjetCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(ProjetCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Projet q = new Projet.Builder("Airline Reservation","Create a website of an Airline").id("7").build();
        Projet returnProjet = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnProjet);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        Projet q = new Projet.Builder("Airline Reservation","Create a website of an Airline").id("7").build();
        Projet returnProjet = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnProjet);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
      Projet q = new Projet.Builder("Airline Reservation","Create a website of an Airline in java").id("7").build();
       Projet returnProjet = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnProjet);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Projet q = new Projet.Builder("Airline Reservation","Create a website of an Airline in java").id("7").build();
       Projet returnProjet = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnProjet);
        Mockito.verify(crudService).remove(q);
              
    }
}
