/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

/**
 *
 * @author user
 */
public class SalesReturn extends Sales{
    //=====================
    // 成員        
    //=====================    
    private int returnAmt;   //銷售退回數量
    
    //=====================    
    // 建構元(1)
    //=====================    
    public SalesReturn(String no, String name, String product, int price, int amount, int returnAmt){
        //自行完成
        super(no, name, product, price, amount);
        this.returnAmt = returnAmt;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public SalesReturn(){
        //自行完成
        super();
        this.returnAmt = 0;
    }

    //=====================
    // getters
    //=====================    
    //自行完成
    public int getReturnAmt() { return this.returnAmt;}
    //=====================    
    // setters
    //=====================    
    //自行完成
    public void setReturnAmt() {this.returnAmt = returnAmt;}
    //=====================    
    // 方法(銷貨收入)    
    //=====================    
    public int revenue(){
        //自行完成
       return (this.getAmount() - this.returnAmt) * this.getPrice();
    }   
    
    //=====================    
    // 方法(銷貨成本)    
    //=====================   
    public int cost(){
        //自行完成
        return sscost() + shcost() + srcost();
    }     
    public int sscost(){
        //自行完成
        return (int) Math.round(revenue() * 0.65);
    }     
    public int shcost(){
        //自行完成
        return (145 * super.getAmount()) + (115 * this.returnAmt);
    }     
     public int srcost(){
        //自行完成
        return (int)Math.round((super.getPrice() * this.returnAmt) * 0.35);
    }    
  
    //=====================    
    // 方法(銷貨利潤)    
    //=====================    
    public int profit(){
        //自行完成
        return revenue() - cost();
    }      
    
    //=====================    
    // 方法(輸出)      
    //=====================    
    @Override
    public String toString(){
        //自行完成
        return "銷售編號:" + this.getNo() + ", 銷售員:" + this.getName() + ", 銷貨收入:" + revenue() + "元, 銷貨成本:" + cost() + "元, 銷貨利潤:" + profit();
    }     
    //=====================      
}