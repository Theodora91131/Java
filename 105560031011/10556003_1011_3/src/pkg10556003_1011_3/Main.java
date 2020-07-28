/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10556003_1011_3;

import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        //(1) 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        //------------------------------------------      
        try{   
            //(2) 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("D:\\scorse.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("D:\\out.csv")));
            
            //(3) 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;            
            String line;     
            
            while ((line = br.readLine()) != null) {            
                System.out.println(line);
                
                //切割欄位內容
                
                String items[] = line.split(",");
                
                String stuNo = items[0].trim();
                String gender = items[1].trim();
               // String stuName = items[1].trim();
               int sum = 0;
                int chi = Integer.parseInt(items[2].trim());
                int eng = Integer.parseInt(items[3].trim());
                int mat = Integer.parseInt(items[4].trim());
                int sco = Integer.parseInt(items[5].trim());
                int sci = Integer.parseInt(items[6].trim());
                int wri = Integer.parseInt(items[7].trim());
                sum = chi + eng + mat + sco + sci + wri+ sum;
                //顯示欄位內容
                System.out.println(stuNo);
               // System.out.println(stuName);
                System.out.println(chi);
                System.out.println(eng);
                System.out.println(mat);
                System.out.println(sco);
                System.out.println(sci);
                System.out.println(wri);
                 System.out.println(sum);
                System.out.println("-------------------------");   
                
                //將內容寫出檔案
                String data = stuNo  + "," + chi+ "," + eng+ "," + mat+ "," + sco+ "," + sci+ "," + wri;
                if(wri==12){
                    if(firstLine){
                         bw.write(data);
                         firstLine=false;
                    }else{
                        bw.write(("\n"));
                        bw.write(data);                
                    }
                }
            }                   
            //---------------------            
        }catch(IOException e){
            System.out.println("發生錯誤, 原因: " + e);                     
            return;
        }finally{
            //(4) 關閉reader
            if(br != null){
                br.close();              
            }  
            
            //(4) 關閉writer
            if(bw != null){
                bw.close();              
            }              
        }  
        //------------------------------------------         
    }    
}
