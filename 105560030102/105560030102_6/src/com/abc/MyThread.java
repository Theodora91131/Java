/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

//=====================================  
// 父親是一個執行緒類別. 
// 改寫父親的run()方法.
//=====================================  
public class MyThread extends Thread{ 
    //------------------------------
    // 建構元(1)
    //------------------------------ 
    public MyThread(String name){
        super(name);
    }

    //------------------------------
    // 建構元(2)
    //------------------------------ 
    public MyThread(){
        super();
    }
    
    //==============================  
    // 改寫父親的run()方法
    //==============================      
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.print(super.getName());
        }
    }
    //==============================       
}