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

//--------------------------------------
// 介面, 其方法內容由實作它的類別完成
//--------------------------------------
public interface Income {
    public String category();   //收入項目
    public String detail();     //收入說明
    public int total();         //收入金額
}
