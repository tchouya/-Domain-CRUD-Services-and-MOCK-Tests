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
public final class Region {
    
private String id;
private String name;
List<Countries> countries;

 private Region(){

    }

    private Region(Builder builder) {
        id=builder.id;
        name= builder.name;
        name=builder.name;

    }

    public static class Builder{
      private String id;
      private String name;
      List<Countries> countries;


        public Builder(String name) {
            this.name = name;
        }

        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder counties(List<Countries>  value){
            countries=value;
            return this;
        }
        
        public Builder name(Region value){
            id = value.getId();
            name = value.getName();
            countries = value.getCountries();
            return this;
        }

        public Region build(){
            return new Region(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Countries> getCountries() {
        return countries;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
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
        final Region other = (Region) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
