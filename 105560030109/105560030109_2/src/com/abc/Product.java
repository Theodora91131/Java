/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;


public class Product implements Pricing{
    //=====================
    // 成員        
    //=====================    
    private String product;   //產品名稱
    private int amount;       //生產數量  
    private int fixedCost;    //固定成本 
    private int varCost;      //變動成本
    
    //=====================    
    // 建構元(1)
    //=====================    
    public Product(String product, int amount, int fixedCost, int varCost){
        this.product = product;
        this.amount = amount;
        this.fixedCost = fixedCost;
        this.varCost = varCost;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public Product(){
        this.product = null;
        this.amount = 0;
        this.fixedCost = 0;
        this.varCost = 0;
    }

    //=====================
    // getters
    //=====================    
    public String getProduct(){return this.product;}
    public int getAmount(){return this.amount;}
    public int getFixedCost(){return this.fixedCost;}    
    public int getVarCost(){return this.varCost;}
    
    //=====================    
    // setters
    //=====================    
    public void setProduct(String product){this.product = product;}
    public void setAmount(int amount){this.amount = amount;}
    public void setFixedCost(int fixedCost){this.fixedCost = fixedCost;}
    public void setVarCost(int varCost){this.varCost = varCost;}
    
   
    public int pprice(){
        return (this.fixedCost + this.varCost)/this.amount;
    }
     //=========================     
    // 方法(一般定價)   
//=========================   
    @Override
    public int price(){
        //自行完成
        if(pprice() >= 900){
            return (int) Math.round(pprice() * 1.55);
        }else if(pprice() >= 500 && pprice() < 900){
            return (int) Math.round(pprice() * 1.45);
        }else{
             return (int) Math.round(pprice() * 1.35);
        }
    }   

    //=========================    
    // 方法(指定利潤率定價)    
    //=========================   
    @Override
    public int price(double profitRate){
        //自行完成
        return (int) Math.round(pprice() * ( 1 +  profitRate));
    }     
  
    //=====================    
    // 方法(輸出)      
    //=====================    
    @Override
    public String printInfo(){
        //自行完成
        return "產品名稱:" + this.product + ", 成本:" + this.pprice() + "元, (一般定價)價格:" + this.price() + "元, (指定利潤率定價)價格:" + this.price(0.5);
    }     
    //=====================      
}