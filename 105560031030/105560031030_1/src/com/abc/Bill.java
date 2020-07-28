/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

/**
 *
 * @author User
 */
public class Bill {
    //===================== 
    //成員
    //=====================      

    public String cusNo;
    public boolean isBusiness;
    public boolean isSummer;
    public int degree;

    //=====================  
    //建構元(1) 傳4個參數
    //=====================    
    public Bill(String cusNo, boolean isBusiness, boolean isSummer, int degree) {
        this.cusNo = cusNo;
        this.isBusiness = isBusiness;
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
        if (this.isBusiness == true) {
            if (this.isSummer == true) {
                return n = (int) check3(degree);
            } else if (this.isSummer == false) {
                return n = (int) check4(degree);
            }
        } else if (this.isBusiness == false) {
            if (this.isSummer == true) {
                return n = (int) check2(degree);
            } else if (this.isSummer == false) {
                return n = (int) check1(degree);
            }
        }
        return n = 0;
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

    public double check3(int k) {
        double fee = 0;
        if (k >= 1501) {
            fee = (k - 1000) * 6.73 + (1500 - 700) * 5.48 + (700 - 330) * 4.62 + 330 * 3.76;
        } else if (k >= 701 && k <= 1500) {
            fee = (k - 700) * 5.48 + (700 - 330) * 4.62 + 330 * 3.76;
        } else if (k >= 331 && k <= 700) {
            fee = (k - 330) * 4.62 + 330 * 3.76;
        } else if (k <= 330) {
            fee = k * 3.76;
        }
        return fee = Math.floor(fee);
    }

    public double check4(int k) {
        double fee = 0;
        if (k >= 1501) {
            fee = (k - 1000) * 5.31 + (1500 - 700) * 4.31 + (700 - 330) * 3.68 + 330 * 3.02;
        } else if (k >= 701 && k <= 1500) {
            fee = (k - 700) * 4.31 + (700 - 330) * 3.68 + 330 * 3.02;
        } else if (k >= 331 && k <= 700) {
            fee = (k - 330) * 3.68 + 330 * 3.02;
        } else if (k <= 330) {
            fee = k * 3.02;
        }
        return fee = Math.floor(fee);
    }
    //=====================  			
}
