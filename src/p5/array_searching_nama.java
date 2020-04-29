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
public class array_searching_nama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // input nama 
        String nama[] = new String[3];
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Nama : ");
            nama[i] = br.readLine();
        }

        System.out.print("\nNama yang dicari : ");
        String search = br.readLine();
        boolean ketemu = false;
        System.out.println("\nHasil :");

        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(search)) {
                System.out.println(search + " ketemu di index ke-" + i);
                ketemu = true;
            }
        }

        if (!ketemu) {
            System.out.println(search + " tidak ditemukan");
        }

    }

}
