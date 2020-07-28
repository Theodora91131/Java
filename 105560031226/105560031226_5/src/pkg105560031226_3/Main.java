/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031226_3;

import java.util.ArrayList;
import java.util.List;

import com.abc.Commission;
import com.abc.AccumulatedCommission;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Commission> list = new ArrayList();

        // 加入幾個[累進傭金類別]物件
        list.add(new AccumulatedCommission("黃宜勻", 200055, 180000, 0.145));
        list.add(new AccumulatedCommission("陳霈蓁", 350500, 360000, 0.155));
        list.add(new AccumulatedCommission("賴孟穎", 180065, 200000, 0.138));
        list.add(new AccumulatedCommission("沈家佑", 415645, 350000, 0.135));        
        
        // 依序印出list內容
        list.forEach(s -> {
            System.out.println(s.toString());
        });
    }   
}