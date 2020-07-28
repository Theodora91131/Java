/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

//==============================
// [長途貨運]繼承了[貨運]
// 也將完成父親所有的抽象方法
//==============================
public class LongShipment extends Shipment{
    //------------------------------    
    // 建構元(1)
    //------------------------------   
    public LongShipment(double carType, int labors, String destination, int distance){
        super(carType, labors, destination, distance);
    }
    
    //------------------------------    
    // 建構元(2)    
    //------------------------------         
    public LongShipment(){
        super();        
    }
    
    //===============================    
    // 完成父親的抽象方法: 
    // 人力成本(小數捨去)    
    //===============================     
    @Override
    public int laborCost(){
       //自行完成        
       return (int) Math.floor(super.getLabors()*super.getDistance()*2.8);
    } 
    
    //===============================    
    // 完成父親的抽象方法:
    // 貨車成本(小數捨去)    
    //===============================  
     @Override
    public int carCost(){
       //自行完成        
       if(super.getDistance() > 250){
           return (int)Math.floor ((super.getDistance() - 250) * 3.3 * super.getCarType() + (250 - 180) * 3.6 * super.getCarType() +  (180- 100) * 4.2 * super.getCarType() +100 * 4.8 * super.getCarType());
       }else if (super.getDistance() <= 250 && super.getDistance() >= 180){
           return (int) Math.floor((250 - 180) * 3.6 * super.getCarType() +  (180- 100) * 4.2 * super.getCarType() +100 * 4.8 * super.getCarType());
       }else if (super.getDistance() <= 180 && super.getDistance() >= 100){
           return (int) ((180- 100) * 4.2 * super.getCarType() +100 * 4.8 * super.getCarType());
       }else 
            return (int)Math.floor(100 * 4.8 * super.getCarType());
    }
   
    
    //===============================  
    // 完成父親的抽象方法:    
    // 總成本    
    //===============================     
    @Override
    public int totalCost(){
       //自行完成   
       return carCost() + laborCost();
    }     

    //===============================     
    // 改寫父親的方法    
    //===============================      
    @Override
    public String toString(){
       //自行完成
        return "貨車噸位:" + super.getCarType() +","+" 送貨員:"+super.getLabors()+", 目的地:"+super.getDestination()+",距離:"+super.getDistance()+",人力成本:"+laborCost()+" ,貨車成本:"+ carCost()+", 總成本:"+ totalCost();
    }
    //===============================     
}
