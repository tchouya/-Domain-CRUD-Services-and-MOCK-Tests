/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Payment;
import com.tchouyangoko.humainressource.services.crud.PaymentCrudService;
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
public class PaymentTestCrudService {
    
   
/*
     @Test
    public  void testCreate() throws Exception{
               
        Payment q = new Payment.Builder("1 may 2010",5000.0).id("0012").build();
        Assert.assertEquals(q.getId(),"0012");
        Assert.assertEquals(q.getDate(),"1 may 2010");
        Assert.assertEquals(q.getSalary(),5000.0);
        
        }
    
    @Test
    public  void testUpdate() throws Exception{
               
        Payment q = new Payment.Builder("31 april 2010",6000.0).id("0012").build();
        Assert.assertEquals(q.getId(),"0012");
    */
    
     @Mock
    PaymentCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(PaymentCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
         Payment q = new Payment.Builder("1 may 2010",5000.0).id("0012").build();
         Payment returnPayment = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnPayment);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
        Payment q = new Payment.Builder("1 may 2010",5000.0).id("0012").build();
        Payment returnPayment = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnPayment);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
       Payment q = new Payment.Builder("31 april 2010",6000.0).id("0012").build();
        Payment returnPayment = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnPayment);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
        Payment q = new Payment.Builder("31 april 2010",6000.0).id("0012").build();
        Payment returnPayment = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnPayment);
        Mockito.verify(crudService).remove(q);
              
    }
}
