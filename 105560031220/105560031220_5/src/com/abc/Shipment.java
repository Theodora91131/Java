/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;
import java.text.DecimalFormat;

public class Shipment {
    //==========================  
    // 成員    
    //==========================  
    private double type;         //貨車噸位
    private int employees;       //送貨員人數
    private String destination;  //目的地
    private int distance;        //距離(公里)
    
    //==========================    
    // 建構元(1)
    //==========================    
    public Shipment(double type, int employees, String destination, int distance){
        this.type = type;
        this.employees = employees;
        this.destination = destination;
        this.distance = distance;
    }
    
    //==========================    
    // 建構元(2)    
    //==========================         
    public Shipment(){
        this.type = 0;
        this.employees = 0;
        this.destination = null;
        this.distance = 0;        
    }
    
    //==========================  
    // getters
    //==========================       
    public double getType(){return this.type;}
    public int getEmployees(){return this.employees;}
    public String getDestination(){return this.destination;}
    public int getDistance(){return this.distance;}
    
    //==========================  
    // setters
    //==========================       
    public void setType(double type){this.type = type;}
    public void setEmployees(int employees){this.employees = employees;}
    public void setDestination(String destination){this.destination = destination;}
    public void setDistance(int distance){this.distance = distance;}
    
    //==========================    
    // 方法(運輸成本, 小數捨去)    
    //==========================    
    public int humanCost(){
        return (int)(this.employees * 3.1 * this.getDistance());
    }
     public int truckCost(){
        return (int)(this.type * 4.5 *this.getDistance());
    }
    
    public int cost(){
        //自行完成 
       return humanCost() + truckCost(); 
    }

    //==========================    
    // 改寫父親的方法    
    //==========================   
    @Override
    public String toString(){
       return " 貨車噸位:"+ this.type + "," + "送貨員:" + this.employees + "人,目的地:"+ this.destination + ", 距離:"+this.distance + ", 運輸成本:" + cost();
    }
}
