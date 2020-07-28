/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031031_1;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
        //-----------------------------------------------------    
        // 宣告一個陣列, 名稱是data, 長度為5, 內容為字串.
        // 陣列長度設定後即不可再更改.   
        //-----------------------------------------------------        
        String data[] = new String[5];
        
        //-----------------------------------------------------   
        // 將String物件加入data中
        //-----------------------------------------------------      
        data[0]="data0";
        data[1]="data1";
        data[2]="data2";
        data[3]="資料3";
        data[4]="資料4";
        
        //----------------------------------------------      
        // 依序取出data中的字串
        //----------------------------------------------         
        for(String s : data){
            System.out.println(s);
        }
        for(String s : data){
            System.out.println(s.length()); 
        }
        for( int i =0; i< data.length; i++){
            System.out.println(data[i]);
        
        }
    }    
}



