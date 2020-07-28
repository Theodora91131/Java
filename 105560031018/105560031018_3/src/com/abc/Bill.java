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
/**
 *
 * @author user
 */
public class Bill {
    //===================== 
    //成員
    //=====================      

    public String cusNo;
    public boolean isSummer;
    public int degree;

    //=====================  
    //建構元(1) 傳3個參數
    //=====================    
    public Bill(String cusNo, boolean isSummer, int degree) {
        this.cusNo = cusNo;
        this.isSummer = isSummer;
        this.degree = degree;
    }

    //=====================  
    //建構元(2) 傳0個參數
    //=====================    
    //=====================  
    //方法(計算電費)
    //=====================    
     public int fee1(int degree) {
         int n;
      if (this.isSummer == true) {
        return  n = (int) check2(degree);
       }else
        return  n = (int) check1(degree);  
      }

    public double check2(int k) {
        double fee = 0;
        if (k >= 1001) {
            fee = (k - 1000) * 6.71 + (1000 - 700) * 6.16 + (700 - 500) * 5.44 + (500 - 330) * 4.39 + (330 - 120) * 3.02 + 120 * 2.10;
        } else if (k >= 701 && k <= 1000) {
            fee = (k - 700) * 6.16 + (700 - 500) * 5.44 + (500 - 330) * 4.39 + (330 - 120) * 3.02 + 120 * 2.10;
        } else if (k >= 501 && k <= 700) {
            fee = (k - 500) * 5.44 + (500 - 330) * 4.39 + (330 - 120) * 3.02 + 120 * 2.10;
        } else if (k >= 331 && k <= 500) {
            fee = (k - 330) * 4.39 + (330 - 120) * 3.02 + 120 * 2.10;
        } else if (k >= 121 && k <= 330) {
            fee = (k - 120) * 3.02 + 120 * 2.10;
        } else if (k <= 120) {
            fee = k * 2.10;
        } 
        return fee = Math.floor(fee);
    }
    public double check1(int k) {
        double fee = 0;
        if (k >= 1001) {
            fee = (k - 1000) * 5.28 + (1000 - 700) * 5.03 + (700 - 500) * 4.48 + (500 - 330) * 3.61 + (330 - 120) * 3.68 + 120 * 2.10;
        } else if (k >= 701 && k <= 1000) {
            fee = (k - 700) * 6.16 + (700 - 500) * 5.44 + (500 - 330) * 4.39 + (330 - 120) * 3.02 + 120 * 2.10;
        } else if (k >= 501 && k <= 700) {
            fee = (k - 500) * 5.44 + (500 - 330) * 4.39 + (330 - 120) * 3.02 + 120 * 2.10;
        } else if (k >= 331 && k <= 500) {
            fee = (k - 330) * 4.39 + (330 - 120) * 3.02 + 120 * 2.10;
        } else if (k >= 121 && k <= 330) {
            fee = (k - 120) * 3.02 + 120 * 2.10;
        } else if (k <= 120) {
            fee = k * 2.10;
        } 
        return fee = Math.floor(fee);
    }
    //=====================  			
}
