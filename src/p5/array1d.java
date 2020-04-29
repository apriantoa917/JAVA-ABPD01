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
public class array1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        String data[] = new String[3]; // deklarasi array
        
        // inisialisasi
        data[0] = "a";
        data[0] = "b";
        data[0] = "c";
        
        // panjang array
        int panjang = data.length;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // kasus input 3 nama
        String nama[] = new String[3];
        
        // input nama 
        for (int i = 0; i < nama.length; i++) {
            System.out.print("Nama : ");
            nama[i] = br.readLine(); 
        }
        System.out.println("----------------------");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("Nama ke-"+(i+1)+" : "+nama[i]);
        }
        
    }
    
}
