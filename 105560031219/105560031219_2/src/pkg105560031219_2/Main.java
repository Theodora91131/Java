/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031219_2;

/**
 *
 * @author user
 */
import com.abc.Score;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Score> list = new ArrayList();

        // 加入幾個成績物件
        list.add(new Score("110001", "蔡家雅", 85, 76, 66, 75));
        list.add(new Score("110002", "張怡宇", 65, 56, 55, 43));
        list.add(new Score("110003", "王庭棋", 89, 92, 89, 91));
        list.add(new Score("110004", "黃和夫", 77, 61, 72, 68));
        list.add(new Score("110005", "林于文", 84, 90, 89, 91));
        
        // 依序印出成績資料
        list.forEach(s ->{
            System.out.println(s.toString());
        });
    }   
}