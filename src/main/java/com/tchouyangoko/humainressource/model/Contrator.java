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
public final class Contrator implements Users {
     private String CompRegNum;//CompRegNum =Company Registration Number
     private String firstname;
     private String lastname;
     private String address;
    
    
   
     private Contrator(){

    }

    private Contrator(Builder builder) {
        CompRegNum=builder.CompRegNum;
        firstname= builder.firstname;
        lastname=builder.lastname;
       address=builder.address;
    }

    public static class Builder{
    private String CompRegNum;
    private String firstname;
    private String lastname;
     private String address;
    
   
        public Builder(String firstname,String lastname,String address) {
            this.firstname = firstname;
            this.lastname=lastname;
            this.address=address;
        }

        public Builder CompRegNum(String value){
            CompRegNum=value;
            return this;
        }
        public Builder firstname(Contrator value){
            CompRegNum = value.getCompRegNum();
            firstname = value.getFirstname();
            lastname = value.getLastname();
            address = value.getAddress();
            return this;
        }
       

        public Contrator build(){
            return new Contrator(this);
        }
    }

    public String getCompRegNum() {
        return CompRegNum;
    }

   
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.CompRegNum);
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
        final Contrator other = (Contrator) obj;
        if (!Objects.equals(this.CompRegNum, other.CompRegNum)) {
            return false;
        }
        return true;
    }

   
    
}
