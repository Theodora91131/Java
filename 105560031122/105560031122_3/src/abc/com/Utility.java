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
            //======================== 
            // 靜態方法-計算成績
            // 傳入學生答案
            // 回傳成績
            //=====================          
            public static int score(String answer){
                //內容自行完成    
                String std = "ABBDACCDACBCDADAABCD";
                int score = 0;
                for(int i = 0; i<=answer.length()-1; i++){
                       if( std.charAt(i) == answer.charAt(i) ){
                           score += 5;
                       }
                }
                return score;
            }

            //======================== 
            // 靜態方法-計算配分成績
            // 傳入學生答案
            // 回傳成績
            //=====================          
            public static int weightedScore(String answer){
                //內容自行完成 
                 String std = "ABBDACCDACBCDADAABCD";
                int score = 0;
                int temp = 0;
                for(int i = 0; i<=answer.length()-1; i++){
                       if( std.charAt(i) == answer.charAt(i) && i <= 9){
                           score += 4;
                       }else if(std.charAt(i) == answer.charAt(i) && i > 9){
                           score += 6;
                       }
                }
                return score;
            }
        }    
