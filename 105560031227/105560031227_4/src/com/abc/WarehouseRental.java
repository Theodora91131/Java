/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;
import java.time.LocalDate;
//==============================
// [倉儲租用]繼承了[租用]
// 也將完成父親所有的抽象方法
//==============================
public class WarehouseRental extends Rental{
    //=====================    
    // 成員
    //=====================  
    private int footage;  //坪數
    
    //=====================    
    // 建構元(1)
    //=====================    
    public WarehouseRental(String category, LocalDate startDate, LocalDate endDate, int footage){        
        //自行完成
        super( category,  startDate,  endDate);
        this.footage = footage;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public WarehouseRental(){
        //自行完成
        super();
    }    

    //=====================    
    // getter    
    //===================== 
    //自行完成    
    public int getFootage (){return this.footage;}
    
    //=====================    
    // setter    
    //=====================     
    //自行完成
    public void setFootage (int footage){this.footage = footage;}
    
    //=====================    
    // 完成父親的抽象方法    
    //=====================    
    @Override
    public int fee(){
        //自行完成       
        int a = (int) (rentDays() / 20);
        int b = (int) (rentDays() % 20);
        return (a * this.footage * 250) +  (b * this.footage * 30);
    } 
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        //自行完成            
        return "租用類別:" + super.getCategory() + ", 起始日:" + super. getStartDate() + ", 終止日:" + super.getEndDate() +", 日數:" + super.rentDays() +", 坪數:" + this.footage + ", 租金:" + fee();
    }     
    //=====================     
}
