/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031107_3;

/**
 *
 * @author user
 */
import java.io.*;
import abc.com.TaipeiMRT;

class Main {
    public static void main(String[] args) throws IOException {
        // 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        //------------------------------------------      
        try{   
            // 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("TaipeiMRT.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));
            
            // 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;            
            String line2;     
            
            while ((line2 = br.readLine()) != null) {
                // 顯示讀入的資料
                System.out.println(line2); 
                
                // 切割欄位內容
                String items[] = line2.split(",");
                
                // 將切割後的欄位(字串)存入不同型態變數中
                int id = Integer.parseInt(items[0].trim());
                String name = items[1].trim();                
                String line= items[2].trim();
                double lat = Double.parseDouble(items[3].trim());                
                double lng = Double.parseDouble(items[4].trim());    
                //=======================================================================  
                // (方法1) 產生成績物件, 並將資料透過建構元存入物件的成員中
                //=======================================================================                
                TaipeiMRT taipeiMRT = new TaipeiMRT(id,name,line,lat,lng);  
                //=======================================================================  
                
                          
                
                // 產生將輸出的資料
                String data = taipeiMRT.getId() + "," + taipeiMRT.getName() + "," + taipeiMRT.getLine() + "," + taipeiMRT.getLat() + "," + taipeiMRT.getLng() + "," + taipeiMRT. distance(25.043268,121.525279)+ "," + taipeiMRT. minutes(25.043268,121.525279) + "," + taipeiMRT.minutes(25.043268,121.525279,"UBike")+ "," + taipeiMRT.minutes(25.043268,121.525279,"Taxi");
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

