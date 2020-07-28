/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class Score{
    //=====================
    // 成員    
    //=====================    
   private String stuNo;
   private String stuName;    
   private String gender;
   private int chi;
   private int eng;
   private int stat;
   private int comp;  
    
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
   
   //Setter
   public void setStuNo(String stuNo){this.stuNo = stuNo;}
   public void setStuName(String stuName){this.stuNo =stuName;}
   public void setGender(String gender){this.stuNo = gender;}
   public void setChi(int chi){this.chi = chi;}
   public void setEng(int eng){this.eng = eng;}
   public void setStat(int stat){this. stat =  stat;}
   public void setComp(int comp){this.comp =comp;}
   //Getter
   public String getStuNo(){return this.stuNo;}
   public String getStuName(){return this.stuName;}
   public String getGender(){return this.gender;}
   public int getChi(){return this.chi;}
   public int getEng(){return this.eng;}
   public int getStat(){return this.stat;}
   public int getComp(){return this.comp;}
//=====================    
    // 方法    
    //=====================    
 /*   public double total(){
        return  chi * 2 + eng * 2 + stat * 1.5 + comp * 2.5;                 
    }
*/
     public double total2(double chiW, double engW, double statW, double compW){
        return  chi * chiW + eng * engW + stat * statW + comp *compW;                 
    }    
    //=====================    
}