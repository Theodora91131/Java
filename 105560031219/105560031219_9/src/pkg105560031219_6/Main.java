/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031219_6;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;
import com.abc.Employee;
import com.abc.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Employee> list = new ArrayList();

        // 加入幾個[員工]物件
        list.add(new Employee("120001", "蔡家雅", "人事部", "A", 20));
        list.add(new Employee("120002", "張怡宇", "人事部", "B", 10));
        list.add(new Employee("120003", "王庭棋", "營業部", "C", 15));
        list.add(new Employee("120004", "黃和夫", "營業部", "D", 0));
        list.add(new Employee("120005", "林于文", "會計部", "A", 12));
        
        // 加入幾個[兼職員工]物件
        list.add(new PartTimeEmployee("150001", "孫宥葳", "會計部", "A", 0, 120));
        list.add(new PartTimeEmployee("150002", "黃岑秀", "人事部", "B", 0, 165));
        list.add(new PartTimeEmployee("150003", "楊雅柔", "營業部", "C", 0, 210));
        list.add(new PartTimeEmployee("150004", "李至君", "會計部", "D", 0, 175));
        
        // 依序印出[員工/兼職員工]資料
        list.forEach(s ->{
            System.out.println(s.toString());
        });
    }   
}