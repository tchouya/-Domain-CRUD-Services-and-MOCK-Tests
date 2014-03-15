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
public final class Email {
    private String name;
  private String password;
  List<Employee>employe;
  
   private Email ()
     {
      
      }
     private Email(Builder builder)
     {
         name=builder.name;
         password=builder.password;
         employe=builder.employe;
     }
  
       public static class Builder{
           private String name;
  private String password;
  List<Employee>employe;
           
     public Builder(String password){
         this.password=password;
        }
      public Builder employe(  List<Employee>value){
          employe=value;
        return this;
      }
       public Builder name(String value){
          name=value;
        return this;
            }
        public Builder password(Email value){
            name = value.getName();
            password = value.getPassword();
            employe = value.getEmploye();
            return this;
        }
         public Email build(){
            return new Email(this);
             }
       }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public List<Employee> getEmploye() {
        return employe;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Email other = (Email) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
 
    
}
