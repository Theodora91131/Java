/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031212_2;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //----------------------------
        // 存放資料的List物件
        //----------------------------
        List<Double> list = new ArrayList();

        //----------------------------
        // 將資料加入List物件,
        // int自動被包裝成Integer,
        // 稱為auto boxing.
        //----------------------------        
        list.add(75.2);
        list.add(87.3);
        list.add(65.4);
        list.add(92.9);
        list.add(97.1);
        list.add(55.4);
        list.add(70.0);
        list.add(76.0);
        list.add(86.0);
        list.add(68.0);
        list.add(180.5);
        //----------------------------
        // 用Collections的靜態方法
        // sort()排序.
        //----------------------------  
        Collections.sort(list);

        //----------------------------
        // 輸出list內容
        //----------------------------          
        list.forEach(d -> {
            System.out.println(d);
            System.out.println(d.getClass());
        });
        //----------------------------          
    }    
}

