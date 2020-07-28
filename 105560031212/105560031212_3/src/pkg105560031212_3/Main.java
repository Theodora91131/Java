/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031212_3;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //----------------------------
        // 存放資料的List物件
        //----------------------------
        List<Integer> list = new ArrayList();

        //----------------------------
        // 將資料加入List物件,
        // int自動被包裝成Integer,
        // 稱為auto boxing.
        //----------------------------        
        list.add(75);
        list.add(87);
        list.add(65);
        list.add(92);
        list.add(97);
        list.add(55);
        list.add(70);
        list.add(76);
        list.add(86);
        list.add(68);

        //============================
        // 用new建立Comparator
        // 匿名物件.
        //============================ 
        Collections.sort(list,(x , y ) -> { return y - x;});

        //----------------------------
        // 輸出list內容
        //----------------------------          
        list.forEach(d -> {
            System.out.println(d);
        });
        //----------------------------          
    }    
}
