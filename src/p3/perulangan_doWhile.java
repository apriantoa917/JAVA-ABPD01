/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author ROG STRIX
 */
public class perulangan_doWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // perbedaan dg while : di do while, kode akan dijalankan dahulu, lalu cek kondisi
        
        int awal = 1;
        do {            
            System.out.println(awal);
            awal++;
        } while (awal <= 5);
    }
    
}
