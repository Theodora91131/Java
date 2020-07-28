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
        for(int i = 1; i <= 50; i++){
            String address = "https://mojim.com/twy105661x38x"+i+".htm";
            String name = "c:/out"+i+".txt";
            new MyThread(address, name).start();
        }
        //------------------------------
    }    
}
