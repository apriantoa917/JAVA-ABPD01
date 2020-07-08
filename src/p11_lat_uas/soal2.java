/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11_lat_uas;

import java.util.ArrayList;
import static p11_lat_uas.soal3.kpk;

/**
 *
 * @author ROG STRIX
 */
public class soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> orang = new ArrayList<>();
        orang.add(4); //RAM
        orang.add(5); //AWR
        orang.add(6); //RAH

        int last_kpk = 0, angka1 = 0, angka2 = 0;
        for (int i = 0; i < orang.size() - 1; i++) {
            if (i == 0) {
                angka1 = orang.get(i);
                angka2 = orang.get(i + 1);
            }else{
                angka1 = last_kpk;
                angka2 = orang.get(i+1);
            }
            last_kpk = kpk(angka1, angka2);
        }
        System.out.println("Jadi mereka dapat pergi bersama pada hari ke-"+last_kpk);
    }
    static int fpb(int angka1, int angka2) { // pelajari konsep fpb dulu
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
    static int kpk(int angka1, int angka2) { // pelajari konsep kpk dulu
        int kpk = (angka1 * angka2) / fpb(angka1, angka2);
        return kpk;
    }
}
