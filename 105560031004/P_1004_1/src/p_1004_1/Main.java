/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p_1004_1;

/**
 *
 * @author user
 */
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        //(1) 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        double total = 0;
        double total2 = 0;
        //------------------------------------------      
        try{   
            //(2) 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("D://exams.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("D://out.csv")));
            
            //(3) 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;            
            String line;     
            
            while ((line = br.readLine()) != null) {            
                System.out.println(line);
                
                //切割欄位內容
                String items[] = line.split(",");
                
                String stuNo = items[0].trim();
                String stuName = items[1].trim();
                String gender = items[2].trim();
                int chi = Integer.parseInt(items[3].trim());
                int eng = Integer.parseInt(items[4].trim());
                int sta = Integer.parseInt(items[5].trim());
                int cal = Integer.parseInt(items[6].trim());
                //顯示欄位內容
                System.out.println(stuNo);
                System.out.println(stuName);
                System.out.println(gender);
                System.out.println(chi);
                System.out.println(eng);
                System.out.println(sta);
                System.out.println(cal);
                total = chi * 2 + eng * 2 + sta * 1.5 + cal * 2.5;
                System.out.println("-------------------------");   
 
                //將內容寫出檔案
                String data = stuNo + "," + stuName + "," + gender + "," + total;
                
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