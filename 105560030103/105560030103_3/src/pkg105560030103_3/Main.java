/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560030103_3;

import java.util.ArrayList;
import java.util.List;

import com.abc.Shipment;
import com.abc.LongShipment;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<LongShipment> list = new ArrayList();
 
        // 加入幾個[長途運輸]物件
        list.add(new LongShipment(2.4, 1, "台中", 170, true));
        list.add(new LongShipment(3.6, 2, "台中", 180, false));
        list.add(new LongShipment(4.2, 1, "高雄", 335, true));
        list.add(new LongShipment(6.5, 2, "台南", 235, false));    
        
        // 依序印出list內容
        for(LongShipment s: list){
            System.out.println(s.toString());
        }
    }   
}