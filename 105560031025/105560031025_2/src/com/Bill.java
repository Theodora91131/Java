/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author user
 */
public class Bill {
    //===================== 
    //成員
    //=====================      

    private String cusNo;
    private int degree;

    //=====================  
    //建構元(1) 傳2個參數
    //=====================    
    public Bill(String cusNo, int degree) {
        this.cusNo = cusNo;
        this.degree = degree;

    }

    //=====================  
    //建構元(2) 傳0個參數
    //=====================    
    public Bill() {
        this.cusNo = null;
        this.degree = 0;
    }

    //=====================
    // getters
    //=====================    
    public String getCusNo() {
        return cusNo;
    }

    public int getDegree() {
        return degree;
    }

    //=====================    
    // setters
    //=====================    
    public void setCusNo(String  cusNo) {
        this. cusNo =  cusNo;
    }

    public void setComp(int degree) {
        this.degree = degree;
    }

    //=====================    
    //方法(計算電費)
    //=====================    
    public int fee(int degree){
      int cfee = 0;  
      int level = 500;
      if (degree >= level){
        return cfee = (int)Math.round(4.2 * degree);
      }else{
        return cfee = (int)Math.round(3.8 * degree);
      }
    }
   
        
    //=====================  			
}
