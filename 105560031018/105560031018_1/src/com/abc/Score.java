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
    // 成員    
    //=====================     
    public String stuNo;
    public String stuName;    
    public String gender;
    public int chi;
    public int eng;
    public int stat;
    public int comp;  
    
    //=====================     
    // 建構元(1)
    //=====================     
    public Score(String stuNo, String stuName, String gender, int chi, int eng, int stat, int comp){
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.gender = gender;
        this.chi = chi;
        this.eng = eng;
        this.stat = stat;
        this.comp = comp;        
    }
    
    //=====================     
    // 建構元(2)    
    //=====================     
    public Score(){
        this.stuNo = null;
        this.stuName = null;
        this.gender = null;
        this.chi = 0;
        this.eng = 0;
        this.stat = 0;
        this.comp = 0;
    }
    
    //=====================     
    // 方法    
    //=====================     
    public double total(){
        return  chi * 2 + eng * 2 + stat * 1.5 + comp * 2.5;                 
    }    
    //=====================    
    
    public int remark(){
        int j = 0;
        if (this.chi >= 80){
            j++;
        }
        if(this.eng >= 80){
            j++;
        }
        if(this.stat >= 80){
            j++;
        }
        if(this.comp >= 80){
            j++;
        }
        return j;
    }
}


