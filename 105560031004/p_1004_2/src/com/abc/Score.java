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
    static double total = 0;
    static double average1=0;
    //=====================
    //方法
    //=====================
    public double total(){
        total = chi * 2 + eng * 2 + stat * 1.5 + comp * 2.5;
        return total;
    }  
    public double everage(){
        average1 = total/8;
        return average1;
    }  
    public char rank(){
      char data;
      if (total > 500){
          return data = 'A';
      }
      else if(total <= 500 || total >= 400){
         return data = 'B'; 
      }
      else{
          return data = 'C';
      }         
    }   
}

