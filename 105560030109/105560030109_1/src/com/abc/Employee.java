/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class Employee{
    //=====================
    // 成員    
    //=====================    
    private String id;       //員工編號
    private String name;     //姓名  
    private int seniority;   //年資
    private int overHours;   //加班時數
    
    //=====================    
    // 建構元(1)
    //=====================    
    public Employee(String id, String name, int seniority, int overHours){
        this.id = id;
        this.name = name;
        this.seniority = seniority;
        this.overHours = overHours;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public Employee(){
        this.id = null;
        this.name = null;
        this.seniority = 0;
        this.overHours = 0;
    }

    //=====================
    // getters
    //=====================    
    public String getId(){return this.id;}
    public String getName(){return this.name;}    
    public int getSeniority(){return this.seniority;}
    public int getOverHours(){return this.overHours;}
    
    //=====================    
    // setters
    //=====================    
    public void setId(String id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setSeniority(int seniority){this.seniority = seniority;}
    public void setOverHours(int overHours){this.overHours = overHours;}

    //=====================    
    // 方法(本薪)    
    //=====================    
    public int salary(){
        //自行完成
        int fee = 0;
        if(this.seniority <= 9 && this.seniority >= 7){
            fee = 42000;
        }else if (this.seniority <= 6 && this.seniority >= 5){
            fee = 36000;
        }else if (this.seniority <= 4 && this.seniority >= 3){
            fee = 32000;
        }else if (this.seniority <= 2 && this.seniority >= 1){
            fee = 28000;
        }
        if(this.seniority > 9){
           fee += (this.seniority - 9) * 1500 + 42000;
        }
        return fee;
    }    
    
    //=====================    
    // 方法(加班費)    
    //=====================    
    public int overPay(){
        //自行完成
        return this.overHours * 220;
    }     
    
    //=====================    
    // 方法(代扣金)    
    //=====================    
    public int withholding(){
        //自行完成
       if((salary() + overPay()) > 50000){
           return 2500;
        }else if((salary() + overPay()) > 35000 && (salary() + overPay()) <= 50000){
           return 2000;
        }else if((salary() + overPay()) > 30000 && (salary() + overPay()) <= 35000){
           return 1800;
        }else{
            return 1200;
        }
    } 

    //=====================    
    // 方法(給付薪資)    
    //=====================    
    public int payment(){
        //自行完成
        return (salary() + overPay()) - withholding();
    } 
    
    //=====================    
    // 方法(輸出)   
    //=====================    
    @Override
    public String toString(){
        //自行完成
        return "  員工編號:" + this.id + ", 姓名:" + this.name + ", 本薪:" + salary() +", 加班費" + this.overPay() + ", 代扣金:" + this.withholding() + "元, 給付薪資:" + payment();
    }     
    //=====================      
}
