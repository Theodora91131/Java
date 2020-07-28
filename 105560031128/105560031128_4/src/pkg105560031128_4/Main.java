/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031128_4;

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
            String boarding = items[12].trim();
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
        int count = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        int tot = 0;
        for(Passenger s : data){
            tot ++;
           if(s.getSurvived()== 1 && s.getGender().equals("female")){
                count ++ ;         
            }
           if(s.getSurvived()== 1 && s.getBoarding().equals("C")){
                c1 ++;
            }else if(s.getSurvived()== 1 && s.getBoarding().equals("Q")){
                c2 ++;
            }else if(s.getSurvived()== 1 && s.getBoarding().equals("S")){
                c3 ++;
            }
           if(s.getSurvived()== 1 && s.getRank()==1){
                c4 ++;
            }else if(s.getSurvived()== 1 && s.getRank()==2){
                c5 ++;
            }else if(s.getSurvived()== 1 && s.getRank()==3){
                c6 ++;
            }                                      
        }
        output.add("存活而且是女性的人數:"+count+"人,百分比"+ (double)count/(double)tot);
        output.add("存活而且瑟堡登船:"+c1+"人,百分比"+ (double)c1/(double)tot);
        output.add("存活而且皇后鎮登船:"+c2+"人,百分比"+ (double)c2/(double)tot);
        output.add("存活而且南漢普敦登船:"+c3+"人,百分比"+ (double)c3/(double)tot);
        output.add("存活而且是一等艙旅客:"+c4+"人,百分比"+ (double)c4/(double)tot);
        output.add("存活而且是二等艙旅客:"+c5+"人,百分比"+ (double)c5/(double)tot);
        output.add("存活而且是三等艙旅客:"+c6+"人,百分比"+ (double)c6/(double)tot);
       
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
