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
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Score extends Object{
    //=====================
    // 成員    
    //=====================    
    private String stuNo;
    private String stuName;    
    private int chi;
    private int eng;
    private int stat;
    private int comp;  
    
    //=====================    
    // 建構元(1)
    //=====================    
    public Score(String stuNo, String stuName, int chi, int eng, int stat, int comp){
        this.stuNo = stuNo;
        this.stuName = stuName;
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
        this.chi = 0;
        this.eng = 0;
        this.stat = 0;
        this.comp = 0;        
    }

    //=====================
    // getters
    //=====================    
    public String getStuNo(){return stuNo;}
    public String getStuName(){return stuName;}    
    public int getChi(){return chi;}
    public int getEng(){return eng;}
    public int getStat(){return stat;}
    public int getComp(){return comp;}
    
    //=====================    
    // setters
    //=====================    
    public void setStuNo(String stuNo){this.stuNo = stuNo;}
    public void setStuName(String stuName){this.stuName = stuName;}
    public void setChi(int chi){this.chi = chi;}
    public void setEng(int eng){this.eng = eng;}
    public void setStat(int stat){this.stat = stat;}
    public void setComp(int comp){this.comp = comp;}
    
    //=====================    
    // 方法(總分)    
    //=====================    
    public double total(){
        DecimalFormat df = new DecimalFormat("###.##");
        df.setRoundingMode(RoundingMode.HALF_UP);  //四捨五入
        //df.setRoundingMode(RoundingMode.CEILING);  //無條件進位
        //df.setRoundingMode(RoundingMode.FLOOR);    //無條件捨去
        
        return  Double.parseDouble(df.format(chi * 2 + eng * 2 + stat * 1.5 + comp * 2.5));                 
    }   
    
    //=====================    
    // 方法(平均)    
    //=====================    
    public double average(){
        DecimalFormat df = new DecimalFormat("###.##");
        df.setRoundingMode(RoundingMode.HALF_UP);  //四捨五入
        //df.setRoundingMode(RoundingMode.CEILING);  //無條件進位
        //df.setRoundingMode(RoundingMode.FLOOR);    //無條件捨去

        return  Double.parseDouble(df.format(total() / 8));           
    }     
    //=====================    
    
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        return "學號:" + this.stuNo + ", 姓名:" + this.stuName + ", 總分:" + this.total() +  ", 平均:" + this.average();                 
    }     
    //=====================      
}