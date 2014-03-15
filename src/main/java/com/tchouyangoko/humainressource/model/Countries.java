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
public final class Countries {
    
  private String id;
  private String name;
  List<Location>location;
  
   private Countries ()
     {
      
      }
     private Countries(Builder builder)
     {
         id=builder.id;
         name=builder.name;
         location=builder.location;
     }

   
       public static class Builder{
          private String id;
           private String name;
            List<Location>location;
           
     public Builder(String name){
         this.name=name;
        }
      public Builder location( List<Location>value){
          location=value;
        return this;
      }
       public Builder id(String value){
          id=value;
        return this;
            }
        public Builder name(Countries value){
            id = value.getId();
            name = value.getName();
            location = value.getLocation();
            return this;
        }

         public Countries build(){
            return new Countries(this);
             }
       }
 
      public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Location> getLocation() {
        return location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Countries other = (Countries) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

}
