/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560030103_2;

import java.util.ArrayList;
import java.util.List;

import com.abc.Commission;
import com.abc.Sales;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Commission> list = new ArrayList();

        // 加入幾個[銷售員類別]物件
        list.add(new Sales("黃宜勻", 'A', 200055));
        list.add(new Sales("陳霈蓁", 'B', 350500));
        list.add(new Sales("賴孟穎", 'C', 120065));
        list.add(new Sales("沈家佑", 'D', 415645));         
        
        // 依序印出list內容
        for(Commission s : list){
            System.out.println(s.printInfo());
        }
    }   
}

