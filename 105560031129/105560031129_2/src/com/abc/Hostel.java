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
public class Hostel {
    //============================================
    // 成員
    //============================================    

    private int id;
    private String name;
    private String tel;
    private String fax;
    private String address;
    private double lat;
    private double lng;
    private int regularPrice;
    private int holidayPrice;
    private int room;

    //============================================
    // 建構元(1) 傳10個參數
    //============================================
    public Hostel(int id, String name, String tel, String fax, String address, double lat, double lng, int regularPrice, int holidayPrice, int room) {
        this.id = id;
        this.name = name;
        this.tel = tel;
        this.fax = fax;
        this.address = address;
        this.lat = lat;
        this.lng = lng;
        this.regularPrice = regularPrice;
        this.holidayPrice = holidayPrice;
        this.room = room;
    }

    //============================================
    // 建構元(2) 傳0個參數
    //============================================
    public Hostel() {
        this.id = 0;
        this.name = null;
        this.tel = null;
        this.fax = null;
        this.address = null;
        this.lat = 0;
        this.lng = 0;
        this.regularPrice = 0;
        this.holidayPrice = 0;
        this.room = 0;
    }

    //============================================
    // getters
    //============================================
 public int getId(){return id;}
 public String getName(){return name;}    
 public String getTel(){return tel;}
 public String getFax(){return fax;}
 public String getAddress(){return address;}
 public double getLat(){return lat;} 
 public double getLng(){return lng;} 
 public int getregularPrice(){return regularPrice;} 
 public int getHolidayPrice(){return holidayPrice;} 
public int getRoom(){return room;} 
    
    //============================================
    // setters
    //============================================
 public void setId(int id){this.id = id;}
 public void setName(String name){this.name =name;}
 public void setTel(String tel){this.tel = tel;}
 public void setFax(String fax){this.fax = fax;}
 public void setAddress(String address){this.address = address;}
 public void setLat(double lat){this.lat = lat;}   
 public void setLng(double lng){this.lng = lng;}   
 public void setRegularPrice(int regularPrice){this.regularPrice = regularPrice;} 
 public void setHolidayPrice(int holidayPrice){this.holidayPrice = holidayPrice;} 
 public void setRoom(int room){this.room = room;} 
}


