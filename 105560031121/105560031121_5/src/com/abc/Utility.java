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
    //======================== 
    // 靜態方法-密碼安全檢查
    // 傳入密碼, 
    // 回傳密碼安全評語
    //========================         

    public static String checkPassword(String pwd) {
        //內容自行完成   
        int eng = 0;
        int dig = 0;
        if (pwd.length() < 6) {
            return "不安全";
        } else {
            for (int i = 0; i <= pwd.length()-1; i++) {
                if ((pwd.charAt(i) >= 'A' && pwd.charAt(i) <= 'Z') && (pwd.charAt(i) >= 'a' && pwd.charAt(i) <= 'z')) {
                    eng += 1;
                } else if (Character.isDigit(pwd.charAt(i))) {
                    dig += 1;
                }
            }
        }
        if (eng == pwd.length() || dig == pwd.length()) {
            return "不安全";
        } else {
            return "安全";
        }
    }
}
