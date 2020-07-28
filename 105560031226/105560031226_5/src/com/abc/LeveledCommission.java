/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

//==============================
// [績效傭金類別]繼承了[傭金類別]
// 也將完成父親所有的抽象方法
//==============================
public class LeveledCommission extends Commission{
    //=====================    
    // 成員
    //=====================  
    private int quota;   //達標金額
    
    //=====================    
    // 建構元(1)
    //=====================    
    public LeveledCommission(String name, int performance, int quota){
        //自行完成
        super(name,  performance);
        this.quota = quota;
    }

    //=====================    
    // 建構元(2)    
    //=====================  
    public LeveledCommission(){
        //自行完成
        super();
        this.quota = 0;
    }
  
    //=====================    
    // getter    
    //=====================  
    //自行完成
    public int getQuota(){return this.quota;}
    //=====================    
    // setter    
    //=====================  
    //自行完成
    public void setQuota(int quota){this.quota = quota;}
    //=====================    
    // 完成父親的抽象方法    
    //=====================     
    @Override
    public int commission(){
        //自行完成
        if(super.getPerformance() >= this.quota){
            return (int)Math.ceil(super.getPerformance() *0.125);
        }else{
           return (int) Math.ceil(super.getPerformance()*0.12 - (super.getPerformance() - this.quota) *0.03);
        }
    }    
    
    //=====================    
    // 改寫父親的方法    
    //=====================      
    @Override
    public String toString(){
        //自行完成
           return " 交付對象:" + super.getName() + "," + "業績:" + super.getPerformance() + "," +" 達標金額:" + quota +","+"傭金:" + this.commission();
    }
    //=====================      
}