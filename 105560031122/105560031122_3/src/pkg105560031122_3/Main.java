/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg105560031122_3;

/**
 *
 * @author user
 */
import abc.com.Utility;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Utility.score("ABBBACCDACBCDADAABAC") + "," + Utility.weightedScore("ABBBACCDACBCDADAABAC"));
        System.out.println(Utility.score("ABADACDAACBCDADACBCD") + "," + Utility.weightedScore("ABADACDAACBCDADACBCD"));
        System.out.println(Utility.score("ABBAACCDACBCDADAABCD") + "," + Utility.weightedScore("ABBAACCDACBCDADAABCD"));
        System.out.println(Utility.score("DBBBACADACBADADDABCD") + "," + Utility.weightedScore("DBBBACADACBADADDABCD"));
        System.out.println(Utility.score("CBCDACCDACBCDADACBCB") + "," + Utility.weightedScore("CBCDACCDACBCDADACBCB"));
        System.out.println(Utility.score("DCBDAACDACBCAADAABCD") + "," + Utility.weightedScore("DCBDAACDACBCAADAABCD"));
        System.out.println(Utility.score("ABBDACCDACBCDADAABCD") + "," + Utility.weightedScore("ABBDACCDACBCDADAABCD"));
        System.out.println(Utility.score("ABBDACCDAABCDADAABCB") + "," + Utility.weightedScore("ABBDACCDAABCDADAABCB"));
        System.out.println(Utility.score("ABBDAACDACACDADCABCD") + "," + Utility.weightedScore("ABBDAACDACACDADCABCD"));
        System.out.println(Utility.score("ABDDABCDACBCDADAABCD") + "," + Utility.weightedScore("ABDDABCDACBCDADAABCD"));

    }

}
