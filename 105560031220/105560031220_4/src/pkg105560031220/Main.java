/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031220;

import java.util.ArrayList;
import java.util.List;
import com.abc.Sales;
import com.abc.PersonalSales;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Sales> list = new ArrayList();

        // 加入幾個[銷售]物件
        list.add(new Sales("20181220001", "立燈", 4300, 35, 15000));
        list.add(new Sales("20181220002", "側桌", 9500, 30, 24500));
        list.add(new Sales("20181220003", "方几", 6350, 35, 18950));
        list.add(new Sales("20181220004", "展示櫃", 19500, 12, 32000));
        list.add(new Sales("20181220005", "單人椅", 5650, 15, 9950));

        // 加入幾個[折扣銷售]物件
        list.add(new PersonalSales("20181220012", "方几", 6350, 1, 650, false, 3));
        list.add(new PersonalSales("20181220013", "鞋櫃", 13500, 1, 820, true, 4));
        list.add(new PersonalSales("20181220014", "化妝台", 21200, 1, 860, false, 4));        
        
        // 依序印出[銷售/折扣銷售]資料
        list.forEach(s ->{
            System.out.println(s.toString());
        });
    }   
}