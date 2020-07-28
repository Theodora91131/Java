/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

/**
 *
 * @author user
 */


import java.util.List;

public class Utility {
    //==================================================
    // 一個計算平均的靜態方法
    // 傳入: List<Double>
    // 回傳: double
    //==================================================    
    public static double average(List<Double> list){
        double tot = 0;
        
        for(Double d : list){
            tot += d;
        }            
            
        return tot / list.size();      
    }

    
    //==================================================
    // 一個計算母體標準差的靜態方法
    // 傳入: List<Double>
    // 回傳: double
    //================================================== 
    public static double stdDev(List<Double> list){
        double avg = Utility.average(list);        
        double tot = 0;
            
        for(Double d : list){
            tot += Math.pow((d - avg), 2);
        }            
            
        return Math.sqrt(tot / list.size());
    }
    //==================================================    
}
