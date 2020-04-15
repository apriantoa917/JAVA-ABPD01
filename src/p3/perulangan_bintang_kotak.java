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
public class perulangan_bintang_kotak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // pelajari dulu class perulangan bintang datar
        System.out.print("Masukan angka : ");
        int loop = Integer.parseInt(br.readLine());

        if (loop % 2 == 0 || loop == 1) { // yang bisa dijalankan yang ganjil
            System.out.println("tidak boleh angka genap / 1");
        } else {
            int tengah = loop / 2 + 1; // untuk pembeda posisi di tengah, posisi tengah = 1/2 dari nilai inputan di + 1

            System.out.println("\n model 1");
            for (int i = 1; i <= loop; i++) {
                for (int j = 1; j <= loop; j++) {
                    if (i == tengah && j == tengah) { // jika posisi ditengah cetak A
                        System.out.print(" A ");
                    } else {
                        System.out.print(" * "); // selain ditengah cetak *
                    }
                }
                System.out.println("");
            }

            System.out.println("\n\n model 2");
            for (int i = 1; i <= loop; i++) {
                if (i > 1 && i < loop) {
                    for (int j = 1; j <= loop; j++) {
                        if (j > 1 && j < loop) {
                            System.out.print(" A ");
                        } else {
                            System.out.print(" * ");
                        }
                    }
                } else {
                    for (int j = 1; j <= loop; j++) {
                        System.out.print(" * ");
                    }
                }
                System.out.println("");
            }
        }
    }

}
