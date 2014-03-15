/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services.crud.Impl;

import com.tchouyangoko.humainressource.model.Countries;
import com.tchouyangoko.humainressource.services.crud.CountriesCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author mikiahidAuthorjo
 */
public class CountriesCrudServiceImpl implements CountriesCrudService {
  
   
   
  @Override 
    @Transactional(propagation=Propagation.SUPPORTS)
    public Countries find (String s){
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.MANDATORY)
    public Countries persist(Countries entity){
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Countries merge(Countries entity) {
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public Countries remove(Countries entity){
        return null;
    }
    
   
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Countries> findAll() {
        return null;
    }

   
  
    
}
