/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031121_5;

/**
 *
 * @author user
 */
import com.abc.Utility;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Utility.checkPassword("abcab"));
        System.out.println(Utility.checkPassword("12312"));
        System.out.println(Utility.checkPassword("123123123"));
        System.out.println(Utility.checkPassword("123abc123abc"));
        System.out.println(Utility.checkPassword("123ABC123ABC"));
        System.out.println(Utility.checkPassword("123ABC123abc "));
    }

}
