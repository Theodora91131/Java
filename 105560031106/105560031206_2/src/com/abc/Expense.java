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
public interface Expense {
            public String category();   //支出項目
            public String detail();     //支出說明
            public int total();         //支出金額
       }
