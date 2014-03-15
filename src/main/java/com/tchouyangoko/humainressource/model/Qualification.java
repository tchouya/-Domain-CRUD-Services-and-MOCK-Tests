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
public final class Qualification {
    private String id;
    private String name;
    
   private Qualification(){

    }

    private Qualification(Builder builder) {
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

          public Builder name(Qualification value){
            id = value.getId();
            name = value.getName();           
            return this;
        }

        public Qualification build(){
            return new Qualification(this);
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
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Qualification other = (Qualification) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
   
}
