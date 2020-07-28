/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560030109_2;

/**
 *
 * @author user
 */
import java.util.ArrayList;
import java.util.List;

import com.abc.Pricing;
import com.abc.Product;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Pricing> list = new ArrayList();

        // 加入幾個[產品類別]物件
        list.add(new Product("防風外套", 75, 32000, 37375));
        list.add(new Product("運動上衣", 65, 24560, 34500));
        list.add(new Product("運動長褲", 76, 38540, 36525));
        list.add(new Product("單車褲", 55, 42500, 41515));         
        
        // 依序印出list內容
        for(Pricing s : list){
            System.out.println(s.printInfo());
        }
    }   
}
