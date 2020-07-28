package pkg105560031025_3;

import java.io.*;
import com.abc.Logs;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = null;
        BufferedWriter bw = null;

        //------------------------------------------      
        try {
            // 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("phoneLogs.csv")));
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));
            //--------------------------------

            // 顯示結果
            //--------------------------------        
           // System.out.println("分鐘數: " + minutes);
           // System.out.println("秒數: " + seconds);

            // 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;
            String line;

            while ((line = br.readLine()) != null) {
                // 顯示讀入的資料
                System.out.println(line);

                //切割欄位內容
                String items[] = line.split(",");
                int serNo = Integer.parseInt(items[0].trim());

                // 設定日期時間格式
                //--------------------------------        
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d H:m:s");
                //--------------------------------        
                // 設定兩個日期時間
                //--------------------------------        
                LocalDateTime start = LocalDateTime.parse(items[1].trim(), formatter);
                LocalDateTime end = LocalDateTime.parse(items[2].trim(), formatter);
                //--------------------------------        
                
                //--------------------------------             
                // 產生成績物件並將資料透過建構元放入物件中
                Logs logs = new Logs(serNo, start, end);

                // 將物件內容寫至檔案
                String data = logs.getSerNo() + "," + logs.getStart() + "," + logs.getEnd() + "," +logs.fee();

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
            return;
        } finally {
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
