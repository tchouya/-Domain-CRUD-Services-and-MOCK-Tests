/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.model;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author mikiahidjo
 */
public final class JobGrade {
    private String id;
    private String name;
    
    List<Job>jobs;
    
    private JobGrade()
    {
        
    }
    
    private JobGrade(Builder builder) {
        id=builder.id;
        name= builder.name;
        jobs=builder.jobs;

    }

    public static class Builder{
        private String id;
    private String name;
    
    List<Job>jobs;

        public Builder(String name) {
            
            this.name = name;
        }

        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder jobs(List<Job> value){
            jobs=value;
            return this;
        }
        public Builder name(JobGrade value){
            id = value.getId();
            name = value.getName();
            jobs = value.getJobs();
            
            return this;
        }

        public JobGrade build(){
            return new JobGrade(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
   public List<Job> getJobs() {
        return jobs;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JobGrade other = (JobGrade) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

   
    
}
