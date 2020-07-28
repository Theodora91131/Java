/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031213_1;
import java.util.List;
import java.util.ArrayList;
import com.abc.FishMarket;
import com.abc.Utility;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) throws Exception{
        //---------------------------------------------- 
        // 呼叫靜態方法讀入的資料, 存在data中
        //---------------------------------------------- 
        // 存放讀入的每行資料
        List<String> lines = Utility.readData("fishMarket.csv");
        
        // 存放待處理所有Score物件
        List<FishMarket> data = new ArrayList();
        
        // 逐行處理資料
        lines.forEach(line -> {
            // 顯示目前處理的資料
            System.out.println(line);
            
            //切割欄位            
            String items[] = line.split(",");
            int num = Integer.parseInt(items[0].trim());    
            String city = items[1].trim();
            String fish = items[2].trim();
            int year = Integer.parseInt(items[3].trim());               
            double value = Double.parseDouble(items[4].trim());    
            
            // 產生成績物件, 加入data中
            data.add(new FishMarket(num, city, fish, year, value));                       
        });  
        
        //********************************************************
        
        //********************************************************
       
      
        // 將Map中的物件加入output中   
         List<String> output = new ArrayList();                 
        Map<String, Integer> map = new TreeMap();

        // 累加[某個國文成績]的人數
        data.forEach(s -> {              
            Integer cnt = map.get(s.getFish());
            
            if(cnt == null){
                map.put(s.getFish(), 1);
            }else{
                cnt++;
                map.put(s.getFish(), cnt);            
            }    
        });                  
        
        // 累加總資料數
        double total = 0;
        
        Set<String> keys = map.keySet();
        for(String key: keys){
            total += map.get(key);
            total++;
        }

        // 將Map中的物件加入output中
      
        
      //設定小數數值輸出格式
        
        for(String key: keys){
            String str = "魚類" + key + ", 筆數: " + map.get(key);
            output.add(str);
        } 
        //--------------------------------------------
        // 呼叫靜態方法, 將output內資料寫到檔案中
        //--------------------------------------------  
        boolean flag = Utility.writeData("out.csv", output);
        
        if(flag){
            System.out.println("寫檔成功");
        }else{
            System.out.println("寫檔失敗");
        }
        //-------------------------------------------- 
    }    
}