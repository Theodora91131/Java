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
public class Score{
    //===================== 
    // 成員
    //===================== 
    public String date;
    public String market;
    public String vegetable;    
    public double top;
    public double middle;
    public double bottom;
    public double avg;
    public double amount;  
    
    //=====================  
    // 方法
    //=====================    
 public Score(String date,String market, String vegetable, double top, double middle, double bottom, double avg, double amount ){
     this. date =date;
     this.market = market;
     this.vegetable = vegetable;
     this.top = top;
     this.middle = middle;
     this.bottom = bottom;
     this.avg = avg;
     this.amount = amount;
     
     
     
}
}