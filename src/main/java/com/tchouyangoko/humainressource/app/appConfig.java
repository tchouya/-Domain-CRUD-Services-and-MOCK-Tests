/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.app;

import com.tchouyangoko.humainressource.services.crud.ContractorCrudService;
import com.tchouyangoko.humainressource.services.crud.CountriesCrudService;
import com.tchouyangoko.humainressource.services.crud.DepartementCrudService;
import com.tchouyangoko.humainressource.services.crud.DepartementHistoryCrudService;
import com.tchouyangoko.humainressource.services.crud.EmailCrudService;
import com.tchouyangoko.humainressource.services.crud.EmployeeCrudService;
import com.tchouyangoko.humainressource.services.crud.Impl.ContratorCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.CountriesCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.DepartementCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.DepartementHistoryCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.EmailCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.EmployeeCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.JobCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.JobGradeCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.JobHistoryCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.LocationCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.OfficeCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.PaymentCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.ProjetAssignCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.ProjetCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.QualificationCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.RegionCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.SkillCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.Impl.TitleCrudServiceImpl;
import com.tchouyangoko.humainressource.services.crud.JobCrudService;
import com.tchouyangoko.humainressource.services.crud.JobGradeCrudService;
import com.tchouyangoko.humainressource.services.crud.JobHistoryCrudService;
import com.tchouyangoko.humainressource.services.crud.LocationCrudService;
import com.tchouyangoko.humainressource.services.crud.OfficeCrudService;
import com.tchouyangoko.humainressource.services.crud.PaymentCrudService;
import com.tchouyangoko.humainressource.services.crud.ProjetAssignCrudService;
import com.tchouyangoko.humainressource.services.crud.ProjetCrudService;
import com.tchouyangoko.humainressource.services.crud.QualificationCrudService;
import com.tchouyangoko.humainressource.services.crud.RegionCrudService;
import com.tchouyangoko.humainressource.services.crud.SkillCrudService;
import com.tchouyangoko.humainressource.services.crud.TitleCrudService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;


/**
 *
 * @author mikiahidjo
 */
@Configurable
public class appConfig {
   @Bean(name = "ContratorCrudService")
    public  ContractorCrudService getContratorCrudService(){
        return new ContratorCrudServiceImpl() {} ;
    }
     @Bean(name = "CountriesCrudService")
    public  CountriesCrudService getCountriesCrudService(){
        return new CountriesCrudServiceImpl() {} ;
    }
    @Bean(name = "DepartementCrudService")
    public  DepartementCrudService getDepartementCrudService(){
        return new DepartementCrudServiceImpl() {} ;
    }
    @Bean(name = "DepartementHistoryCrudService")
    public  DepartementHistoryCrudService getDepartementHistoryCrudService(){
        return new DepartementHistoryCrudServiceImpl() {} ;
    }
    @Bean(name = "EmailCrudService")
    public  EmailCrudService getEmailCrudService(){
        return new EmailCrudServiceImpl() {} ;
    }
    @Bean(name = "EmployeeCrudService")
    public  EmployeeCrudService getEmployeeCrudService(){
        return new EmployeeCrudServiceImpl() {} ;
    }
    
    @Bean(name = "JobCrudService")
    public  JobCrudService getJobCrudService(){
        return new JobCrudServiceImpl() {} ;
    }
     @Bean(name = "JobGradeCrudService")
    public  JobGradeCrudService getJobGradeCrudService(){
        return new JobGradeCrudServiceImpl() {} ;
    }
     @Bean(name = "JobHistoryService")
    public  JobHistoryCrudService getJobHistoryCrudService(){
        return new JobHistoryCrudServiceImpl() {} ;
    }
    @Bean(name = "LocationCrudService")
    public  LocationCrudService getLocationCrudService(){
        return new LocationCrudServiceImpl() {} ;
    }
     @Bean(name = "OfficeCrudService")
    public  OfficeCrudService getOfficeCrudService(){
        return new OfficeCrudServiceImpl() {} ;
    }
     @Bean(name = "PaymentCrudService")
    public  PaymentCrudService getPaymentCrudService(){
        return new PaymentCrudServiceImpl() {} ;
    }
    @Bean(name = "ProjetCrudService")
    public  ProjetCrudService getProjetCrudService(){
        return new ProjetCrudServiceImpl() {} ;
    }
    @Bean(name = "ProjetAssignCrudService")
    public  ProjetAssignCrudService getProjetAssignCrudService(){
        return new ProjetAssignCrudServiceImpl() {} ;
    }
    @Bean(name = "QualificationCrudService")
    public  QualificationCrudService getQualificationCrudService(){
        return new QualificationCrudServiceImpl() {} ;
    }
    
    @Bean(name="RegionCrudService")
    public RegionCrudService getRegionCrudService(){
        return new RegionCrudServiceImpl();
    }
     @Bean(name="SkillCrudService")
    public SkillCrudService getSkillCrudService(){
        return new SkillCrudServiceImpl();
    }
     @Bean(name="TitleCrudService")
    public TitleCrudService getTitleCrudService(){
        return new TitleCrudServiceImpl();
    }
        
}
