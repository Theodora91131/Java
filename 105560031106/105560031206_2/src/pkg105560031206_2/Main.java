/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031206_2;

/**
 *
 * @author user
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.abc.Expense;
import com.abc.Salary;
import com.abc.Material;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         List<Expense> list = new ArrayList();
        
        //----------------------------
        // 設定日期格式
        //----------------------------
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");  

        //----------------------------
        // 加入幾筆銷貸記錄
        //----------------------------      
      list.add(new Salary(LocalDate.parse("2018-11-22", formatter), "王小明", 'A', 10));
        list.add(new Salary(LocalDate.parse("2018-11-22", formatter), "陳小華", 'B', 12));
        list.add(new Salary(LocalDate.parse("2018-11-22", formatter), "張小文", 'C', 15 )); 
        
        //----------------------------
        // 加入幾筆勞務收入記錄
        //----------------------------      
        list.add(new Material(LocalDate.parse("2018-11-20", formatter),"可可豆", 1350, 10));
        list.add(new Material(LocalDate.parse("2018-11-21", formatter), "咖啡豆", 1565, 12));
        list.add(new Material(LocalDate.parse("2018-11-22", formatter), "奶油", 695, 15 )); 
        
        //----------------------------
        // 呼叫方法印出資料
        //----------------------------       
        printInfo(list);
        
        
    }
    public static void printInfo(List<Expense> list){
        list.forEach(data -> {
            System.out.println(data.category());
            System.out.println(data.detail());
            System.out.println(data.total());
            System.out.println("----------");
        });   
    }
}
