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
public final class Departement {
    private String id;
    private String name;
   
    List<Employee>employe;
    List<DepartementHistory>dephistory;
    
     private Departement(){

    }

    private Departement(Builder builder) {
        id=builder.id;
        name= builder.name;
        employe=builder.employe;
        dephistory=builder.dephistory;

    }

    public static class Builder{
        private String id;
    private String name;
   
    List<Employee>employe;
    List<DepartementHistory>dephistory;

        public Builder(String name) {
            this.name = name;
        }

        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder employe(List<Employee> value){
            employe=value;
            return this;
        }
         public Builder dephistory(List<DepartementHistory> value){
            dephistory=value;
            return this;
        }
          public Builder name(Departement value){
            id = value.getId();
            name = value.getName();
            employe = value.getEmploye();
            dephistory = value.getDephistory();
            return this;
        }

        public Departement build(){
            return new Departement(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmploye() {
        return employe;
    }

    public List<DepartementHistory> getDephistory() {
        return dephistory;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final Departement other = (Departement) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

   
}
