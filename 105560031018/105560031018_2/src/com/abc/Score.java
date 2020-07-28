/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;
import java.time.LocalDate;
/**
 *
 * @author user
 */
public class Score{
            //===========================
            //成員
            //===========================     
            public LocalDate transDate;
            public String market;    
            public String name;
            public double highPrice;
            public double middlePrice;
            public double lowPrice;
            public double avgPrice;
            public double amount;			

            //=====================  
            //建構元(1) 傳8個參數
            //=====================    
	public Score( LocalDate transDate, String market, String name, double highPrice, double middlePrice,double lowPrice,double avgPrice, double amount){
            this.transDate = transDate;
            this.market = market;    
            this.name = name;
            this. highPrice = highPrice;
            this. middlePrice = middlePrice;
            this. lowPrice = lowPrice;
            this.avgPrice = avgPrice;
            this. amount = amount;
        }
        public Score(){
        this.transDate = null;
        this.market = null;
        this.name = null;
        this.highPrice = 0;
        this.middlePrice = 0;
        this.lowPrice = 0;
        this.avgPrice = 0;
        this.amount= 0;
    }
    

            //=====================  
            //建構元(2) 傳0個參數
            //=====================            
		
 
 
            //=====================  
            //方法 (計算交易金額)
            //=====================            
            public double total(){
               double data = this.avgPrice * this.amount;
               return data;
            }
            //=====================  			
        }
	
    
