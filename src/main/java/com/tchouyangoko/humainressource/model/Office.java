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
public final class Office {
    private String id;
    private String name;
    
     private Office(){

    }

    private Office(Builder builder) {
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

        public Builder name(Office value){
            id = value.getId();
            name = value.getName();           
            return this;
        }

        public Office build(){
            return new Office(this);
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
        int hash = 5;
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
        final Office other = (Office) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    
}
