/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author ROG STRIX
 */
public class switch_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // TODO code application logic here
        // A,B, C,D,E

        System.out.print("masukan nilai huruf : ");
        String huruf = br.readLine();

        switch (huruf) { // ( ) <- diisi variabel yang ingin dibandingkan
            case "A": // "A" isi variabel / nilai yang jadi pembanding

                System.out.println("sama dengan A");

                break; // break untuk membatasi kode berhenti disini jika kondisi sudah memenuhi syarat
            case "B":
                System.out.println("B");
                break;
            case "C":
                System.out.println("C");
                break;
            default: //ketika tidak memenuhi kondisi apapun akan masuk kesini
                System.out.println("kondisi tidak dipenuhi : " + huruf + " tidak dikenali");
                break;
        }

        System.out.print("masukan nilai  : ");
        int val = Integer.parseInt(br.readLine());

        switch (val) {
            case 1:
            case 2:
            case 3:
                // kode jika nilai antara 1-3
                break;

        }

    }

}
