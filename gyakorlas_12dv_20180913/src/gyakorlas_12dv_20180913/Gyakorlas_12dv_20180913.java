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
        String [] t�rp�k = {"Hapci","Tudor","Szende","Vidor","Morg�","Kuka","Szundi"};
        System.out.println("----->");
        for(String elem : t�rp�k)
            System.out.println(elem);
        System.out.println("----->");
        int maxHely = 0;
        for(int i=1; i<t�rp�k.length; i++)
            if(t�rp�k[i].length() > t�rp�k[maxHely].length())
                maxHely = i;
        for(String elem : t�rp�k)
            if(elem.length() == t�rp�k[maxHely].length())
                System.out.println(elem);
        System.out.println("----->");
        int darab = 0;
        for(String elem: t�rp�k){
            String teszt = elem.toUpperCase();
            if(teszt.charAt(0) == teszt.charAt(teszt.length()-1))
                darab++;
        }
        System.out.println(darab + " ilyen n�v van a list�ban.");
        System.out.println("----->");
        double [] m�r�sek = {9.6, 9.8, 10.5, 12.3, 9.5, 11.2, 10, 11.1, 9.6, 10.5, 10.1};
        double �sszeg = 0;
        for(double elem: m�r�sek)
            �sszeg += elem;
        double �tlag = �sszeg / m�r�sek.length;
        System.out.println("Az �tlag: "+ �tlag);
        System.out.format("Az �tlag: %.2f\n", �tlag);
        System.out.println("----->");
    }
    
}
