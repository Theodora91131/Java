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
import com.abc.OverseasEmployee;

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
        
        // 加入幾個[海外員工]物件
        list.add(new OverseasEmployee("140001", "應立煌", "會計部", "A", 10, "美國"));
        list.add(new OverseasEmployee("140002", "賀家政", "人事部", "B", 12, "中國"));
        list.add(new OverseasEmployee("140003", "游惠嘉", "人事部", "C", 18, "澳洲"));
        list.add(new OverseasEmployee("140004", "林佑倫", "人事部", "A", 13, "印度"));
        
        // 依序印出[員工/海外員工]資料
        list.forEach(s ->{
            System.out.println(s.toString());
        });
    }   
}