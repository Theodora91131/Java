/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;
import java.util.ArrayList;
import java.util.List;


public class Utility {
    //===================== 
    // 反轉List內容的順序
    // 傳入List, 
    // 回傳反轉後的List
    //=====================          

    public static List<Integer> reverse(List<Integer> list) {
        //內容自行完成  
         List<Integer> list2 = new ArrayList();
        for (int i = list.size() - 1; i >= 0; i--) {   
          list2.add(list.get(i));
        }
        return list2;
    }
}
