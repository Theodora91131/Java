/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class PrintScore extends Score{
    //=====================    
    // 建構元(1)
    //=====================    
    public PrintScore(String stuNo, String stuName, int chi, int eng, int stat, int comp){        
        super(stuNo, stuName, chi, eng, stat, comp);  //呼叫父親的建構元
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public PrintScore(){
        super();  //呼叫父親的建構元   
    }    

    //=====================    
    // 方法(格式化總分)    
    //=====================    
    public String formattedTotal(){
        DecimalFormat df = new DecimalFormat("##0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);  //四捨五入
        //df.setRoundingMode(RoundingMode.CEILING);  //無條件進位
        //df.setRoundingMode(RoundingMode.FLOOR);    //無條件捨去
        
        return  df.format(super.total());                 
    }   
    
    //=====================    
    // 方法(格式化平均)    
    //=====================    
    public String formattedAverage(){
        DecimalFormat df = new DecimalFormat("##0.00");
        df.setRoundingMode(RoundingMode.HALF_UP);  //四捨五入
        //df.setRoundingMode(RoundingMode.CEILING);  //無條件進位
        //df.setRoundingMode(RoundingMode.FLOOR);    //無條件捨去

        return  df.format(super.average());           
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        return "學號:" + super.getStuNo() + ", 姓名:" + super.getStuName() + ", 國文:" + super.getChi() + ", 英文:" + super.getEng() + ", 統計:" + super.getStat() + ", 計概:" + super.getComp() + ", 總分:" + this.formattedTotal() +  ", 平均:" + this.formattedAverage();                 
    }     
    //=====================     
}
