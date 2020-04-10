/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROG STRIX
 */
public class percabangan_nilai_huruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("uts : ");
        double a = Double.parseDouble(br.readLine());
        System.out.print("uas : ");
        double b = Double.parseDouble(br.readLine());
        System.out.print("tgs : ");
        double c = Double.parseDouble(br.readLine());
        double na = 0.3*a + 0.3*b + 0.4*c;
        System.out.print("nilai akhir : "+na);
        String huruf = "E";
        if(na >= 0 && na < 20){
           huruf = "E";
        }else if(na >= 20 && na < 40){
            huruf = "D";
        }else if(na >= 40 && na < 60){
            huruf = "C";
        }else if(na >= 60 && na < 80){
            huruf = "B";
        }else{
            huruf = "A";
        }
        System.out.println(", nilai huruf : "+huruf);
    }
}
