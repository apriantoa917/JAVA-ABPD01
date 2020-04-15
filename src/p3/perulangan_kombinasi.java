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
public class perulangan_kombinasi {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nilai akhir : ");
        int loop = Integer.parseInt(br.readLine());
        for (int i = 1; i <= loop; i++) {
            System.out.println("Urutan ke-" + i);
        }
    }

}
