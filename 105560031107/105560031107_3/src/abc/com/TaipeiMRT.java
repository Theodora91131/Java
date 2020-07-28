/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.com;

/**
 *
 * @author user
 */
public class TaipeiMRT {

    //===================== 
    // 成員
    //=====================     
    private int id;
    private String name;
    private String line;
    private double lat;
    private double lng;

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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLine() {
        return line;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    //=====================    
    // setters
    //=====================    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
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

    public int minutes(double toLat, double toLng) {
        return (int) Math.floor(distance(toLat, toLng) / 4 * 60);
    }

    public int minutes(double toLat, double toLng, String type) {
        double n, p;
        double m = distance(toLat, toLng);
        if (type.equals("UBike")) {
            n = (m / 8) * 60;
            p = Math.floor(n);
            return (int) p;
        } else if (type.equals("Taxi")) {
            n = (m / 40) * 60;
            p = Math.floor(n);
            return (int) p;
        } else {
            return -999;
        }
    }
}
