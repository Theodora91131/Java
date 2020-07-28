/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;


public class FishMarket {
    //=====================
    // 成員    
    //=====================    
    private int num;
    private String city;
    private String fish;
    private int year;
    private double value;
    
    //=====================    
    // 建構元(1)
    //=====================    
    public FishMarket(int num, String city, String fish, int year, double value){
        this.num = num;
        this.city = city;
        this.fish = fish;
        this.year = year;
        this.value = value;               
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public FishMarket(){
        this.num = 0;
        this.city = null;
        this.fish = null;
        this.year = 0;
        this.value = 0;         
    }

    //=====================
    // getters
    //=====================    
    public int getNum(){return this.num;}
    public String getCity(){return this.city;}    
    public String getFish(){return this.fish;}
    public int getYear(){return this.year;}
    public double getValue(){return this.value;}
    
    //=====================    
    // setters
    //=====================    
    public void setNum(int num){this.num = num;}
    public void setCity(String city){this.city = city;}
    public void setFish(String fish){this.fish = fish;}
    public void setYear(int year){this.year = year;}
    public void setValue(double value){this.value = value;} 
}