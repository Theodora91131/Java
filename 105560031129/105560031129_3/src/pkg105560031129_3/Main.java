/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031129_3;

/**
 *
 * @author user
 */
import java.util.List;
import java.util.ArrayList;
import com.abc.Hostel;
import com.abc.Utility;

class Main {
    public static void main(String[] args) throws Exception{
        //========================================================
        // 呼叫靜態方法讀入的資料, 存在list中
        //========================================================
        List<String> lines = Utility.readData("hostel.csv");
        
        // 存放待處理物件的List
        List<Hostel> data = new ArrayList();
        
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
            int id =Integer.parseInt(items[0].trim());
            String name = items[1].trim();
            String tel = items[2].trim();
            String fax = items[3].trim();
            String address = items[4].trim();
            double lat = Double.parseDouble(items[5].trim());   
            double lng = Double.parseDouble(items[6].trim());  
            int  regularPrice = Integer.parseInt(items[7].trim());
            int holidayPrice = Integer.parseInt(items[8].trim()); 
            int room = Integer.parseInt(items[9].trim()); 
            
            // 產生成績物件, 加入data中
            data.add(new Hostel(id,name,tel,fax,address,lat,lng,regularPrice,holidayPrice,room));                       
        });  
        
        //-------------------------------------------
        // 符合條件者, 加入output中 
        //-------------------------------------------
        int count = 0;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        for(Hostel s : data){
           count ++;
           if(s.getHolidayPrice() >= 8000){
               c1++;
            }
           if(s.getHolidayPrice() >= 6000 && s.getHolidayPrice() < 8000 ){
               c2++;
            }
           if(s.getHolidayPrice() >= 4000 && s.getHolidayPrice() < 6000){
               c3++;
            }
           if(s.getHolidayPrice() >= 2000 && s.getHolidayPrice() < 4000){
               c4++;
            }
           if(s.getHolidayPrice() < 2000){
               c5++;
            }    
        }
        output.add("價日價格8,000元(含)以上, 共"+ c1+"家, 佔百分比"+(double)c1/(double)count);
        output.add("價日價格6,000元(含)以上, 且不到8,000元, 共"+ c2 +"家, 佔百分比"+ (double)c2/(double)count);  
        output.add("價日價格4,000元(含)以上, 且不到6,000元, 共"+ c3 +"家, 佔百分比"+ (double)c3/(double)count); 
        output.add("價日價格2,000元(含)以上, 且不到4,000元, 共"+ c4 +"家, 佔百分比"+ (double)c4/(double)count);
        output.add("價日價格不到2,000元, 共"+ c5 +"家, 佔百分比"+ (double)c5/(double)count);
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

