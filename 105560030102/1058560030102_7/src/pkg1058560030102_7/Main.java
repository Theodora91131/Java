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
        new MyThread("https://www.hinet.net/", "c:/out.html").start();
        new MyThread("https://docs.oracle.com/javase/8/docs/api/java/util/Dictionary.html", "c:/out1.html").start();
        new MyThread("https://www.baidu.com/", "c:/out2.html").start();
        //------------------------------
    }    
}
