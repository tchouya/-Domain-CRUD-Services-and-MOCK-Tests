/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services.crud.Impl;

import com.tchouyangoko.humainressource.model.JobHistory;
import com.tchouyangoko.humainressource.services.crud.JobHistoryCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mikiahidjo
 */
public class JobHistoryCrudServiceImpl  implements JobHistoryCrudService{
    @Override 
    @Transactional(propagation=Propagation.SUPPORTS)
    public JobHistory find (String s){
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.MANDATORY)
    public JobHistory persist(JobHistory entity){
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public JobHistory merge(JobHistory entity) {
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public JobHistory remove(JobHistory entity){
        return null;
    }
    
   
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<JobHistory> findAll() {
        return null;
    }
    
}
