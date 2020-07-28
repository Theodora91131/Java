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
public class Score {
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
    public double tot = 0;
    public double avg;

    //=====================  
    //方法(計算總分)
    //=====================  
     public Score(){}
    public Score(int chi, int eng, int stat, int comp, String stuNo, String stuName,String gender ){
        this.chi = chi;
        this.eng = eng;
        this.stat = stat;
        this.comp = comp;
        this.stuNo =stuNo;
        this.stuName=stuName;
        this.gender=gender;
    }
    public double total() {
        tot = chi + eng + stat + comp;
        return tot;
    }

    //=====================  
    //方法(計算平均)
    //=====================    
    public double average() {
        avg = total() / 4.0;
        return avg;
    }

    public int rank() {
       return rankByScore(chi) + rankByScore(eng) + rankByScore(stat) + rankByScore(comp);
    }
    //===================== 
 

   

 private int rankByScore(int score) {
        int r = 0;
        if (score >= 90) {
            r = 5;
        } else if (score >= 80 && score < 90) {
            r = 4;
        } else if (score >= 70 && score < 80) {
            r = 3;
        } else if (score >= 60 && score < 70) {
            r = 2;
        } else if (score < 60) {
            r = 1;
        }
        return r;
    }

}
