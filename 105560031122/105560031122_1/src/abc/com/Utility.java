/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc.com;

/**
 *
 * @author user
 */
public class Utility {
            //===================== 
            // 磅數轉公斤數
            // 傳入磅數, 
            // 回傳公斤數
            //=====================          
            public static double toKg(double lb){
                //內容自行完成   
                final double pound =0.45359237;
                double Kg = lb * pound;
                return Math.round(Kg*100)/100.0;
            }

            //===================== 
            // 公斤數轉磅數
            // 傳入公斤數, 
            // 回傳磅數
            //=====================          
            public static double toLb(double kg){
                //內容自行完成   
                final double pound =0.45359237;
                double lb = kg / pound;
                return Math.round(lb*100)/100.0;
                
            }
        }    
