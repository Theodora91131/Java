/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031227_1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.util.List;
import com.abc.Rental;
import com.abc.WarehouseRental;

public class Main {
    public static void main(String[] args) {
        // 設定日期格式      
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
        
        // 產生一個List
        List<Rental> list = new ArrayList();

        // 加入幾個[倉儲租用]物件        
        list.add(new WarehouseRental("倉儲租用類別", LocalDate.parse("2018-12-20", formatter), LocalDate.parse("2019-1-31", formatter), 50));
        list.add(new WarehouseRental("倉儲租用類別", LocalDate.parse("2018-12-20", formatter), LocalDate.parse("2019-2-20", formatter), 60));
        list.add(new WarehouseRental("倉儲租用類別", LocalDate.parse("2018-12-21", formatter), LocalDate.parse("2019-8-31", formatter), 80));
        
        // 依序印出[倉儲租用]資料
        list.forEach(s -> {
            System.out.println(s.toString());
        });
     }   
}