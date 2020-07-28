/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;
import java.time.LocalDate;
//==============================
// [人力租用]繼承了[租用]
// 也將完成父親所有的抽象方法
//==============================
public class LaborRental extends Rental{
    //=====================    
    // 成員
    //=====================  
    private int labors;       //人數
    private char period;      //工作時段
    private boolean isHeavy;  //是否大量勞力型工作
    
    //=====================    
    // 建構元(1)
    //=====================    
    public LaborRental(String category, LocalDate startDate, LocalDate endDate, int labors, char period, boolean isHeavy){        
        //自行完成
        super(category,  startDate, endDate);
        this.labors = labors;
        this.period = period;
        this.isHeavy = isHeavy;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public LaborRental(){
        //自行完成
        super();
        this.labors = 0;
        this.period = 'n';
        this.isHeavy = false;
    }    

    //=====================    
    // getter    
    //===================== 
    //自行完成    
    public int getLabors(){return this.labors;}
    public char getPeriod(){return this.period;}
    public boolean getIsHeavy(){return this.isHeavy;}
    //=====================    
    // setter    
    //=====================     
    //自行完成
    public void setLabors(int labors){this.labors = labors;}
    public void setPeriod(char period){this.period = period;}
    public void setIsHeavy(boolean isHeavy){this.isHeavy = isHeavy;}
    //=====================    
    // 完成父親的抽象方法    
    //=====================    
    @Override
    public int fee(){
        //自行完成   
        int salary = 0;
        if(this.period == 'A'){
            salary += 1000 * this.labors * rentDays();
        }else if (this.period == 'B'){
            salary += 1500 * this.labors * rentDays();
        }
        if (this.isHeavy == true){
            salary += 500 * this.labors * rentDays();
        }
        return salary;
    }  
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        //自行完成            
        return "租用類別:" + super.getCategory() + ", 起始日:" + super. getStartDate() + ", 終止日:" + super.getEndDate() +",工作天數:" + super.rentDays()  +",人數:" +this.labors +", 工作時段:" + this.period +",是否大量勞力型工作:" + this.isHeavy +", 租金:" + fee();
    }     
    //=====================     
}