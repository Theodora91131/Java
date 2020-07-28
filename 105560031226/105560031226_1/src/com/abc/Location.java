/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;


//=====================================  
// 父親是一個抽象類別. 其中
// 包含一個輸出[提醒位置]的抽象方法.
//=====================================  
abstract public class Location {
    //------------------------------ 
    // 成員
    //------------------------------
    private String category;  //導航[提醒位置]的分類
    private double lat;       //該指示的緯度
    private double lng;       //該指示的經度

    //------------------------------
    // 建構元(1)
    //------------------------------ 
    public Location(String category, double lat, double lng){
        this.category = category;
        this.lat = lat;
        this.lng = lng;
    }    

    //------------------------------
    // 建構元(2)
    //------------------------------ 
    public Location(){
        this.category = null;
        this.lat = 0;
        this.lng = 0;    
    }
    
    //------------------------------
    // getters
    //------------------------------    
    public String getCategory(){return this.category;}
    public double getLat(){return this.lat;}
    public double getLng(){return this.lng;}
    
    //------------------------------
    // setters
    //------------------------------
    public void setCategory(String category){this.category = category;}
    public void setLat(double lat){this.lat = lat;}
    public void setLng(double lng){this.lng = lng;}    

    //------------------------------
    // 傳入目前座標, 計算[提醒位置]
    // 與目前座標的距離(公尺)
    //------------------------------  
    public double distance(double sourceLat, double sourceLng){
        final int R = 6371; 

        double latDistance = Math.toRadians(this.lat - sourceLat);
        double lngDistance = Math.toRadians(this.lng - sourceLng);

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                  + Math.cos(Math.toRadians(this.lat)) * Math.cos(Math.toRadians(sourceLat))
                  * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
           
        return R * c * 1000;       
    }

    //==============================  
    // 抽象方法: 輸出[提醒位置]
    //==============================  
    abstract public String description(double lat, double lng);
    //==============================  
}