/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class Shipment {
    //==========================  
    // 成員    
    //==========================  
    private double type;         //貨車噸位
    private int labors;          //送貨員人數
    private String destination;  //目的地
    private int distance;        //距離(公里)
    
    //==========================    
    // 建構元(1)
    //==========================    
    public Shipment(double type, int labors, String destination, int distance){
        this.type = type;
        this.labors = labors;
        this.destination = destination;
        this.distance = distance;
    }
    
    //==========================    
    // 建構元(2)    
    //==========================         
    public Shipment(){
        this.type = 0;
        this.labors = 0;
        this.destination = null;
        this.distance = 0;        
    }
    
    //==========================  
    // getters
    //==========================       
    public double getType(){return this.type;}
    public int getLabors(){return this.labors;}
    public String getDestination(){return this.destination;}
    public int getDistance(){return this.distance;}
    
    //==========================  
    // setters
    //==========================       
    public void setType(double type){this.type = type;}
    public void setLabors(int labors){this.labors = labors;}
    public void setDestination(String destination){this.destination = destination;}
    public void setDistance(int distance){this.distance = distance;}
    
    //==========================    
    // 方法:運輸成本
    //==========================     
    public int cost(){
        return (int)(1.5 * distance + 1.7 * labors); 
    }
}
