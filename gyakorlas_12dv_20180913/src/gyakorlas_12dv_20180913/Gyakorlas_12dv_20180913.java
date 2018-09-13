/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyakorlas_12dv_20180913;

/**
 *
 * @author thomas
 */
public class Gyakorlas_12dv_20180913 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] törpék = {"Hapci","Tudor","Szende","Vidor","Morgó","Kuka","Szundi"};
        System.out.println("----->");
        for(String elem : törpék)
            System.out.println(elem);
        System.out.println("----->");
        int maxHely = 0;
        for(int i=1; i<törpék.length; i++)
            if(törpék[i].length() > törpék[maxHely].length())
                maxHely = i;
        for(String elem : törpék)
            if(elem.length() == törpék[maxHely].length())
                System.out.println(elem);
        System.out.println("----->");
        int darab = 0;
        for(String elem: törpék){
            String teszt = elem.toUpperCase();
            if(teszt.charAt(0) == teszt.charAt(teszt.length()-1))
                darab++;
        }
        System.out.println(darab + " ilyen név van a listában.");
        System.out.println("----->");
        double [] mérések = {9.6, 9.8, 10.5, 12.3, 9.5, 11.2, 10, 11.1, 9.6, 10.5, 10.1};
        double összeg = 0;
        for(double elem: mérések)
            összeg += elem;
        double átlag = összeg / mérések.length;
        System.out.println("Az átlag: "+ átlag);
        System.out.format("Az átlag: %.2f\n", átlag);
        System.out.println("----->");
    }
    
}
