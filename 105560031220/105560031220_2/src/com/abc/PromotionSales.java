/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class PromotionSales extends Sales {
    //=====================    
    // 建構元(1)
    //=====================   
    public PromotionSales(String no, String product,int amount, int price, int shipment){
        //自行完成
        super(no, product,  price,  amount,  shipment);
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public PromotionSales(){
        //自行完成
        super();
    }
    
    //=====================    
    // 改寫父親的方法(總額)    
    //=====================   
    @Override    
    public int total(){
        //自行完成
        if(super.total() >= 200000){
            return super.total() -  getShipment();
        }else{
            return super.total();
        }
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        //自行完成
        return "編號" + super.getNo() + "," + "品名" + "," + super.getProduct() +  "," + "數量"+ super.getPrice() + "運費" + (super.total()-this.total())+ "總額" +this.total();
    }     
    //=====================      
}
