/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031105_1;

/**
 *
 * @author User
 */
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {
        // 宣告輸入及輸出變數
        BufferedReader br = null;
        BufferedWriter bw = null;
        int count = 0;
        int pcount = 0;
        int pfcount = 0;
        int pgcount = 0;
        int pycount = 0;
        int pscount = 0;
        float pfout;
        float pgout;
        float pout;
        float pyout;
        float psout;
        //------------------------------------------
        try {
            // 建立一個檔案讀取及寫出物件      
            br = new BufferedReader(new FileReader(new File("mushroom.txt")));
            bw = new BufferedWriter(new FileWriter(new File("out.txt")));

            // 逐行讀入檔案內容
            //---------------------
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                // 顯示讀入內容          
                System.out.println(line);
                count += 1;
                if (line.substring(0, 1).equals("p")) {
                    pcount += 1;
                }
                if (line.substring(0, 1).equals("p") && line.substring(2, 3).equals("f")) {
                    pfcount += 1;
                } else if (line.substring(0, 1).equals("p") && line.substring(2, 3).equals("g")) {
                    pgcount += 1;
                } else if (line.substring(0, 1).equals("p") && line.substring(2, 3).equals("y")) {
                    pycount += 1;
                } else if (line.substring(0, 1).equals("p") && line.substring(2, 3).equals("s")) {
                    pscount += 1;
                }
            }
            pout = (float) pcount / (float) count;
            pfout = (float) pfcount / (float) pcount;
            pgout = (float) pgcount / (float) pcount;
            pyout = (float) pycount / (float) pcount;
            psout = (float) pscount / (float) pcount;
            System.out.println("全部共有:" + count + "筆記錄");
            System.out.println("有毒性蘑菇的百分比:" + pout);
            System.out.println("有毒性蘑菇中, 帽表面是纖維佔百分比:" + pfout);
            System.out.println("有毒性蘑菇中, 帽表面是凹槽佔百分比:" + pgout);
            System.out.println("有毒性蘑菇中, 帽表面是鱗片佔百分比:" + pyout);
            System.out.println("有毒性蘑菇中, 帽表面是光滑佔百分比:" + psout);
            // 將內容寫出檔案
            line = "全部共有:" + count + "筆記錄" + "\n" + "有毒性蘑菇的百分比:" + pout + "\n" + "有毒性蘑菇中, 帽表面是纖維佔百分比:" + pfout + "\n" + "有毒性蘑菇中, 帽表面是凹槽佔百分比:" + pgout + "\n" + "有毒性蘑菇中, 帽表面是鱗片佔百分比:" + pyout + "\n" + "有毒性蘑菇中, 帽表面是光滑佔百分比:" + psout;
            if (firstLine) {
                bw.write(line);
                firstLine = false;

            } else {
                bw.write(("\n"));
                bw.write(line);
            }

            //---------------------
        } catch (IOException e) {
            System.out.println("發生錯誤, 原因: " + e);
            return;
        } finally {
            // 關閉reader
            if (br != null) {
                br.close();
            }

            // 關閉writer, 強制輸出未寫出的暫存內容
            if (bw != null) {
                bw.close();
            }
        }

        //------------------------------------------        
    }
}
