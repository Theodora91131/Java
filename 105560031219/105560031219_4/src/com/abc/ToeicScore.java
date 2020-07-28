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
public class ToeicScore extends Score{
    //------------------------ 
    // 成員    
    //------------------------  
    private int toeic;  
    
    //------------------------ 
    // 建構元(1)
    //------------------------ 
    public ToeicScore(String stuNo, String stuName, int chi, int eng, int stat, int comp, int toeic){
        super(stuNo, stuName, chi, eng, stat, comp);
        this.toeic = toeic;        
    }
    
    //------------------------  
    // 建構元(2)    
    //------------------------  
    public ToeicScore(){
        super();
        this.toeic = 0;        
    }

    //------------------------ 
    // getters
    //------------------------ 
    public int getToeic(){return toeic;}
    
    //------------------------ 
    // setters
    //------------------------  
    public void setToeic(int toeic){this.toeic = toeic;}
    
    //------------------------    
    // 方法(原始總分+多益加分)    
    //------------------------
    @Override    
    public double total(){
        int bonus;
        
        if(toeic >= 900){
            bonus = 10;
        }else if(toeic>=750 && toeic < 900){
            bonus = 7;
        }else if(toeic >= 650 && toeic < 750){
            bonus = 5;
        }else if(toeic >= 550 && toeic < 650){
            bonus = 3;
        }else{
            bonus = 0;
        }
        
        return  super.total() + bonus;                 
    }         
 
    //=====================    
    // 方法(物件轉成字串)    
    //=====================     
    @Override    
    public String toString(){            
        return "學號:" + super.getStuNo() + ", 姓名:" + super.getStuName() + ", 國文:" + super.getChi() + ", 英文:" + super.getEng() + ", 統計:" + super.getStat() + ", 計概:" + super.getComp() + ", 多益:" + this.toeic + ", 原始總分:" + super.total() + ", 包括多益總分:" + this.total();   
    }    
    //=====================    
}

