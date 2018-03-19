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
public class Zad1_7 {

    public static void main(String[] arg) {
        Scanner wczytaj = new Scanner(System.in);

        System.out.print("Podaj a: ");
        int a = wczytaj.nextInt();
        System.out.print("Podaj b: ");
        int b = wczytaj.nextInt();

        System.out.println("a<b XOR a!=b to: " + ((a < b) ^ (a != b)));
        System.out.println("a<b NOT to: " + (!(a < b)));

    }

}
