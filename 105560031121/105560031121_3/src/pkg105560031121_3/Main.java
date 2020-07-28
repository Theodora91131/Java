/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031121_3;

/**
 *
 * @author user
 */
import java.util.List;
import java.util.ArrayList;
import com.abc.Utility;

public class Main {
    public static void main(String[] args) {
        //---------------------------
        // 產生測試資料
        //---------------------------        
        List<Double> list = new ArrayList();
        
        list.add(67.3);
        list.add(68.1);
        list.add(87.4);
        list.add(57.8);
        list.add(76.2);
        list.add(45.1);
        list.add(98.6);
        list.add(77.3);
        list.add(65.2);
        list.add(54.6);
 
        //--------------------------------------------- 
        // 呼叫靜態方法不必先產生實體, 
        // 直接以: 類別名稱.方法名稱(傳入參數) 呼叫即可.
        // 例如:   Utility.average(list)                  
        //---------------------------------------------         
        System.out.println("平均數:" + Utility.average(list));
        System.out.println("標準差:" + Utility.stdDev(list));
    }    
}