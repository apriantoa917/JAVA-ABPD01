/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author ROG STRIX
 */
public class queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 
        Konsep  Queue -> FIFO -> First in First out -> data yang masukan pertama kali akan dikeluarkan pertama kali
         
        konsep dapat dianalogikan seperti anak kos menyimpan mie instan, 
        - mie yang tersisa akan dipakai terlebih dahulu dibandingkan mie yang baru dibeli (menghindari kadarluasa)
        - mie yang baru dibeli akan disimpan sebagai cadangan di tanggal tua :)
         */

        Queue<String> antrianSPP = new LinkedList<>();
        antrianSPP.add("Rampa");
        antrianSPP.add("Praditya");
        antrianSPP.add("Kojek");
        antrianSPP.add("Siti");

        //menampilkan output hasil list
        System.out.println("Isi : " + antrianSPP);
        System.out.println("Ukuran : " + antrianSPP.size());
        
        String hapus = antrianSPP.poll();
        System.out.println("Hapus antrian "+hapus+", antrian tersisa "+antrianSPP);
        
        //menampilkan output hasil list
        System.out.println("Isi : " + antrianSPP);
        System.out.println("Ukuran : " + antrianSPP.size());
        
        String atas = antrianSPP.peek();
        System.out.println("Atas "+atas+" antrian tersisa "+antrianSPP);

        
        System.out.println("nama : "+antrianSPP.poll()+" keluhan : "+antrianSPP.poll());
    }

}
