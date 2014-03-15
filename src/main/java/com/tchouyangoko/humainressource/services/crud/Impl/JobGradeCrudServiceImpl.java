/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services.crud.Impl;

import com.tchouyangoko.humainressource.model.JobGrade;
import com.tchouyangoko.humainressource.model.JobHistory;
import com.tchouyangoko.humainressource.services.crud.JobGradeCrudService;
import java.util.List;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author mikiahidjo
 */
public class JobGradeCrudServiceImpl implements JobGradeCrudService{
    @Override 
    @Transactional(propagation=Propagation.SUPPORTS)
    public JobGrade find (String s){
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.MANDATORY)
    public JobGrade persist(JobGrade entity){
        return null;
    }
    
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public JobGrade merge(JobGrade entity) {
        return null;
    }
    @Override 
    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public JobGrade remove(JobGrade entity){
        return null;
    }
    
   
    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<JobGrade> findAll() {
        return null;
    }

    
    
}
