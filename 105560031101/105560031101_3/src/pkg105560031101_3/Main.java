/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031101_3;

/**
 *
 * @author user
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import com.abc.Iris;

class Main {    
    public static void main(String[] args) throws IOException {
        //-------------------------------------------------
        // 宣告一個data儲存所有成績物件
        //-------------------------------------------------      
        List<Iris> data = new ArrayList<>();
       
        // 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;        
   
        try{   
            // 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("iris.csv"))); 
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));            
      
            // 逐行讀入檔案內容, 加入list中          
            String line;                 
            
            while ((line = br.readLine()) != null) {    
                // 顯示輸入資料
                System.out.println(line);  
                
                // 切割欄位內容
                String items[] = line.split(",");
                
                double  sepalLength = Double.parseDouble(items[0].trim());
                double  sepalWidth = Double.parseDouble(items[1].trim());
                double petalLength = Double.parseDouble(items[2].trim());
                double petalWidth = Double.parseDouble(items[3].trim());
                String species = items[4].trim();          
                             
               
                // 產生一個成績物件並將資料透過建構元放入其中
                Iris iris= new Iris( sepalLength, sepalWidth, petalLength, petalWidth, species);
                
                // 將成績物件加入data中
                data.add(iris);                                 
            }                                                    
            
            //-------------------------------------------------
            // 從data計算國文成績的平均成績及標準差(篩選條件)
            //-------------------------------------------------
           double avgSepalLength;
           double totSepalLength = 0;
            for(Iris s : data){
                totSepalLength += s.getSepalLength();
            }            
            
            avgSepalLength =  totSepalLength / data.size(); 
            boolean firstLine = true;                 
            
            for(Iris s : data){               
                if(s.getSepalLength() >= avgSepalLength){
                    String str = s.getSepalLength() + "," + s.getSepalWidth() + "," + s.getPetalLength() + "," + s.getPetalWidth() + "," + s.getSpecies() ;
                
                    if(firstLine){
                        bw.write(str);
                        firstLine=false;
                    }else{
                        bw.write(("\n"));
                        bw.write(str);                
                    }                        
                }   
            }
            //-------------------------------------------------          
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
    }    
}
