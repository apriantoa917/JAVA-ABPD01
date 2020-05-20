/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROG STRIX
 */
public class persegi_kubus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan sisi persegi : ");
        double sisi = Double.parseDouble(br.readLine());
        System.out.print("Masukan tinggi kubus : ");
        double tinggi = Double.parseDouble(br.readLine());
        cetak(sisi, tinggi);
    }

    static double luas_persegi(double sisi) {
        return sisi * sisi;
    }

    static double volume_kubus(double alas, double tinggi) {
        return alas * tinggi;
    }

    static void cetak(double sisi, double tinggi) {
        System.out.println("-----------------");
        System.out.println("Luas Persegi : " + luas_persegi(sisi) + " cm2");
        System.out.println("Volume kubus : " + volume_kubus(luas_persegi(sisi), tinggi) + " cm3");
    }
}
