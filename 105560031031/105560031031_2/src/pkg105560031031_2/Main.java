/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031031_2;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        //-----------------------------------------------------    
        // 宣告一個陣列, 名稱是data, 長度為由資料數量決定,
        // 內容為double. 陣列長度不可再更改.   
        //-----------------------------------------------------        
        double data[] = {76, 87, 55, 70, 90, 72, 45, 77, 85, 82, 90, 95, 65, 100, 30, 50, 70, 65};
        double count = 0;
        double tot = 0;
        double average;
        //----------------------------------------------      
        // 印出陣列長度
        //----------------------------------------------  
        System.out.println("陣列長度:" + data.length);
        //----------------------------------------------      
        // 依序取出data中的元素
        //----------------------------------------------       
        //(1)
        for (double d : data) {
            count += d;
        }
        average = count / data.length;
        System.out.println(average);
        //(2)
        count = 0;
         for (double d : data) {
             count = Math.pow((d - average),2);
             tot += count;
        }
        System.out.println(tot);
        //(3)
        count = 0;
         for (double d : data) {
          count = tot / (data.length - 1);
        }
        System.out.println(count);
        //(4)
        System.out.println(Math.sqrt(count));  
    }
}
