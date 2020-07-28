/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031226_3;

import java.util.ArrayList;
import java.util.List;

import com.abc.Commission;
import com.abc.LeveledCommission;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Commission> list = new ArrayList();

        // 加入幾個[績效傭金類別]物件
        list.add(new LeveledCommission("黃宜勻", 200055, 180000));
        list.add(new LeveledCommission("陳霈蓁", 350500, 360000));
        list.add(new LeveledCommission("賴孟穎", 180065, 200000));
        list.add(new LeveledCommission("沈家佑", 415645, 350000));        
        
        // 依序印出list內容
        list.forEach(s -> {
            System.out.println(s.toString());
        });
    }   
}