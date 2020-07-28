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
//=====================
// 海外員工繼承了員工    
//=====================   
public class OverseasEmployee extends Employee {

    private String country;  //外派國家

    //=====================    
    // 建構元(1)
    //=====================     
    public OverseasEmployee(String id, String name, String department, String rank, int overHours, String country) {
        super(id, name, department, rank, overHours);
       this.country = country;
    }

    //=====================    
    // 建構元(2)    
    //=====================       
    public OverseasEmployee() {
        super();
        this.country = null;
    }

    //=====================
    // getters
    //=====================       
    public String getCountry() {
        return this.country;
    }

    //=====================    
    // setters
    //=====================     
    public void setCountry(String country) {
        this.country = country;
    }

    //=====================    
    // 方法(薪水)    
    //===================== 
    public int a = 0;

    @Override
    public int salary() {
        if (country.equals("中國")) {
            a = 12000;
            return super.salary() + a;
        } else if (country.equals("美國")) {
            a = 21000;
            return super.salary() + a;
        } else if (country.equals("澳洲")) {
            a = 18000;
            return super.salary() + a;
        } else {
            a = 10000;
            return super.salary() + a;
        }
    }

    @Override
    public String toString() {
        //自行完成    
        return super.toString() +","+ "外派國家"+"," + country +","+ "補貼"+"," + a;
    }
    //===================== 
}
