/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031017_3;

/**
 *
 * @author User
 */
import java.io.*;
import com.abc.Score;

class Main {

    public static void main(String[] args) throws IOException {
        // 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;

        //------------------------------------------      
        try {
            // 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("vege.txt")));
            bw = new BufferedWriter(new FileWriter(new File("out.txt")));

            // 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;
            String line;

            while ((line = br.readLine()) != null) {
                // 顯示讀入的資料
                System.out.println(line);

                // 切割欄位內容
                String items[] = line.split(",");

                String date = items[0].trim();
                String market = items[1].trim();
                String vegetable = items[2].trim();
                double top = Double.parseDouble(items[3].trim());
                double middle = Double.parseDouble(items[4].trim());
                double bottom = Double.parseDouble(items[5].trim());
                double avg = Double.parseDouble(items[6].trim());
                double amount = Double.parseDouble(items[7].trim());

                // 產生成績物件                
              //  Score score = new Score(market, vegetable, top, middle, bottom, avg, amount);
                  Score score = new Score ();
                // 將資料放入成績物件中
                 score. market =  market;
                 score.vegetable =vegetable;
                 score.top = top;
                 score. middle =  middle;
                 score.bottom = bottom;
                 score.avg =avg;
                 score.amount =amount;
                // 將物件內容寫至檔案
                String data = date + "," + score.market + "," + score.vegetable + "," + score.top + "," + score.middle + "," + score.bottom + "," + score.avg + "," + score.amount;

                if (firstLine) {
                    bw.write(data);
                    firstLine = false;
                } else {
                    bw.write(("\n"));
                    bw.write(data);
                }
            }
            //---------------------            
        } catch (IOException e) {
            System.out.println("發生錯誤, 原因: " + e);

        } finally {
            // 關閉reader
            if (br != null) {
                br.close();
            }

            // 關閉writer
            if (bw != null) {
                bw.close();
            }
        }
        //------------------------------------------         
    }
}
