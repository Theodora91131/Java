/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

//==============================
// [累進傭金類別]繼承了[傭金類別]
// 也將完成父親所有的抽象方法
//==============================
public class AccumulatedCommission extends Commission {

    //=====================    
    // 成員
    //=====================  
    private int quota;         //達標金額
    private double extraRate;  //累進傭金率

    //=====================    
    // 建構元(1)
    //=====================    
    public AccumulatedCommission(String name, int performance, int quota, double extraRate) {
        //自行完成
        super(name, performance);
        this.quota = quota;
        this.extraRate = extraRate;
    }

    //=====================    
    // 建構元(2)    
    //=====================  
    public AccumulatedCommission() {
        //自行完成
        super();
        this.quota = 0;
        this.extraRate = 0;
    }

    //=====================    
    // getter    
    //=====================  
    //自行完成
    public int getQuota() {
        return this.quota;
    }

    public double getextraRate() {
        return this.extraRate;
    }

    //=====================    
    // setter    
    //=====================  
    //自行完成
    public void setQuota(int quota) {
        this.quota = quota;
    }

    public void setextraRate(double extraRate) {
        this.extraRate = extraRate;
    }

    //=====================    
    // 完成父親的抽象方法    
    //=====================     
    @Override
    public int commission() {
        //自行完成
        if (super.getPerformance() >= this.quota) {
            return (int) Math.ceil(this.quota * 0.125 + (super.getPerformance() - this.quota) * this.extraRate);
        } else {
            return (int) Math.ceil(this.quota * 0.11 - (this.quota - super.getPerformance() ) * (this.extraRate - 0.123));
        }
    }


//=====================    
// 改寫父親的方法    
//=====================      
    @Override
    public String toString(){
        //自行完成
        return " 交付對象:" + super.getName() + "," + "業績:" + super.getPerformance() + "," +" 達標金額:" + quota +","+"累進傭金率"+this.extraRate +","+"傭金:" + this.commission();
    }
    //=====================      
}