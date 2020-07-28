/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031121_2;

/**
 *
 * @author user
 */
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //-----------------------------------
        // 生成一個List物件, 
        // 其中放置的均為Integer型態的物件.
        //-----------------------------------        
        List<Integer> list = new ArrayList();

        //-----------------------------------
        // 將double資料存入Double物件內, 
        // 稱為boxing.
        //-----------------------------------         
        list.add(10);
        list.add(11);
        list.add(14);
        list.add(15);
        list.add(14);
        
        //-----------------------------------
        // 以迴圈處理list中的每個元素.
        // 將Integer內容取出, 計算後放入int,
        // 稱為unboxing.
        //-----------------------------------
        int tot = 0;
        
        for(Integer d : list){
            tot+=d;
        } 
        System.out.println(tot);
        //-----------------------------------        
    }    
}
