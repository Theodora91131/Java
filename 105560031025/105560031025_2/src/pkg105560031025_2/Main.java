/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031025_2;

/**
 *
 * @author user
 */
import java.io.*;
import com.Bill;

class Main {
    public static void main(String[] args) throws IOException {
        // 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        //------------------------------------------      
        try{   
            // 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("electricityBill-3.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));
            
            // 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;            
            String line;     
            
            while ((line = br.readLine()) != null) { 
                // 顯示讀入的資料
                System.out.println(line); 
                
                //切割欄位內容
                String items[] = line.split(",");
                String cusNo = items[0].trim();
                int degree= Integer.parseInt(items[1].trim());             
                // 產生成績物件並將資料透過建構元放入物件中
                Bill bill = new Bill(cusNo, degree ); 
                
                // 將物件內容寫至檔案
                String data =bill.getCusNo() + "," + bill.getDegree() + "," + bill.fee(degree);
                
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
    

