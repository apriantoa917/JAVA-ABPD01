/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROG STRIX
 */
public class array_kasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        String data[][] = new String[2][5];
        double total = 0.0;
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nBarang ke-"+(i+1)+"\n==============");
            System.out.print("Kode barang : ");
            data[i][0] = br.readLine(); // kode barang
            System.out.print("Nama barang : ");
            data[i][1] = br.readLine(); // nama barang
            System.out.print("Harga barang : ");
            data[i][2] = br.readLine(); // harga barang
            System.out.print("Jumlah barang : ");
            data[i][3] = br.readLine(); // jumlah barang
            // perhitungan total
            data[i][4] = Double.toString(Integer.parseInt(data[i][2])*Double.parseDouble(data[i][3])); // mengubah data string ke int dan double, lalu dikembalikan lagi ke string
            total += Double.parseDouble(data[i][4]);
        }
        System.out.println("\nKode Brg \t Nama Brg \t Harga Brg \t Jumlah Brg \t Total");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0]+" \t\t "+data[i][1]+" \t\t "+data[i][2]+" \t\t "+data[i][3]+" \t\t "+data[i][4]);
        }
        System.out.println("=============\nTotal Belanja : Rp "+total);
    }
    
}
