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
public final class DepartementHistory {
    
    private String id;
    private String name;
    
     private DepartementHistory(){

    }

    private DepartementHistory(Builder builder) {
       id=builder.id;
       name= builder.name;
     
    }

    public static class Builder{
        private String id;
    private String name;

        public Builder(String name) {
            this.name = name;
        }

        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder name(DepartementHistory value){
            id = value.getId();
            name = value.getName();
             return this;
        }

        public DepartementHistory build(){
            return new DepartementHistory(this);
        }
        
        
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final DepartementHistory other = (DepartementHistory) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
