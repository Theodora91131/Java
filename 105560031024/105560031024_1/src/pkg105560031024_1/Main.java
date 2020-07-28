/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031024_1;

/**
 *
 * @author user
 */
import java.io.*;
import com.abc.Score;

class Main {
    public static void main(String[] args) throws IOException {
        // 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        //------------------------------------------      
        try{   
            // 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("exams.csv"))); 
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

                // 將切割後的欄位(字串)存入不同型態變數中
                String stuNo = items[0].trim();
                String stuName = items[1].trim();
                String gender = items[2].trim();
                int chi = Integer.parseInt(items[3].trim());
                int eng = Integer.parseInt(items[4].trim());                
                int stat = Integer.parseInt(items[5].trim());
                int comp = Integer.parseInt(items[6].trim());                
               // System.out.println(stuNo); 
                //=======================================================================  
                // (方法1) 產生成績物件, 並將資料透過建構元存入物件的成員中
                //======================================================================= 
                
                Score score = new Score(stuNo, stuName, gender, chi, eng, stat, comp);
                /*
                score.setStuNo(stuNo);
                score.setStuName(stuName);
                score.setGender(gender);
                score.setChi(chi);
                score.setEng(eng);
                score.setStat(stat);
                score.setComp(comp);
                */
                
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
                String data = score.getStuNo() + "," +  score.getStuName() + "," +  score.getGender() + "," +  score.getChi() + ","+score.getEng() + "," + score.getStat() + "," + score.getComp() + "," + score.total2(3,2.5,2.5,3);

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