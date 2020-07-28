/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560030109_1;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;
import com.abc.Employee;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Employee> list = new ArrayList();

        // 加入幾個[員工]物件
        list.add(new Employee("120001", "蔡家雅", 4, 20));
        list.add(new Employee("120002", "張怡宇", 2, 10));
        list.add(new Employee("120003", "王庭棋", 8, 15));
        list.add(new Employee("120004", "黃和夫", 7, 0));
        list.add(new Employee("120005", "林于文", 13, 4));
        
        // 依序印出[員工]資料
        list.forEach(s -> {
            System.out.println(s.toString());
        });
    }   
}