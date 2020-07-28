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
import java.time.LocalDate;

public class Material implements Expense {
    //======================== 
    // 成員
    //======================== 

    private LocalDate date;    //購入日
    private String item;       //項目名稱
    private int price;         //每公斤價格
    private int weight;        //購入公斤數

    //========================   
    // 建構元(1) 傳4個參數
    //========================  
    public Material(LocalDate date, String item, int price, int weight) {
        this.date = date;
        this.item = item;
        this.price = price;
        this.weight = weight;

    }

    //======================== 
    // 建構元(2) 傳0個參數
    //======================== 
    public Material() {
    }

    //======================== 
    // Setters
    //======================== 
    public void setlDate(LocalDate date) {
        this.date = date;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    //========================  
    // Getters
    //======================== 
    //======================== 
    // 完成介面的抽象方法(1)
    //========================    
    @Override
    public String category() {
        return "原料支出";
    }

    //======================== 
    // 完成介面的抽象方法(2)
    //======================== 
    @Override
    public String detail() {
        return this.date + "購入可可豆,1公斤" + this.price + "元,購入" + this.weight + "公斤";

    }

    //======================== 
    // 完成介面的抽象方法(3)
    //======================== 
    @Override
    public int total() {
        
        return (int)(this.price * this.weight);
    }

//======================== 

}
