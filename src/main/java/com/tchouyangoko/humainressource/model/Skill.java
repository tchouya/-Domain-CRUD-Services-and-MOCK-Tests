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
public final class Skill {
    private String id;
    private String name;
    
    List<Qualification>qualification;
    
     private Skill(){

    }

    private Skill(Builder builder) {
        id=builder.id;
        name= builder.name;
        qualification=builder.qualification;

    }

    public static class Builder{
        private String id;
    private String name;
    
    List<Qualification>qualification;
    
        public Builder(String name) {
            this.name = name;
        }

        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder qualification(List<Qualification> value){
            qualification=value;
            return this;
        }
        
         public Builder name(Skill value){
            id = value.getId();
            name = value.getName();
            qualification=value.getQualification();
            return this;
        }

        public Skill build(){
            return new Skill(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Qualification> getQualification() {
        return qualification;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
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
        final Skill other = (Skill) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
