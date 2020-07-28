/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031220_5;

import java.util.ArrayList;
import java.util.List;

import com.abc.Shipment;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Shipment> list = new ArrayList();

        // 加入幾個[運輸]物件
        list.add(new Shipment(2.4, 1, "台中", 170));
        list.add(new Shipment(2.4, 1, "台中", 180));
        list.add(new Shipment(3.5, 1, "高雄", 310));
        list.add(new Shipment(3.5, 1, "高雄", 295));
        list.add(new Shipment(6.5, 2, "台南", 240));
        
        // 依序印出[運輸]資料
        list.forEach(s ->{
            System.out.println(s.toString());
        });
    }   
}