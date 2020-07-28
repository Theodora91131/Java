/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560030102_2;

/**
 *
 * @author user
 */
import java.util.regex.*;

public class Main
{
    public static void main( String args[] ){    
        //-----------------------
        // 一段網頁內容
        //-----------------------
        String text = "<meta name='description' content='書名：Python 網路爬蟲與資料視覺化應用實務，ISBN：9863125628，作者：陳允傑，出版社：旗標出版，出版日期：2018-12-28<link rel='canonical' href='https://www.tenlong.com.tw/products/9789863125624' <meta property='fb:app_id' content='1810701175883957' <meta property='og:site_name' content='天瓏網路書店' />";

        //-------------------------------------
        // 檢查text是否符合某種表示式 
        //-------------------------------------
        boolean b1 = Pattern.matches("(.*)(\\d{4}-\\d{2}-\\d{2})(.*)", text);
        System.out.println(b1); 
        
        boolean b2 = Pattern.matches(".*\\d{4}-\\d{1,2}-\\d{1,2}.*", text);
        System.out.println(b2);   
         boolean b3 = Pattern.matches(".*\\d{10,}.*", text);
        System.out.println(b3);  
    }
}