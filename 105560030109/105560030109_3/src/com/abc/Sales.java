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
    private String no;        //銷售編號
    private String name;      //銷售員
    private String product;   //產品編號  
    private int price;        //單價 
    private int amount;       //銷售數量
    
    //=====================    
    // 建構元(1)
    //=====================    
    public Sales(String no, String name, String product, int price, int amount){
        this.no = no;
        this.name = name;
        this.product = product;
        this.price = price;
        this.amount = amount;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public Sales(){
        this.no = null;
        this.name = null;
        this.product = null;
        this.price = 0;
        this.amount = 0;
    }

    //=====================
    // getters
    //=====================    
    public String getNo(){return this.no;}
    public String getName(){return this.name;}
    public String getProduct(){return this.product;}    
    public int getPrice(){return this.price;}
    public int getAmount(){return this.amount;}
    
    //=====================    
    // setters
    //=====================    
    public void setNo(String no){this.no = no;}
    public void setName(String name){this.name = name;}
    public void setProduct(String product){this.product = product;}
    public void setPrice(int price){this.price = price;}
    public void setAmount(int amount){this.amount = amount;}    

    public boolean printInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}