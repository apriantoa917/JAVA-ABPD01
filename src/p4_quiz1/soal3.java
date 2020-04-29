/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p4_quiz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROG STRIX
 */
public class soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan angka : ");
        int loop = Integer.parseInt(br.readLine());
        int tengah = loop / 2 + 1;
        for (int i = 1; i <= loop; i++) { // perulangan untuk baris (menurun)
            if (i == 1) {
                for (int j = 1; j <= loop; j++) {
                    if (j == 1) {
                        System.out.print(" A ");
                    } else {
                        System.out.print(" * ");
                    }
                }
                System.out.println("");
            } else if (i == tengah) {
                for (int j = 1; j <= loop; j++) {
                    if (j == tengah) {
                        System.out.print(" W ");
                    } else {
                        System.out.print(" * ");
                    }
                }
                System.out.println("");
            } else if (i == loop) {
                for (int j = 1; j <= loop; j++) {
                    if (j == loop) {
                        System.out.print(" R ");
                    } else {
                        System.out.print(" * ");
                    }
                }
                System.out.println("");
            } else {
                for (int j = 1; j <= loop; j++) {
                    System.out.print(" * ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
        
    }
    

}
