/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11_lat_uas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ROG STRIX
 */
public class soal4 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Double> tangki = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean loop = true;
        int index = 1;
        while (loop) {
            System.out.print("Tangki-" + index + " = ");
            String input = br.readLine();
            parsing(input);
            index++;
            System.out.print("Lanjut ? y / n\n>>>");
            if (br.readLine().equalsIgnoreCase("n")) {
                loop = false;
            }
        }
        double total = 0.0;
        for (int i = 0; i < tangki.size(); i++) {
            total += tangki.get(i);
        }
        System.out.println("Total volume tangki : " + total + " liter");

    }

    static void parsing(String inputan) {
        if (inputan.contains("m3")) { // bisa dm3 dan m3
            if (inputan.contains("d")) { // deteksi apakah dm3
                for (String karakter : inputan.split("dm3")) {
                    tangki.add(Double.parseDouble(karakter));
                }
            } else { // pasti m3
                for (String karakter : inputan.split("m3")) {
                    tangki.add(Double.parseDouble(karakter)*1000);
                }
            }
        } else if (inputan.contains("liter")) {
            for (String karakter : inputan.split("liter")) {
                tangki.add(Double.parseDouble(karakter));
            }
        }
    }

}
