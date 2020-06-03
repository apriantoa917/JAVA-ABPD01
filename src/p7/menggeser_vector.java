/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Vector;

/**
 *
 * @author ROG STRIX
 */
public class menggeser_vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Vector<String> v = new Vector<>(); //(vector 0)
        v.add("1");
        v.add("12");
        v.add("43");
        v.add("2");
        v.add("5");
        v.add("8");
        v.add("10");

        System.out.println("Vector awal"); // mencetak vector awal 
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }

        while (true) {
            System.out.print("\nMau digeser berapa ? ");
            int inputan = Integer.parseInt(br.readLine());
            v = geser(inputan, v); // deklarasi isi vector yang sudah digeser dari vecor sebelumnya (dari vector 0)
            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i) + " ");
            }
        }

    }

    static Vector<String> geser(int geser, Vector<String> v) { // parameter berupa berapa banyak yang akan digeser? dan sumber vector lama

        Vector<String> v_new = new Vector<>(); // deklarasi vector baru

        System.out.println("\ndigeser " + geser);
        geser -= 1; // penggeseran -1 karena index dimulai dari 0

        for (int i = geser; i < v.size(); i++) { // mencetak angka keberapa yang digeser - angka terakhir
            v_new.add(v.get(i));
        }
        for (int i = 0; i < geser; i++) { // menggeser angka ke 0 - sebelum angka yang digeser
            v_new.add(v.get(i));
        }
        return v_new; // function ini mengembalikan sebuah vector baru
    }

}
