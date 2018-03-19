/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;
import static java.lang.Math.*;

/**
 *
 * @author Boker
 */
public class Zad3_3 {

    public static int potega_rekurencyjnie(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 != 0) {
            return x * potega_rekurencyjnie(x, n - 1);
        } else {
            return (int) pow(potega_rekurencyjnie(x, n / 2), 2);
        }
    }

    public static int potega_iteracyjnie(int x, int n) {
        int w = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                w *= x;
            }
            x *= x;
            n /= 2;
        }
        return w;
    }

    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);

        System.out.print("Podaj liczbe: ");
        int x = wczytaj.nextInt();
        System.out.print("Podaj potege: ");
        int n = wczytaj.nextInt();

        System.out.println("Wynik oblicznony rekurencyjnie: " + potega_rekurencyjnie(x, n));
        System.out.println("Wynik oblicznony iteracyjnie: " + potega_iteracyjnie(x, n));

    }
}
