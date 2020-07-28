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
public class Score{
            //===================== 
            //成員
            //=====================      
            public String stuNo;
            public String stuName;    
            public String gender;
            public int chi;
            public int eng;
            public int stat;
            public int comp;
            public double tot;
            public double avg;
			
            //=====================  
            //方法(計算總分)
            //=====================    
            public double total(){
                 tot = chi + eng + stat + comp;
                 return tot;
            }  
			
            //=====================  
            //方法(計算平均)
            //=====================    
            public double average(){
               avg = total()/4.0;  
               return avg;
            }  	
}
