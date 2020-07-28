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
        String text = "   <h3><a title = 'Raspberry Pi輕鬆學：遊戲創作×圖形繪製×音樂創作×程式設計×Minecraft×音樂播放器'></a></h3><p><span class='pricing'><del>$400</del> 售價: $312</span> 購買後立即進貨</p><h3><a title ='Oracle PL/SQL程式設計(暢銷回饋版)'></a></h3><p><span class='pricing'><del>$580</del> 售價: $452</span> 購買後立即進貨</p><h3><a title='街頭藝術浪潮：街上的美術館，一線藝術家、經紀畫廊、英倫現場 直擊訪談'></a></h3><p><span class='pricing'><del>$470</del> 貴賓價: $423</span> 購買後立即進貨</p>";
        
        //-------------------------------------
        // 檢查text是否符合某種表示式 
        //-------------------------------------
        boolean b1 = Pattern.matches("(^<h3>)(.*)", text.trim());
        System.out.println(b1);  

        boolean b2 = Pattern.matches("^<h3>.*", text);
        System.out.println(b2);  
        
        //-------------------------------------
        // 檢查text是否符合某種表示式 
        //-------------------------------------
        boolean b3 = Pattern.matches("(^.*)(.*)(</p>$)", text);
        System.out.println(b3);          
        
        boolean b4 = Pattern.matches("^<h3>.*</p>$", text);
        System.out.println(b4);          
    }
}
