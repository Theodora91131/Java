/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

public class PersonalSales extends Sales {
    //=====================    
    // 成員
    //===================== 
    private boolean hasElevator; //是否有電梯
    private int floor;           //樓層
    
    //=====================    
    // 建構元(1)
    //=====================    
    public PersonalSales(String no, String product, int price, int amount, int shipment, boolean hasElevator, int floor){
        //自行完成
        super(no,product,price,amount,shipment);
        this.floor = floor;
        this.hasElevator = hasElevator;
    }
    
    //=====================    
    // 建構元(2)    
    //=====================    
    public PersonalSales(){
        //自行完成
        super();
        this.floor = 0;
        this.hasElevator = false;
    }
    
    //=====================    
    // getter
    //===================== 
    //自行完成    
    public boolean getHasElevator (){return this.hasElevator;}
    public int getFloor (){return this.floor;}
    //=====================    
    // setter
    //=====================     
    //自行完成    
    public void setHasElevator (boolean hasElevator){this.hasElevator = hasElevator;}
    public void setFloor (int floor){this.floor = floor;}
    //=====================    
    // 改寫父親的方法(總額)    
    //=====================  
    public int floorship(int floor){
        return 300 * (this.floor - 1);
    }
    
    @Override    
    public int total(){
        //自行完成
        if (this.hasElevator == true){
            return super.total();
        }else{
            return super.total() + this.floorship(floor);
        }
        
    }     
    
    //=====================    
    // 改寫父親的方法    
    //=====================    
    @Override
    public String toString(){
        //自行完成
        return  "編號" + super.getNo() + "," + "品名" + "," + super.getProduct() +  "," + "數量"+ super.getPrice() + "運費" + super.getShipment()+"樓層搬運費" + this.floorship(floor) + "總額" +this.total();
    }     
    //=====================      
}