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
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
public class Logs {
    //===================== 
    //成員
    //=====================      

    private int serNo;
    private LocalDateTime start;
    private LocalDateTime end;

    //=====================  
    //建構元(1) 傳3個參數
    //=====================   
    public Logs(int serNo, LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.serNo = serNo;
        this.end = end;
    }

    //=====================  
    //建構元(2) 傳0個參數
    //=====================    
    public Logs() {
    }

    //=====================  
    //=====================
    // getters
    //=====================    
    public int getSerNo() {
        return serNo;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    //=====================    
    // setters
    //=====================    
    public void setSerNo(int serNo) {
        this.serNo = serNo;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
        //方法(計算通話費)
    //=====================    
     public double fee(){
      
         // 計算兩個日期時間之間的秒數          
               long seconds = ChronoUnit.SECONDS.between(start, end);
               double cfee = seconds * 0.06;
               return cfee;
    }
    //=====================
}
