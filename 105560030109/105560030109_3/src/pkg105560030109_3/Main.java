/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560030109_3;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

import com.abc.Sales;
import com.abc.SalesReturn;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Sales> list = new ArrayList();

        // 加入幾個[銷貨退回類別]物件
        list.add(new SalesReturn("1001", "黃宜勻", "A003", 2500, 30, 5));
        list.add(new SalesReturn("1002", "陳霈蓁", "A005", 3600, 50, 8));
        list.add(new SalesReturn("1003", "賴孟穎", "A002", 2650, 55, 2));
        list.add(new SalesReturn("1004", "沈家佑", "B001", 6425, 45, 10));         
        list.add(new SalesReturn("1005", "廖嘉倫", "B003", 7420, 80, 25));  
        
        // 依序印出list內容
        for(Sales s : list){
            System.out.println(s.toString());
        }
    }   
}