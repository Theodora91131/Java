/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10556003_1011_5;

import java.io.*;
import com.abc.Score;

class Main {

    public static void main(String[] args) throws IOException {
        //(1) 宣告檔案讀取及寫出變數
        BufferedReader br = null;
        BufferedWriter bw = null;

        //------------------------------------------      
        try {
            //(2) 建立檔案讀取及寫出物件  
            br = new BufferedReader(new FileReader(new File("exams.csv")));
            bw = new BufferedWriter(new FileWriter(new File("out.csv")));

            //(3) 逐行讀入檔案內容
            //--------------------- 
            boolean firstLine = true;
            String line;

            while ((line = br.readLine()) != null) {
                //切割欄位內容
                String items[] = line.split(",");

                String stuNo = items[0].trim();
                String stuName = items[1].trim();
                String gender = items[2].trim();
                int chi = Integer.parseInt(items[3].trim());
                int eng = Integer.parseInt(items[4].trim());
                int stat = Integer.parseInt(items[5].trim());
                int comp = Integer.parseInt(items[6].trim());

                //將資料放入物件
                Score score = new Score(stuNo,stuName,gender,chi,eng,stat,comp);
               // Score score = new Score();
               /*
                score.stuNo = stuNo;
                score.stuName = stuName;
                score.gender = gender;
                score.chi = chi;
                score.eng = eng;
                score.stat = stat;
                score.comp = comp;
*/

                //顯示物件中的資料
                System.out.println(line);
                System.out.println(score.stuNo);
                System.out.println(score.stuName);
                System.out.println(score.gender);
                System.out.println(score.chi);
                System.out.println(score.eng);
                System.out.println(score.stat);
                System.out.println(score.comp);
                System.out.println(score.total());
                System.out.println(score.average());
                System.out.println(score.rank());
                System.out.println("-------------------------");

                //將物件內容寫至檔案
                String data = score.stuNo + "," + score.stuName + "," + score.gender + "," + score.chi + "," + score.eng + "," + score.stat + "," + score.comp + "," + score.total() + "," + score.average() + "," + score.rank() + ",";

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
            //(4) 關閉reader
            if (br != null) {
                br.close();
            }

            //(4) 關閉writer
            if (bw != null) {
                bw.close();
            }
        }
        //------------------------------------------         
    }
}
