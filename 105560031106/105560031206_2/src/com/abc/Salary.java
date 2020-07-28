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
import java.time.LocalDate;

public class Salary implements Expense {
    //======================== 
    // 成員
    //======================== 

    private LocalDate date;    //發薪日
    private String employee;   //員工姓名
    private char rank;         //職等, 分為A, B, C三種
    private int overHours;     //加班時數

    //========================   
    // 建構元(1) 傳4個參數
    //========================  
    public Salary(LocalDate date, String employee, char rank, int overHours) {
        //======================== 
        // 成員
        //======================== 
        this.date = date;    //發薪日
        this.employee = employee;   //員工姓名
        this.rank = rank;         //職等, 分為A, B, C三種
        this.overHours = overHours;
    }
    //======================== 
    // 建構元(2) 傳0個參數
    //======================== 

    public Salary() {
    }

    //======================== 
    // Setters
    //======================== 
    public void setlDate(LocalDate date) {
        this.date = date;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public void setRank(char rank) {
        this.rank = rank;
    }

    public void setOverHours(int overHours) {
        this.overHours = overHours;
    }

    //========================  
    // Getters
    //======================== 
    public LocalDate getDate() {
        return this.date;
    }

    public String getEmployee() {
        return this.employee;
    }

    public char getRank() {
        return this.rank;
    }

    public int getOverHours() {
        return this.overHours;
    }

    //======================== 
    // 完成介面的抽象方法(1)
    //========================    
    @Override
    public String category() {
        return "薪水支出";
    }

    //======================== 
    // 完成介面的抽象方法(2)
    //======================== 
    @Override
    public String detail() {
        return this.date + "發薪,員工" + this.employee + ",職等" + this.rank + ",加班" + this.overHours + "小時";
    }

    //======================== 
    // 完成介面的抽象方法(3)
    //======================== 
    @Override
    public int total() {
        if (this.rank == 'A') {
            return 60000 + (300 * this.overHours);
        } else if (this.rank == 'B') {
            return 50000 + (200 * this.overHours);
        } else if (this.rank == 'C') {
            return 35000 + (150 * this.overHours);
        }
        return 0;
    }
    //======================== 
}
