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
public class soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan angka : ");
        int loop = Integer.parseInt(br.readLine());

        for (int i = 1; i <= loop; i++) { // perulangan untuk baris (menurun)
            if (i % 3 == 0) {
                System.out.print(" A ");
            } else {
                System.out.print(" " + i + " ");
            }
        }
        System.out.println("");
    }

}
