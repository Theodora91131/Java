/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031226_6;

import java.util.ArrayList;
import java.util.List;

import com.abc.Shipment;
import com.abc.GeneralShipment;
import com.abc.LongShipment;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Shipment> list = new ArrayList();

        // 加入幾個[一般貨運]物件
        list.add(new GeneralShipment(2.4, 1, "台中", 190));
        list.add(new GeneralShipment(3.6, 2, "台中", 180));
        list.add(new GeneralShipment(4.2, 1, "高雄", 335));
        list.add(new GeneralShipment(6.5, 2, "台南", 235));

        // 加入幾個[長途貨運]物件
        list.add(new LongShipment(2.4, 1, "高雄", 290));
        list.add(new LongShipment(3.6, 2, "屏東", 380));
        list.add(new LongShipment(4.2, 1, "高雄", 335));
        list.add(new LongShipment(6.5, 2, "屏東", 375));
        
        // 依序印出[一般貨運/長途貨運]資料
        for(Shipment s : list){
            System.out.println(s.toString());
        }
    }   
}