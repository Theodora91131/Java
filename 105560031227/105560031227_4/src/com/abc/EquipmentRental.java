/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;
import java.time.LocalDate;
//==============================
// [設備租用]繼承了[租用]
// 也將完成父親所有的抽象方法
//==============================
public class EquipmentRental extends Rental{
    //=====================    
    // 成員
    //=====================  
    private String equipment;    //租用設備
    private int amount;          //租用數量
    
    //=====================    
    // 建構元(1)
    //=====================    
    public EquipmentRental(String category, LocalDate startDate, LocalDate endDate, String equipment, int amount){        
        //自行完成
        super(category, startDate, endDate);
        this.equipment = equipment;
        this.amount = amount;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public EquipmentRental(){
        //自行完成
        super();
        this.equipment = null;
        this.amount = 0;
    }    

    //=====================    
    // getter    
    //===================== 
    //自行完成    
    public String getEquipment(){return this.equipment;}
    public int getAmount(){return this.amount;}
    //=====================    
    // setter    
    //=====================     
    //自行完成
    public void setEquipment( String equipment){this.equipment = equipment;}
    public void setAmount(int amount){this.amount = amount;}
    //=====================    
    // 完成父親的抽象方法    
    //=====================    
    @Override
    public int fee(){
        //自行完成      
        double fee2 = 0;
        switch (this.equipment) {
            case "3D印表機":
                fee2 = 350 * this.amount * super.rentDays();
                break;
            case "雷射雕刻機":
                fee2 = 280 * this.amount * super.rentDays();
                break;
            case "CNC雕刻機":
                fee2 = 450 * this.amount * super.rentDays();
                break;
            default:
                break;
        }
        if(fee2 >= 10000){
            fee2 = Math.floor(fee2 * 0.95);
        }
        return (int)fee2;
    } 
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        //自行完成           
        return "租用類別:" + super.getCategory() + ", 起始日:" + super. getStartDate() + ", 終止日:" + super.getEndDate() +", 天數:" + super.rentDays() +", 設備:"+this.equipment+",數量:"+this.amount+ ", 租金:" + fee();
    }     
    //=====================     
}
