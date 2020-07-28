/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560030102_2;

/**
 *
 * @author user
 */
import com.abc.MyThread;

public class Main {
    public static void main(String[] args) {
        //------------------------------
        // 生成2個執行緒物件
        //------------------------------
        MyThread t1 = new MyThread("小白");
        MyThread t2 = new MyThread("小黑");
        MyThread t3 = new MyThread("小灰");
 
        //------------------------------
        // 啟動執行緒物件
        //------------------------------
        t1.start();
        t2.start();
        t3.start();
        //------------------------------
    }    
}