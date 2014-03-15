/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.services;

import com.tchouyangoko.humainressource.model.Skill;
import com.tchouyangoko.humainressource.services.crud.SkillCrudService;
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
public class SkillTestCrudService {
    
  
      @Mock
    SkillCrudService crudService;
   
    @BeforeMethod
    public void setUpMethod() throws Exception {
         MockitoAnnotations.initMocks(this);
        crudService = Mockito.mock(SkillCrudService.class);
    }
    
    @Test
    public  void testCreate()  throws Exception {
                 
        Skill q = new Skill.Builder("Developer").id("2").build();
        Skill returnSkill = crudService.persist(q);
        when(crudService.persist(q)).thenReturn(returnSkill);
        Mockito.verify(crudService).persist(q);
        
        
    }
     @Test
    public void testRead() throws Exception {
       Skill q = new Skill.Builder("Developer").id("2").build();
       Skill returnSkill = crudService.find(q.getId());
        when(crudService.find(q.getId())).thenReturn(returnSkill);
        Mockito.verify(crudService).find(q.getId());       
    }
     @Test
    public void testUpdate() throws Exception {
        
          Skill q = new Skill.Builder("Playing game").id("2").build();
         Skill returnSkill = crudService.merge(q);
        when(crudService.merge(q)).thenReturn(returnSkill);
        Mockito.verify(crudService).merge(q);
       
    }

    @Test
    public void testDelete() throws Exception {
       Skill q = new Skill.Builder("Playing game").id("2").build();
       Skill returnSkill = crudService.remove(q);
        when(crudService.remove(q)).thenReturn(returnSkill);
        Mockito.verify(crudService).remove(q);
              
    }
}
