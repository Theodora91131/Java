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
            // 靜態方法-計算
            // 傳入身高及體重, 
            // 回傳bmi值
            
            //=====================          
            public static double bmi(double height, double weight){
                //內容自行完成    
                height = height/(float)100;
                double bmi1 = weight / (height * height);
                return bmi1;
            }

            //===================== 
            // 靜態方法(2)
            // 傳入身高及體重, 
            // 回傳bmi評語
            //===================== 
            public static String evaluation(double height, double weight){
                //內容自行完成   
                if(bmi(height,weight)<18.5){
                    return "體重過輕";
                }else if (18.5 <= bmi(height,weight) && bmi(height,weight) < 24){
                    return "體重正常";
                }else if (24 <= bmi(height,weight) && bmi(height,weight) < 27){
                    return "體重過重";
                } else if ( bmi(height,weight) > 27){
                    return "體重肥胖";
                }
                return "";
            }  
        }    
