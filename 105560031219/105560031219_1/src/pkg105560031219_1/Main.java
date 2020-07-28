/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031219_1;
import java.text.DecimalFormat;
import java.math.RoundingMode;
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       DecimalFormat df = new DecimalFormat("###,###.##");
       df.setRoundingMode(RoundingMode.HALF_UP);
       String s = df.format(123.456);
       System.out.println(s);
    }
    
}
