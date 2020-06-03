/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.util.Vector;

/**
 *
 * @author ROG STRIX
 */
public class vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* vector vs array 
            - array -> isi array jelas, wajib di deklarasi, isi tidak boleh lebih dari jumlah yang di deklarasi
            - vector -> isi vector tidak perlu di deklarasi, dapat bertambah secara dinamis
    
         */

        // deklarasi vector
        Vector<String> data = new Vector<>();

        // menambah data / isi vector
        data.add("A");// akan jadi index ke 0
        data.add("B");// akan jadi index ke 1
        data.add("C");// akan jadi index ke 2, dst

        System.out.println("===============");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }

        // menghapus data pada vector
        data.remove(0); // menghapus index ke 0 ("A"), index ke 0 jadi "B"

        System.out.println("===============");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }

        // mengedit data pada vector
        data.set(0, "R"); // mengubah data index ke 0 (awalnya "B" menjadi "R")

        System.out.println("===============");
        for (int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }
    }

}
