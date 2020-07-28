/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class PartTimeEmployee extends Employee {
    //=====================
    // 成員    
    //=====================       
    private int workingHours;  //兼職時數
    //=====================    
    // 建構元(1)
    //=====================      
    public PartTimeEmployee(String id, String name, String department, String rank, int overHours, int workingHours) {
        super(id, name, department, rank, overHours);
        this.workingHours = workingHours;
    }
    //=====================    
    // 建構元(2)    
    //=====================  
    public PartTimeEmployee() {
        super();
        this.workingHours = 0;
    }
    //=====================
    // getters
    //=====================     
    //自行完成  
    public int getWorkingHours() {
        return this.workingHours;
    }
   //=====================    
    // setters
    //=====================      
    //自行完成   
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    //=====================    
    // 方法(薪水)    
    //===================== 
    @Override
    public int salary() {
        if(super.getRank().equals("A")){
            return this.workingHours * 400;
        }else if(super.getRank().equals("B")){
            return this.workingHours * 300;
        }else if(super.getRank().equals("C")){
            return this.workingHours * 220;
        }else {
            return this.workingHours * 185;
        }
    }

    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString() {
       return "編號" + super.getId() + "," + "姓名"+ super.getName() + ","+ "部門" + super.getDepartment()+ ","+ "職等"+ super.getRank()+ "," + "兼職時數"+ workingHours+ "," +"每小時薪水"+ salary()/workingHours+ ","+"薪水"+salary();
    }
    //=====================  
}
