/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services.crud.Impl;

import com.tchouyangoko.humainressource.model.Contrator;
import com.tchouyangoko.humainressource.model.Region;
import com.tchouyangoko.humainressource.services.crud.ContractorCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mikiahidjo
 */
public class ContratorCrudServiceImpl implements ContractorCrudService {
    
    @Override 
    @Transactional(propagation=Propagation.SUPPORTS)
    public Contrator find (String s){
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.MANDATORY)
    public Contrator persist(Contrator entity){
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Contrator merge(Contrator entity) {
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public Contrator remove(Contrator entity){
        return null;
    }
    
   
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Contrator> findAll() {
        return null;
    }

    
}
