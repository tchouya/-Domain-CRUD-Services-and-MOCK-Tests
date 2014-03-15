/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services.crud.Impl;

import com.tchouyangoko.humainressource.model.Title;
import com.tchouyangoko.humainressource.services.crud.TitleCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mikiahidjo
 */
public class TitleCrudServiceImpl implements TitleCrudService {
    
       @Override 
    @Transactional(propagation=Propagation.SUPPORTS)
    public Title find (String s){
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.MANDATORY)
    public Title persist(Title entity){
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Title merge(Title entity) {
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public Title remove(Title entity){
        return null;
    }
    
   
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Title> findAll() {
        return null;
    }

    
}
