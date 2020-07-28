/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031129_2;

/**
 *
 * @author user
 */
import java.util.List;
import java.util.ArrayList;
import com.abc.Hostel;
import com.abc.Utility;

class Main {

    public static void main(String[] args) throws Exception {
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
        if (lines == null || lines.isEmpty()) {
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
            int id = Integer.parseInt(items[0].trim());
            String name = items[1].trim();
            String tel = items[2].trim();
            String fax = items[3].trim();
            String address = items[4].trim();
            double lat = Double.parseDouble(items[5].trim());
            double lng = Double.parseDouble(items[6].trim());
            int regularPrice = Integer.parseInt(items[7].trim());
            int holidayPrice = Integer.parseInt(items[8].trim());
            int room = Integer.parseInt(items[9].trim());

            // 產生成績物件, 加入data中
            data.add(new Hostel(id, name, tel, fax, address, lat, lng, regularPrice, holidayPrice, room));
        });

        //-------------------------------------------
        // 符合條件者, 加入output中 
        //-------------------------------------------
        for (Hostel s : data) {
            if (Utility.district(s.getAddress()) != null) {
                String str = s.getId() + "," + s.getName() + "," + s.getAddress() + "," + Utility.district(s.getAddress()).substring(6, 9);
                output.add(str);
            }

            //========================================================
            // 呼叫靜態方法, 將output內資料寫到檔案中
            //========================================================       
            boolean flag = Utility.writeData("out.csv", output);

            if (flag) {
                System.out.println("寫檔成功");
            } else {
                System.out.println("寫檔失敗");
            }
            //========================================================        
        }
    }
}
