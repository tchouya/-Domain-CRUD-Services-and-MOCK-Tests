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
public final class ProjetAssign {
    private String id;
    private String date;
    private double budget;
    
     private ProjetAssign(){

    }

    private ProjetAssign(Builder builder) {
       id=builder.id;
        date= builder.date;
        budget=builder.budget;

    }

    public static class Builder{
       private String id;
    private String date;
    private double budget;

        public Builder(String date,double budget) {
            this.date = date;
            this.budget = budget;
        }

        public Builder id(String value){
            id=value;
            return this;
        }

       public Builder date(ProjetAssign value){
            id = value.getId();
            date = value.getDate();
            budget = value.getBudget();
             return this;
        }

        public ProjetAssign build(){
            return new ProjetAssign(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.id);
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
        final ProjetAssign other = (ProjetAssign) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
