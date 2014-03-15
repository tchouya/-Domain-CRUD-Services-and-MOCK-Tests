/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tchouyangoko.humainressource.model;

import java.util.Objects;

/**
 *
 * @author mikiahidjo
 */
public final class JobHistory {
    private String id;
    private String endate;
    
    private JobHistory(){

    }

    private JobHistory(Builder builder) {
         id=builder.id;
        endate= builder.endate;
     
    }

    public static class Builder{
      private String id;
    private String endate;

        public Builder(String endate) {
            this.endate = endate;
        }

        public Builder id(String value){
            id=value;
            return this;
        }
       public Builder endate(JobHistory value){
            id = value.getId();
            endate = value.getEndate();
            
            return this;
        }
       

        public JobHistory build(){
            return new JobHistory(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getEndate() {
        return endate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final JobHistory other = (JobHistory) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
