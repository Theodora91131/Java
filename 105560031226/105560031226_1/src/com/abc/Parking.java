/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

import java.math.RoundingMode;
import java.text.DecimalFormat;

//===============================  
// 子類別完成了父親的抽象方法
//=============================== 
public class Parking extends Location {
    //---------------------------  
    // 成員
    //---------------------------  
    private String name;     //導航[提醒位置]的名稱
    private String address;  //導航[提醒位置]的地址
    
    //---------------------------  
    // 建構元(1)
    //---------------------------      
    public Parking(String category, double lat, double lng, String name, String address){
        super(category, lat, lng);
        this.name = name;
        this.address = address;
    }
    
    //---------------------------  
    // 建構元(2)
    //---------------------------      
    public Parking(){
        super();
        this.name = null;
        this.address = null;
    }    
        
    //---------------------------  
    // getters
    //---------------------------      
    public String getName(){return this.name;}
    public String getAddress(){return this.address;}

    //---------------------------  
    // setters
    //---------------------------  
    public void setName(String name){this.name = name;}
    public void setAddress(String address){this.address = address;}

    //===========================  
    // 完成父親的抽象方法
    //===========================  
    @Override
    public String description(double lat, double lng){
        DecimalFormat df = new DecimalFormat("##0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);  //四捨五入
        
        return "(" + super.getCategory() + ")" + this.getName() + ", 地址:" + this.getAddress() + ", 距離:" + df.format(super.distance(lat, lng)) + "公尺";
    }  
    //===========================  
}
