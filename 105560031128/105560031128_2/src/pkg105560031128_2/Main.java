/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031128_2;

/**
 *
 * @author user
 */
import java.util.List;
import java.util.ArrayList;
import com.abc.Passenger;
import com.abc.Utility;

class Main {
    public static void main(String[] args) throws Exception{
        //========================================================
        // 呼叫靜態方法讀入的資料, 存在list中
        //========================================================
        List<String> lines = Utility.readData("titanic.csv");
        
        // 存放待處理物件的List
        List<Passenger> data = new ArrayList();
        
        // 存放將寫出的資料
        List<String> output = new ArrayList();
        //========================================================        

        //-------------------------------------------
        // 判斷回傳結果
        //-------------------------------------------        
        if(lines==null || lines.isEmpty()){
            System.out.println("找不到檔案, 或檔案中沒有資料");
            return;
        }
        
        //-------------------------------------------
        // 逐筆處理讀入的字串
        //-------------------------------------------
        lines.forEach(line -> {
            // 顯示目前處理的資料
            System.out.println(line);
            
            //切割欄位            
            String items[] = line.split(",");
            int num = Integer.parseInt(items[0].trim());
            int rank = Integer.parseInt(items[1].trim());                
            int  survived = Integer.parseInt(items[2].trim());
            String firstName = items[3].trim();  
            String lastName = items[4].trim();
            String gender = items[5].trim();
            String boarding = items[6].trim();
            // 產生成績物件, 加入data中
            data.add(new Passenger(num, rank,  survived, firstName,lastName, gender, boarding));                       
        });  
        
        //-------------------------------------------
        // 符合條件者, 加入output中 
        // 國文成績>=(平均+1倍標準差)
        //-------------------------------------------
        // 產生一個空的List物件, 存放國文成績
         List<Integer> SurvivedList = new ArrayList();

        // 將所有同學的國文成績加入List中        
        data.forEach(s -> {
           SurvivedList.add(new Integer(s.getSurvived()));
        });
        
        // 呼叫靜態方法, 取得平均數及標準差
      //  double avg = Utility.average(chiList);
       // double sd = Utility.stdDev(chiList);

        // 將所有同學的國文成績與條件比對, 符合才輸出        
        data.forEach(s -> {
           if(s.getSurvived()== 1){
                String str = s.getNum() + "," + s.getRank()+ "," + s.getSurvived()+ "," + s.getFirstName() + "," + s.getLastName()+ "," + s.getGender()+ "," + s. getBoarding(); 
                output.add(str);              
            }   
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