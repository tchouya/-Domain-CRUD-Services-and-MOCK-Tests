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
public final class Job {
    private String id;
    private String title;
    private double min_salary;
    private double max_salary;
    
    List<JobHistory>jobhistory;
    
     private Job(){

    }

    private Job(Builder builder) {
       id=builder.id;
        title= builder.title;
        min_salary=builder.min_salary;
        max_salary =builder.max_salary;
        jobhistory =builder.jobhistory;
    }

    public static class Builder{
        private String id;
    private String title;
    private double min_salary;
    private double max_salary;
    
    List<JobHistory>jobhistory;

        public Builder(String title,double min_salary,double max_salary) {
            
            this.title = title;
            this.min_salary = min_salary;
            this.max_salary = max_salary;
        }

        public Builder id(String value){
            id=value;
            return this;
        }

        public Builder answers( List<JobHistory> value){
            jobhistory=value;
            return this;
        }
        public Builder title(Job value){
            id= value.getId();
            title = value.getTitle();
            min_salary = value.getMin_salary();
            max_salary = value.getMax_salary();
            jobhistory =value.getJobhistory();
            return this;
        }

        public Job build(){
            return new Job(this);
        }
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getMin_salary() {
        return min_salary;
    }

    public double getMax_salary() {
        return max_salary;
    }

    public List<JobHistory> getJobhistory() {
        return jobhistory;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Job other = (Job) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
