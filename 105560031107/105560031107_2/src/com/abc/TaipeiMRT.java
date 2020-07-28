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
        this.lat = lat;
        this.lng = lng;
    }

    public TaipeiMRT() {
        this.id = 0;
        this.name = null;
        this.line = null;
        this.lat = 0;
        this.lng = 0;
    }

    //=====================    
    public double distance(double toLat, double toLng) {
        final int R = 6371;

        double latDistance = Math.toRadians(toLat - this.lat);
        double lngDistance = Math.toRadians(toLng - this.lng);

        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(toLat)) * Math.cos(Math.toRadians(this.lat))
                * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double d = R * c;
        return d;
    }
}
