
package p_0927_1;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        //(1) 建立一個檔案讀取物件   
        int total=0,etotal=0,hatb=0,hatc=0,ehatb=0;
        BufferedReader br = new BufferedReader(new FileReader(new File("d:/mushroom.txt")));        

        //(2) 建立一個檔案寫出物件      
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d:/mushroomout.txt")));        

        //(3) 逐行讀入檔案內容
        //------------------------------------              
        String line; 
        boolean firstLine = true;
        
        while ((line = br.readLine()) != null) {       
           
            //顯示讀入內容          
            System.out.println(line);
            total++;
            String ediable = line.substring(0,1);
            //將內容寫出檔案
            String hat = line.substring(1,2);
           // String hatbb = line.substring(1,2);
            if(hat.equals("b")){
                hatb++;
            }
            else if(hat.equals("c")){
                hatc++;
            }
            if(hat.equals("b")&&ediable.equals("e")){
                ehatb++;
            }
            
          
            if(ediable.equals("e")){
                if(firstLine){
                    bw.write(line);
                    bw.write(("\n"));
                    etotal++;
                    //firstLine=false;
                }else{
                    bw.write(("\n"));
                    bw.write(line);                
                }
            }
        }
        //------------------------------------          
        System.out.println("共"+total+"筆");
        System.out.println("可食用"+etotal+"筆");
        System.out.println("可食用比例"+(float)((float)etotal/(float)total));
         System.out.println("鐘型"+hatb+"筆");
         System.out.println("錐型"+hatc+"筆");
         System.out.println("鐘型可食"+ehatb+"筆");
         System.out.println((float)ehatb/(float)hatb);
        //(4) 關閉reader及writer, 強制輸出未寫出的暫存內容
        br.close();
        bw.close();   
        
        
    }
} 