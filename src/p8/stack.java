/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8;

import java.util.Stack;

/**
 *
 * @author ROG STRIX
 */
public class stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        Konsep  Stack -> LIFO -> Last in First out -> data yang masukan terakhir kali akan dikeluarkan pertama kali
         
        konsep dapat dianalogikan seperti mencuci piring, 
        - piring yang setelah dicuci akan diletakkan di tumpukan atas sendiri
        - piring yang akan dipakai yaitu diambil tumpukan atas sendiri
        */

        Stack<String> s = new Stack<>();
        Stack<String> a = new Stack<>();

        s.push("FISIKA");
        s.push("KIMIA");
        s.push("MATEMATIKA");

        int count = s.size();

        System.out.println("Jumlah data pada stack : " + count); // 3 data

        String atas = s.peek(); // menampilkan data teratas 

        System.out.println("Data Teratas : " + atas); // matematika (yang diinput terakhir)

        String keluar = s.pop(); // menampung data teratas sambil mengeluarkannya dari stack

        System.out.println("Objek data yang dikeluarkan : " + keluar); // matematika

        count = s.size(); // 2 (fisika, kimia)

        System.out.println("Jumlah data pada stack setelah di pop : " + count); // 2

        atas = s.peek(); // menampilkan data teratas 

        System.out.println("Data Teratas pada stack setelah di pop : " + atas); // kimia

        System.out.println(a.isEmpty()); // cek apakah stack tidak mempunyai data apapun (true/false)

        
    }

}
