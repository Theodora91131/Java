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
    // 靜態方法-標註比對結果
    // 傳入學生答案
    // 回傳比對結果
    //=====================          

    public static String remark(String answer) {
        //內容自行完成   
        String std = "ABBDACCDACBCDADAABCD";
        String rm = " ";
        for (int i = 0; i <= answer.length() - 1; i++) {
            if(std.charAt(i)==answer.charAt(i)){
                 rm += ".";
            }else{
                 rm += "*";
            }
        }
        return rm;
    }

}
