/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services.crud.Impl;

import com.tchouyangoko.humainressource.model.DepartementHistory;
import com.tchouyangoko.humainressource.services.crud.DepartementHistoryCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mikiahidjo
 */
public class DepartementHistoryCrudServiceImpl implements DepartementHistoryCrudService{
    
    @Override 
    @Transactional(propagation=Propagation.SUPPORTS)
    public DepartementHistory find (String s){
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.MANDATORY)
    public DepartementHistory persist(DepartementHistory entity){
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public DepartementHistory merge(DepartementHistory entity) {
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public DepartementHistory remove(DepartementHistory entity){
        return null;
    }
    
   
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<DepartementHistory> findAll() {
        return null;
    }

    
    
}
