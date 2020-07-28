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
public class TaipeiMRT {
    //===================== 
    // 成員
    //=====================      

    public int id;
    public String name;
    public String line;
    public double lat;
    public double lng;

    //=====================  
    // 備註
    public TaipeiMRT(int id, String name, String line, double lat, double lng) {
        this.id = id;
        this.name = name;
        this.line = line;
        this.lat =lat;
        this.lng = lng;
    }

    //=====================    
     public String remark( ){
        if(this.line.equals("文山內湖線")){
            return "*";    
        }else if(this.line.equals("南港") || this.line.equals("板橋") || this.line.equals("土城線")){
            return "**";
        }else{
            return " ";
        }
    }  		 			
}
