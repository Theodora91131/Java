/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031213_1;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.TreeMap;

import com.abc.Score;
import com.abc.Utility;

class Main {
    public static void main(String[] args) throws Exception{
        //---------------------------------------------- 
        // 呼叫靜態方法讀入的資料, 存在data中
        //---------------------------------------------- 
        // 存放讀入的每行資料
        List<String> lines = Utility.readData("exams.csv");
        
        // 存放待處理所有Score物件
        List<Score> data = new ArrayList();
        
        // 逐行處理資料
        lines.forEach(line -> {
            // 顯示目前處理的資料
            System.out.println(line);
            
            //切割欄位            
            String items[] = line.split(",");
                
            String stuNo = items[0].trim();
            String stuName = items[1].trim();
            int chi = Integer.parseInt(items[2].trim());
            int eng = Integer.parseInt(items[3].trim());                
            int stat = Integer.parseInt(items[4].trim());
            int comp = Integer.parseInt(items[5].trim());    
            
            // 產生成績物件, 加入data中
            data.add(new Score(stuNo, stuName, chi, eng, stat, comp));                       
        });  
        
        //********************************************************
        // 使用Map存放<Key, Value>資料
        //********************************************************
        Map<Integer, Integer> map = new TreeMap();

        // 累加[某個國文成績]的人數
        data.forEach(s -> {    
            Integer score = s.getChi();            
            Integer cnt = map.get(score);
            
            if(cnt == null){
                map.put(score, 1);
            }else{
                cnt++;
                map.put(score, cnt);            
            }    
        });                  
        
        // 累加總資料數
        double total = 0;
        
        Set<Integer> keys = map.keySet();
        for(Integer key: keys){
            total += map.get(key);
            total++;
        }

        // 將Map中的物件加入output中
        List<String> output = new ArrayList(); 
        
        DecimalFormat df = new DecimalFormat("#.###");  //設定小數數值輸出格式
        
        for(Integer key: keys){
            String str = "分數:" + key + ", 人數: " + map.get(key) + ", 比例" + df.format(map.get(key) / total);
            output.add(str);
        } 
        //********************************************************       


        //---------------------------------------------- 
        // 呼叫靜態方法, 將output內資料寫到檔案中
        //----------------------------------------------      
        boolean flag = Utility.writeData("out.csv", output);
        
        if(flag){
            System.out.println("寫檔成功");
        }else{
            System.out.println("寫檔失敗");
        }
        //----------------------------------------------       
    }    
}