/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031226_1;

import java.util.ArrayList;
import java.util.List;
import com.abc.*;

public class Main {
    public static void main(String[] args) {        
        // 建立一個空的List
        List<Location> list = new ArrayList();
        
        // 加入幾個Parking物件   
        list.add(new Parking("停車場", 25.043061, 121.526891, "台灣聯通-醒吾場", "杭州南路一段15-1號"));
        list.add(new Parking("停車場", 25.044024, 121.528185, "華山文創園區", "忠孝東路二段41-47號"));
        list.add(new Parking("停車場", 25.042367, 121.528571, "Times 24h", "齊東街82巷26號"));

        // 加入幾個Accident物件   
        list.add(new Accident("交通事故", 25.045856, 121.523618, "單線通車"));
        list.add(new Accident("交通事故", 25.052317, 121.533200, "雙線不通"));    
        
        // 目前位置
        double currentLat = 25.042945;
        double currentLng = 121.526870;
        
        // 印出list內容
        list.forEach(s -> {
           System.out.println(s.description(currentLat, currentLng)); 
        });
    }  
}