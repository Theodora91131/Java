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
public class Accident extends Location{
    //---------------------------  
    // 成員
    //---------------------------   
    private String blocks;  //交通阻塞狀況
    
    //---------------------------  
    // 建構元(1)
    //---------------------------    
    public Accident(String category, double lat, double lng, String blocks){
        super(category, lat, lng);
        this.blocks = blocks;
    }
    
    //---------------------------  
    // 建構元(2)
    //---------------------------     
    public Accident(){
        super();
        this.blocks = null;
    }
    
    //---------------------------  
    // getters
    //---------------------------      
    public String getBlocks(){return this.blocks;}
    
    //---------------------------  
    // setters
    //---------------------------     
    public void setBlocks(String blocks){this.blocks = blocks;}
    
    //===========================  
    // 完成父親的抽象方法
    //===========================      
    @Override
    public String description(double lat, double lng){
        DecimalFormat df = new DecimalFormat("##0");
        df.setRoundingMode(RoundingMode.HALF_UP);  //四捨五入
        
        return "(" + super.getCategory() + ")" + this.getBlocks() + ", 距離: " + df.format(super.distance(lat, lng)) + "公尺";
    }
    //===========================    
}
