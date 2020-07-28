/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031212_4;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import com.abc.Iris;
import com.abc.Utility;

class Main {
    public static void main(String[] args) throws Exception{
        //========================================================
        // 呼叫靜態方法讀入的資料, 存在data中
        //========================================================
        // 存放讀入的每行資料
        List<String> lines = Utility.readData("iris.csv");
        
        // 存放待處理所有Score物件
        List<Iris> data = new ArrayList();
        
        // 逐行處理資料
        lines.forEach(line -> {
            // 顯示目前處理的資料
            System.out.println(line);
            
            //切割欄位            
            String items[] = line.split(",");
                
            double sepalLength = Double.parseDouble(items[0].trim());
            double sepalWidth = Double.parseDouble(items[1].trim());
            double petalLength = Double.parseDouble(items[2].trim());
            double petalWidth = Double.parseDouble(items[3].trim());
            String species = items[4].trim();
            // 產生成績物件, 加入data中
            data.add(new Iris(sepalLength, sepalWidth,petalLength, petalWidth, species));                       
        });  
        
        //========================================================
        // 排序data, 以[總分]由大到小排序
        //========================================================           
        Collections.sort(data, (x, y) -> {
            return (int)(y.getSepalLength()*1000 - x.getSepalLength()*1000);
        });
        
        //---------------------------------------------- 
        // 將data中的物件篩選加入output中(本例無篩選)
        //----------------------------------------------        
        List<String> output = new ArrayList();                 
            
        data.forEach(s -> {                  
            String str = s.getSepalLength() + "," + s. getSepalWidth() + "," + s.getPetalLength() + "," + s.getPetalWidth() + "," + s.getSpecies(); 
            output.add(str);
        });        
        
        //========================================================
        // 呼叫靜態方法, 將output內資料寫到檔案中
        //========================================================       
        boolean flag = Utility.writeData("out.csv", output);
        
        if(flag){
            System.out.println("寫檔成功");
        }else{
            System.out.println("寫檔失敗");
        }
        //========================================================        
    }    
}

