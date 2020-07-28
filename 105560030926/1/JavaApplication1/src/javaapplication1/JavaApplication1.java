package javaapplication1;
import java.io.*;
public class JavaApplication1 {
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        //(1) 建立一個檔案讀取物件      
        int count = 0, boy = 0, girl = 0;
        File file = new File("G:/scores.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);        

        //(2) 逐行讀入檔案內容
        //------------------------------------            
        String line;        
        while ((line = br.readLine()) != null) {  
           String gender = line.substring(3,4); 
           int chi = Integer.parseInt(line.substring(4,6));
           int eng = Integer.parseInt(line.substring(6,8));
           int mat = Integer.parseInt(line.substring(8,10));
            System.out.println("國文"+chi); 
             System.out.println("英文"+eng); 
             System.out.println("mat"+mat); 
             int total = 0;
             total= chi + eng + mat ;
             
           System.out.println(gender); 
           System.out.println("共"+total); 
           
            count++; 
                
            //if(a.equals("男"))
           // {
              //boy++;
            //}else
           // {
             // girl++;
           // }
            System.out.println(line);
        }
        //------------------------------------  
        
        //(3) 關閉reader
        br.close(); 
        System.out.println("-------------");      
        System.out.println("共"+count);
        //System.out.println("男"+boy);
        //System.out.println("女"+girl);
    }
    
}
