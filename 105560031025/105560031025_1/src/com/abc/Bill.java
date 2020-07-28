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
    public int fee(int level){
      double i = cfee(level);
      double k = i * level;
      int m =(int) Math.round(k);
      return m;          
    }
    private double cfee(int check){
        double r = 0;
        if(check > 1001){
            return r = 6.71d;
        }else if(check >701 && check <1000){
            return r = 6.16;
        }else if(check >501 && check <700){
            return r = 5.44;
        }else if(check >331 && check <500){
            return r = 6.16;
        }else if(check >121 && check <300){
            return r = 3.02;
        }else{
            return r = 2.10;
        }  
    }    
    //=====================  			
}
