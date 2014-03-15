/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services.crud.Impl;

import com.tchouyangoko.humainressource.model.Departement;
import com.tchouyangoko.humainressource.services.crud.DepartementCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mikiahidjo
 */
public class DepartementCrudServiceImpl implements DepartementCrudService{
    
    @Override 
    @Transactional(propagation=Propagation.SUPPORTS)
    public Departement find (String s){
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.MANDATORY)
    public Departement persist(Departement entity){
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Departement merge(Departement entity) {
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public Departement remove(Departement entity){
        return null;
    }
    
   
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Departement> findAll() {
        return null;
    }

    
    
}
