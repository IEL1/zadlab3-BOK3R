/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Boker
 */
public class Zad3_4 {

    public static int Fib(int liczba) {
        if (liczba == 0) {
            return 0;
        } else if (liczba == 1) {
            return 1;
        }
        else{
            return Fib(liczba-1)+Fib(liczba-2);
        }
    }

    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        
        System.out.print("Podaj ile licz ciagu Fibonacciego policzyc: ");
        int a = wczytaj.nextInt();        
        System.out.print("Wynik: "+Fib(a));

    }

}
