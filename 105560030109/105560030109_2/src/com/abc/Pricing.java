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
public interface Pricing {
    public int price();                   //一般定價
    public int price(double profitRate);  //指定利潤率定價(傳入:利潤率)
    public String printInfo();            //輸出
}
