/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

/**
 *
 * @author user
 */
public class ExcellentEmployee extends Employee{
    //=====================    
    // 建構元(1)
    //=====================    
    public ExcellentEmployee(String id, String name, String department, String rank, int overHours){
        //自行完成
        super(id,name,department,rank,overHours);
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public ExcellentEmployee(){
        //自行完成
        super();
    }

    //=====================    
    // 方法(薪水)    
    //=====================   
    @Override
    public int salary(){
       return super.salary() + 5000;
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        return super.toString();
    }     
    //===================== 
}