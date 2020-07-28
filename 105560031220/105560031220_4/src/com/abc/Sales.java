/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;


public class Sales {
    //=====================
    // 成員        
    //=====================    
    private String no;      //編號
    private String product; //品名  
    private int price;      //單價 
    private int amount;     //數量
    private int shipment;   //運費
    
    //=====================    
    // 建構元(1)
    //=====================    
     public Sales(String no, String product, int amount , int price, int shipment){
        this.no = no;
        this.product = product;
        this.price = price;
        this.amount = amount;
        this.shipment = shipment;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public Sales(){
        this.no = null;
        this.product = null;
        this.price = 0;
        this.amount = 0;
        this.shipment = 0;
    }

    //=====================
    // getters
    //=====================    
    public String getNo(){return this.no;}
    public String getProduct(){return this.product;}    
    public int getPrice(){return this.price;}
    public int getAmount(){return this.amount;}
    public int getShipment(){return this.shipment;}
    
    //=====================    
    // setters
    //=====================    
    public void setNo(String no){this.no = no;}
    public void setProduct(String product){this.product = product;}
    public void setPrice(int price){this.price = price;}
    public void setAmount(int amount){this.amount = amount;}
    public void setShipment(int shipment){this.shipment = shipment;}
    
    //=====================    
    // 方法(總額)    
    //=====================    
    public int total(){
        //自行完成
        return  (int)(this.price*this.amount) + this.shipment;
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        //自行完成
        return "編號" + no + "," + "品名" + "," + product +  "," + "數量"+ price + "運費" + shipment + "總額" + total();
    }     
    //=====================      
}