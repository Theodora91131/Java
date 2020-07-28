/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031226_3;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

import com.abc.Commission;
import com.abc.RegularCommission;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Commission> list = new ArrayList();

        // 加入幾個[一般傭金類別]物件
        list.add(new RegularCommission("黃宜勻", 200055));
        list.add(new RegularCommission("陳霈蓁", 350500));
        list.add(new RegularCommission("賴孟穎", 180065));
        list.add(new RegularCommission("沈家佑", 415645));        
        
        // 依序印出list內容
        list.forEach(s -> {
            System.out.println(s.toString());
        });
    }   
}
