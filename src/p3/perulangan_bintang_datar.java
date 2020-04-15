/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ROG STRIX
 */
public class perulangan_bintang_datar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan angka : ");
        int loop = Integer.parseInt(br.readLine());
        System.out.println("");
        if (loop % 2 == 0) { // yang bisa dijalankan yang ganjil
            System.out.println("tidak boleh angka genap");
        } else {
            int cetak_huruf = loop / 2 + 1; // untuk pembeda posisi di tengah, posisi tengah = 1/2 dari nilai inputan di + 1
            /* 
            misal 11, 1/2 dari 11 = 6,5. 
            posisi ditengah = 6 dari kiri dan 6 dari kanan
                        1 2 3 4 5 6 [tengah (6,5)] 7 8  9 10 11
            index (i) : 1 2 3 4 5 6        7       8 9 10 11 12
            int cetak huruf = loop/2 = 6 (int memotong angka desimalnya) + 1 = 7
            jadi A dicetak di index ke 7 / loop
             */
            for (int i = 1; i <= loop; i++) {
                if (i == cetak_huruf) { // jika posisi ditengah cetak A
                    System.out.print(" A ");
                } else {
                    System.out.print(" * "); // selain ditengah cetak *
                }
            }
            System.out.println("\n");
        }
    }

}
