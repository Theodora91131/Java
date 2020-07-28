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
public class Product {
    //------------------------------   
    // 成員    
    //------------------------------ 
    private String item;          //商品名稱
    private int amount;           //進貨數量
    private int purchase;         //購入成本
    private int marketing;        //行銷成本    
    
    //------------------------------    
    // 建構元(1)
    //------------------------------       
    public Product(String item, int amount, int purchase, int marketing){
        this.item = item;
        this.amount = amount;
        this.purchase = purchase;
        this.marketing = marketing;
    }
    
    //------------------------------    
    // 建構元(2)    
    //------------------------------      
    public Product(){
        this.item = null;
        this.amount = 0; 
        this.purchase = 0;
        this.marketing = 0;
    }
    
    //------------------------------  
    // getters
    //------------------------------        
    public String getItem(){return this.item;}
    public int getAmount(){return this.amount;}
    public int getPurchase(){return this.purchase;}
    public int getMarketing(){return this.marketing;}    

    //------------------------------  
    // setters
    //------------------------------ 
    public void setItem(String item){this.item = item;}
    public void setAmount(int amount){this.amount = amount;}
    public void setPurchase(int purchase){this.purchase = purchase;}
    public void setMarketing(int marketing){this.marketing = marketing;}    

    //===============================    
    // 方法:平均成本    
    //===============================  
    public int cost(){
        //自行完成    
        return  (int)Math.ceil((this.purchase+this.marketing)/this.amount);
    }
    
    //===============================    
    // 方法:定價    
    //===============================  
    public int price(){
        //自行完成      
        if(this.amount > 200){
           return (int)Math.ceil(cost() * 1.2);
        }else if(this.amount > 150 && this.amount <= 200){
            return (int)Math.ceil(cost() * 1.25);
        }else if(this.amount > 100 && this.amount <= 150){
            return (int)Math.ceil(cost() * 1.3);
        }else if(this.amount <= 100) {
            return (int)Math.ceil(cost() * 1.4);
        }
        return 0;
    }  
    
    //===============================    
    // 方法:輸出    
    //===============================  
    @Override
    public String toString(){
        //自行完成          
        return " 品名:" + this.item + ", 進貨數量:" + this.amount + ", 購入成本:" + this.purchase + "元" + ", 行銷成本:" + this.marketing + "元" + ", 平均成本:" + this.cost() +"元, 定價:" + this.price() +"元" ;
            
                
    }    
    //===============================      
}