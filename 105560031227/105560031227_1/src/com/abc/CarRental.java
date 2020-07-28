/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//==============================
// [汽車租用]繼承了[租用]
// 也將完成父親所有的抽象方法
//==============================
public class CarRental extends Rental{
    //=====================    
    // 建構元(1)
    //=====================    
    public CarRental(String category, LocalDate startDate, LocalDate endDate){        
        //自行完成
        super(category, startDate, endDate);
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public CarRental(){
        //自行完成
        super();
    }    

    //=====================    
    // 完成父親的抽象方法    
    //=====================    
    @Override
    public int fee(){
        //自行完成                
        return 2000 * super.rentDays();
    } 
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        //自行完成       
        return "租用類別:" + super.getCategory() + ", 起始日:" + super. getStartDate() + ", 終止日:" + super.getEndDate() +", 日數:" + super.rentDays() + ", 租金:" + fee();
    }     
    //=====================     
}