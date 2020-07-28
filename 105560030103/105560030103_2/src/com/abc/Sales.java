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
public class Sales implements Commission {
    //------------------------------   
    // 成員    
    //------------------------------ 
    private String name;       //銷售員姓名
    private char rank;         //職等
    private int performance;   //業績
    
    //------------------------------    
    // 建構元(1)
    //------------------------------       
    public Sales(String name, char rank, int performance){
        this.name = name;
        this.rank = rank;
        this.performance = performance;
    }
    
    //------------------------------    
    // 建構元(2)    
    //------------------------------      
    public Sales(){
        this.name = null;
        this.rank = '\u0000';
        this.performance = 0;
    }
    
    //------------------------------  
    // getters
    //------------------------------        
    public String getName(){return this.name;}
    public char getRank(){return this.rank;}
    public int getPerformance(){return this.performance;}

    //------------------------------  
    // setters
    //------------------------------ 
    public void setName(String name){this.name = name;}
    public void setRank(char rank){this.rank = rank;}
    public void setPerformance(int performance){this.performance = performance;}

    //===============================    
    // 方法:傭金    
    //===============================  
    @Override
    public int commission(){
        //自行完成
        if(this.performance  >= 400000){
            return (int)Math.ceil(fee() + (this.performance * 0.25));
        }else if (this.performance >= 300000 && this.performance < 400000){
             return (int)Math.ceil(fee() + (this.performance * 0.2));
        }else if (this.performance >= 150000 && this.performance < 300000){
             return (int)Math.ceil(fee() + (this.performance * 0.16));
        }else{
            return (int)Math.ceil(fee() + (this.performance *0.06));
        }
    }   
    public int fee(){
        switch (this.rank) {
            case 'A':
                return 28000;
            case 'B':
                return 24000;
            case 'C':
                return 20000;
            case 'D':
                return 16000;
            default:
                break;
        }
        return 0;
       
    }
    //===============================    
    // 方法:薪水單    
    //===============================  
    @Override
    public String printInfo(){
        //自行完成
        return "銷售員姓名:" + this.name + ", 職等:" + this.rank + ", 業績:" + this.performance + "元, 傭金:" + this.commission() + "元";
    }   
    //===============================     
}