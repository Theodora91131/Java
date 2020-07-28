/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class DiscountSales extends Sales {
    //=====================    
    // 成員
    //===================== 
    private double discount; //折扣
    
    //=====================    
    // 建構元(1)
    //=====================    
    public DiscountSales(String no, String product, int price, int amount, int shipment, double discount){
        //自行完成
         super(no, product,  price,  amount,  shipment);
         this.discount = discount;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public DiscountSales(){
        //自行完成
        super();
        this.discount = 0;
    }
    
    //=====================    
    // getter
    //===================== 
    //自行完成    
    public double getDiscount() {return this.discount;}
    
    //=====================    
    // setter
    //=====================     
    //自行完成    
    public void setDiscount (double discount) {this.discount = discount;}
    
    //=====================    
    // 改寫父親的方法(總額)    
    //=====================   
    @Override    
    public int total(){
        //自行完成
        return  (int)(super.getPrice()*super.getAmount() *this.discount) + super.getShipment();
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        //自行完成
        return super.toString();
    }     
    //=====================      
}
