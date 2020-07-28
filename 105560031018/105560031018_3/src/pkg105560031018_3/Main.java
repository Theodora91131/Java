/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031018_3;

/**
 *
 * @author user
 */
import java.io.*;
import com.abc.Bill;


class Main {
    public static void main(String[] args) throws IOException {
        // 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        //------------------------------------------      
        try{   
            // 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("electricityBill-1.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));
            
            // 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;            
            String line;     
            
            while ((line = br.readLine()) != null) {
                // 顯示讀入的資料
                System.out.println(line); 
                
                // 切割欄位內容
                String items[] = line.split(",");
                String cusNo = items[0].trim();
                boolean isSummer =  Boolean.parseBoolean(items[1].trim());
                int degree = Integer.parseInt(items[2].trim());
                
                // 將切割後的欄位(字串)存入不同型態變數中
                

                //=======================================================================  
                // (方法1) 產生成績物件, 並將資料透過建構元存入物件的成員中
                //=======================================================================                
                Bill bill = new Bill(cusNo, isSummer, degree);  
                //=======================================================================  
                
                //=======================================================================  
                // (方法2) 產生成績物件, 並將資料分別存入物件的成員中
                //=======================================================================                
                /*
                Score score = new Score();  
                
                score.stuNo = stuNo;
                score.stuName = stuName;
                score.gender = gender;
                score.chi = chi;
                score.eng = eng;
                score.stat = stat;
                score.comp = comp;
                */
                //=======================================================================                 
                
                // 產生將輸出的資料
                String data =cusNo + "," + bill.isSummer + "," + bill.degree + "," + bill.fee1(degree);

                // 將資料寫至檔案
                if(firstLine){
                    bw.write(data);
                    firstLine=false;
                }else{
                    bw.write(("\n"));
                    bw.write(data);                
                }                
            }                   
            //---------------------            
        }catch(IOException e){
            System.out.println("發生錯誤, 原因: " + e);                     
            return;
        }finally{
            // 關閉reader
            if(br != null){
                br.close();              
            }  
            
            // 關閉writer
            if(bw != null){
                bw.close();              
            }              
        }  
        //------------------------------------------         
    }    
}


