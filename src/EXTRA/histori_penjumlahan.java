/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import sun.security.util.ArrayUtil;

/**
 *
 * @author ROG STRIX
 */
public class histori_penjumlahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan berapa kali penjumlahan ? \n>>>");
        int loops = Integer.parseInt(br.readLine());
        int total_sum = 0;

        System.out.println("\nPerhatian !!! perhitungan yang dapat dilakukan -> bilangan bulat\n");

        int data[][] = new int[loops][3]; // array sejumlah baris inputan, kolom 3 (angka 1, angka 2, hasil penjumlahan)

        // ambil inputan
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nPerhitungan ke-" + (i + 1) + "\n-----------------");
            System.out.print("Angka 1 : ");
            data[i][0] = Integer.parseInt(br.readLine());
            System.out.print("Angka 2 : ");
            data[i][1] = Integer.parseInt(br.readLine());
            data[i][2] = data[i][0] + data[i][1];
            total_sum += data[i][2];
        }

        // cetak hasil
        System.out.println("\nHasil Penjumlahan\n-----------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + " + " + data[i][1] + " = " + data[i][2]);
        }

        // perhitungan dengan hasil terbesar -> sorting
        Arrays.sort(data, (array_lama, array_baru) -> array_lama[2] - array_baru[2]); // mengurutkan dari kecil ke besar berdasarkan kolom kedua (hasil penjumlahan)
        Collections.reverse(Arrays.asList(data)); // membalik urutan (besar ke kecil)

        // cetak hasil penjuumlahan terbesar
        System.out.println("\nHasil Penjumlahan Terbesar\n-----------------");
        System.out.println(data[0][0] + " + " + data[0][1] + " = " + data[0][2]); // ambil baris pertama (terbesar)
        
        // total perhitungan
        System.out.println("\nTotal perhitungan\n-----------------");
        System.out.println(total_sum); 
    }

}


