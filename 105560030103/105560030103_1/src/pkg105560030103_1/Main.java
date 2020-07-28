/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560030103_1;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

import com.abc.Product;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Product> list = new ArrayList();

        // 加入幾個[商品類別]物件
        list.add(new Product("粉彩筆", 140, 7500, 1500));
        list.add(new Product("記事本", 85, 6500, 2000));
        list.add(new Product("便利貼", 240, 7000, 2400));
        list.add(new Product("立可帶", 160, 6500, 2250));        
        
        // 依序印出list內容
        for(Product s : list){
            System.out.println(s.toString());
        }
    }   
}