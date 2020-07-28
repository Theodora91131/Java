/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

//==============================
// [一般傭金類別]繼承了[傭金類別]
// 也將完成父親所有的抽象方法
//==============================
public class RegularCommission extends Commission{
    //=====================    
    // 建構元(1)
   
    //=====================    
    public RegularCommission(String name, int performance){
        //自行完成
      super(name, performance);
    }

    //=====================    
    // 建構元(2)    
    //=====================  
    public RegularCommission(){
        //自行完成
        super();
    }
    
    //=====================    
    // 完成父親的抽象方法    
    //=====================     
    @Override
    public int commission(){
        //自行完成
       return (int)Math.ceil(super.getPerformance() *0.125);
    }
    
    //=====================    
    // 改寫父親的方法    
    //=====================      
    @Override
    public String toString(){
        //自行完成
        return " 交付對象:" + super.getName() + "," + "業績:" + super.getPerformance() + "," + "傭金:" + commission();
    }
    //=====================      
}