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
public class Passenger {
    //===================== 
    // 成員
    //=====================          

    private int num;
    private int rank;
    private int survived;
    private String firstName;
    private String lastName;
    private String gender;
    private String boarding;

    //=====================  
    // 建構元(1) 傳7個參數
    //===================== 
    public Passenger(int num, int rank, int survived, String firstName, String lastName, String gender, String boarding) {
        this.num = num;
        this.rank = rank;
        this.survived = survived;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.boarding = boarding;
    }

    //=====================  
    // 建構元(2) 傳0個參數
    //=====================
    public Passenger() {
    }

    //=====================  
    // getters
    //=====================          
    public int getNum() {
        return  num;
    }

    public int getRank() {
        return rank;
    }

    public int getSurvived() {
        return survived;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }
    public String getBoarding() {
        return boarding;
    }
    //=====================    
    // setters
    //=====================    
    public void setStuNo(int num) {
        this.num = num;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public void setEng(String firstName) {
        this.firstName = firstName;
    }

    public void setStat(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setBoarding(String boarding) {
        this.boarding = boarding;
    }
    //=====================  
    // setters
    //=====================           

}
