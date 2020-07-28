package pkg105560031219_2;

import java.util.ArrayList;
import java.util.List;
import com.abc.Score;
import com.abc.FullScore;

public class Main {
    public static void main(String[] args) {
        // 產生一個List
        List<Score> list = new ArrayList();

        // 加入幾個[成績]物件        
        list.add(new Score("110001", "蔡家雅", 85, 76, 66, 75));
        list.add(new Score("110002", "張怡宇", 65, 56, 55, 43));
        list.add(new Score("110003", "王庭棋", 89, 92, 89, 91));
        
        // 加入幾個[完整輸出成績]物件
        list.add(new FullScore("110004", "黃和夫", 77, 61, 72, 68));
        list.add(new FullScore("110005", "林于文", 84, 90, 89, 91));
        
        // 依序印出[成績/完整輸出成績]資料
        list.forEach(s ->{
            System.out.println(s.toString());
        });
    }   
}