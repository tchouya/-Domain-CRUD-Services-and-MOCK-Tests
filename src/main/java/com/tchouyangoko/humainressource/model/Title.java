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
public final class Title {
    private String id;
    private String name;
    List<JobHistory>jobHistory;
    
     private Title(){

    }

    private Title(Builder builder) {
        id=builder.id;
        name= builder.name;
        jobHistory=builder.jobHistory;

    }

    public static class Builder{
         private String id;
         private String name;
         List<JobHistory>jobHistory;

        public Builder(String name) {
            this.name = name;
        }

        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder answers(List<JobHistory> value){
            jobHistory=value;
            return this;
        }
        
        public Builder name(Title value){
            id = value.getId();
            name = value.getName();
            jobHistory=value.getJobHistory();
            return this;
        }

        public Title build(){
            return new Title(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<JobHistory> getJobHistory() {
        return jobHistory;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Title other = (Title) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
