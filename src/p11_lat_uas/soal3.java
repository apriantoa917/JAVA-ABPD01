/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11_lat_uas;

import java.util.ArrayList;

/**
 *
 * @author ROG STRIX
 */
public class soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> planet = new ArrayList<>();
        planet.add(1); //bumi
        planet.add(12); //jupiter
        planet.add(30); //saturnus
        planet.add(84); //uranus
//        planet.add(...); dinamis

        int last_kpk = 0, angka1 = 0, angka2 = 0;
        for (int i = 0; i < planet.size() - 1; i++) {
            if (i == 0) {
                angka1 = planet.get(i);
                angka2 = planet.get(i + 1);
            }else{
                angka1 = last_kpk;
                angka2 = planet.get(i+1);
            }
            last_kpk = kpk(angka1, angka2);
        }
        System.out.println("Jadi mereka bisa berada pada satu garis lurus pada setiap "+last_kpk+" tahun sekali");

    }

    static int fpb(int angka1, int angka2) {
        int small = 0, fbp = 0;
        if (angka1 < angka2) {
            small = angka1;
        }else{
            small = angka2;
        }
        for (int j = 1; j < small + 1; j++) {
            if (angka1 % j == 0 && angka2 % j == 0) {
                fbp = j;
            }
        }
        return fbp;
    }

    static int kpk(int angka1, int angka2) {
        int kpk = (angka1 * angka2) / fpb(angka1, angka2);
        return kpk;
    }

}
