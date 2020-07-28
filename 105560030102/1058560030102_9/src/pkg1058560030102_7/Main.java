/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1058560030102_7;

/**
 *
 * @author user
 */

import com.abc.MyThread;

public class Main {
    public static void main(String[] args) {
        //------------------------------
        // 生成並啟動執行緒物件
        //------------------------------
        new MyThread("https://www.mobile01.com/waypointtopiclist.php?f=189", "c:/out.txt").start();
        //------------------------------
    }    
}
