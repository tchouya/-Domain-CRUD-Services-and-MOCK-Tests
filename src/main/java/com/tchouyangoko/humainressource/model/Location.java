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
public final class Location {
    private String id;
    private String street_address;
    private String city;
    
    List<Departement>departement;
    
    private Location()
    {
        
    }
    
    private Location(Builder builder)
    {
        id=builder.id;
        street_address=builder.street_address;
        city=builder.city;
        departement=builder.departement;
    }
    
    public static class Builder{
    private String id;
    private String street_address;
    private String city;
    
    List<Departement>departement;
    
    public Builder(String street_address,String city){
        this.street_address=street_address;
        this.city=city;
    }
      
    
    public Builder id(String value){
        id=value;
        return this;
    }
    
    public Builder departement( List<Departement>value)
    {
        departement=value;
        return this;
    }
    
     public Builder street_address(Location value){
            id = value.getId();
            street_address = value.getStreet_address();
            city = value.getCity();
            departement=value.getDepartement();
            
            return this;
        }
    
    public Location build()
    {
        return new Location(this);
    }

       

       
    
  }

    public String getId() {
        return id;
    }

    public String getStreet_address() {
        return street_address;
    }

    public String getCity() {
        return city;
    }

    public List<Departement> getDepartement() {
        return departement;
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}