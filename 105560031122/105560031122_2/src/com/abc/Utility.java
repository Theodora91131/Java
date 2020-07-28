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
public class Utility {
            //===================== 
            // 華氐轉攝氐
            // 傳入華氐溫度, 
            // 回傳攝氐溫度
            //=====================          
            public static double toCelsius(int f){
                //內容自行完成  
                double c;
                return Math.round((c = (f - 32) * 5 / 9.0)*10)/10.0;
            }

            //===================== 
            // 攝氐轉華氐
            // 傳入攝氐溫度, 
            // 回傳華氐溫度
            //=====================          
            public static double toFahrenheit(int c){
                //內容自行完成  
                double f;
                return Math.round((f = c * (9 / 5.0) + 32)*10)/10.0;
            } 
        }    
