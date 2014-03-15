/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services.crud.Impl;

import com.tchouyangoko.humainressource.model.ProjetAssign;
import com.tchouyangoko.humainressource.services.crud.ProjetAssignCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mikiahidjo
 */
public class ProjetAssignCrudServiceImpl implements ProjetAssignCrudService{
        @Override 
    @Transactional(propagation=Propagation.SUPPORTS)
    public ProjetAssign find (String s){
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.MANDATORY)
    public ProjetAssign persist(ProjetAssign entity){
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public ProjetAssign merge(ProjetAssign entity) {
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public ProjetAssign remove(ProjetAssign entity){
        return null;
    }
    
   
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<ProjetAssign> findAll() {
        return null;
    }

    
}
