/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Boker
 */
public class Zad1_4 {

    public static void main(String[] args) {

        System.out.println("Przesuniecie liczby dodatniej w prawo ze znakiem >>");
        int a = 24;
        int b = a >> 3;
        System.out.println(a + " >> 3 wynosi: " + b);

        System.out.println("Przesuniecie liczby ujemnej w prawo ze znakiem >>");
        a = -24;
        b = a >> 3;
        System.out.println(a + " >> 3 wynosi: " + b);

        System.out.println("Przesuniecie liczby dodatniej w lewo ze znakiem <<");
        a = 24;
        b = a << 3;
        System.out.println(a + " << 3 wynosi: " + b);
        
        System.out.println("Przesuniecie liczby ujemnej w lewo ze znakiem <<");
        a = -24;
        b = a << 3;
        System.out.println(a + " << 3 wynosi: " + b);
        
        System.out.println("Przesuniecie liczby dodatniej w prawo bez znaku >>>");
        a = 24;
        b = a >>> 3;
        System.out.println(a + " << 3 wynosi: " + b);
        
        System.out.println("Przesuniecie liczby ujemnej w lewo bez znaku >>>");
        a = -24;
        b = a >>> 3;
        System.out.println(a + " << 3 wynosi: " + b);
    }
}
