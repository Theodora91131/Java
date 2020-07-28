/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class LongShipment extends Shipment{
    private boolean isHoliday;   //是否假日運輸
    
    //==========================    
    // 建構元(1)
    //==========================    
    public LongShipment(double type, int labors, String destination, int distance, boolean isHoliday){
        //自行完成
        super( type,  labors, destination,  distance);
        this.isHoliday = isHoliday;
    }
    
    //==========================    
    // 建構元(2)    
    //==========================         
    public LongShipment(){
        //自行完成       
        super();
        this.isHoliday = false;
    }
    
    //==========================    
    // getter    
    //==========================         
    //自行完成           
    public boolean getIsHoliday(){return this.isHoliday;}
    
    //==========================    
    // setter    
    //==========================         
    //自行完成       
    public void setIsHoliday(boolean isHoliday){this.isHoliday = isHoliday;}
    
    //==========================    
    // 方法:運輸成本
    //==========================     
    @Override
    public int cost(){
        //自行完成 
        return (int)Math.floor((hcost() + tcost())*(1 + holiday()));
        
    }
    public int hcost(){
        return (int)Math.floor(super.getLabors() * super.getDistance() * 1.4);
    }
    public int tcost(){
        if(super.getDistance() < 100){
            return (int)Math.floor(super.getType() * super.getDistance() * 4.8);
        }else if (super.getDistance() >100 && super.getDistance() <= 200){
            return (int)Math.floor(super.getType() * super.getDistance() * 4.2);
        }else if (super.getDistance() >= 200){
            return (int)Math.floor(super.getType() * super.getDistance() * 3.8);
        }
        return 0;
    }
    public double holiday(){
        if(this.isHoliday == true){
            return 0.2;
        }else{
            return 0;
        }
    }
   
    // 方法:輸出
    //==========================   
    @Override
    public String toString(){
       //自行完成
       return " 貨車噸位:" + super.getType() + ", 送貨員:" + super.getLabors() + "人, 目的地:" + super.getDestination() +", 距離:" +super.getDistance() + "公里, 是否假日運輸:" + this.isHoliday + "運輸成本:" + cost();
    }
}
