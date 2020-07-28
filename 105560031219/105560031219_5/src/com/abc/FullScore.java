/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class FullScore extends Score{
    //=====================    
    // 建構元(1)
    //=====================    
    public FullScore(String stuNo, String stuName, int chi, int eng, int stat, int comp){        
        super(stuNo, stuName, chi, eng, stat, comp);  //呼叫父親的建構元
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public FullScore(){
        super();  //呼叫父親的建構元   
    }    
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        return "學號:" + super.getStuNo() + ", 姓名:" + super.getStuName() + ", 國文:" + super.getChi() + ", 英文:" + super.getEng() + ", 統計:" + super.getStat() + ", 計概:" + super.getComp() + ", 總分:" + super.total() +  ", 平均:" + super.average();                 
    }     
    //=====================     
}