/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;


import java.text.DecimalFormat;

public class Employee extends Object{
    //=====================
    // 成員    
    //=====================    
    private String id;
    private String name;    
    private String department;
    private String rank;
    private int overHours;
    
    //=====================    
    // 建構元(1)
    //=====================    
    public Employee(String id, String name, String department, String rank, int overHours){
        this.id = id;
        this.name = name;
        this.department = department;
        this.rank = rank;     
        this.overHours = overHours;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public Employee(){
        this.id = null;
        this.name = null;
        this.department = null;
        this.rank = null;        
        this.overHours = 0;
    }

    //=====================
    // getters
    //=====================    
    public String getId(){return this.id;}
    public String getName(){return this.name;}    
    public String getDepartment(){return this.department;}
    public String getRank(){return this.rank;}
    public int getOverHours(){return this.overHours;}
    
    //=====================    
    // setters
    //=====================    
    public void setId(String id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setDepartment(String department){this.department = department;}
    public void setRank(String rank){this.rank = rank;}
    public void setOverHours(int overHours){this.overHours = overHours;}
    
    //=====================    
    // 方法(薪水)    
    //=====================    
    public int salary(){
        int base;
        
        switch (this.rank) {
            case "A":
                base = 45000;
                break;
            case "B":
                base = 35000;
                break;
            case "C":
                base = 30000;
                break;
            default:
                base = 25000;
                break;
        }
        
        return  base + (overHours * 250);
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("###,###");
        return this.id + ", "+ this.name + ", " + this.department +  ", " + this.rank + ", " +  this.overHours + ", " + df.format(this.salary()) + "元";
    }     
    //=====================      
}
