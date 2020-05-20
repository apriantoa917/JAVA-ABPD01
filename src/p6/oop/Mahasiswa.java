/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6.oop;

/*
1. parameter
2. atribut -> variabel
3. method
 */
public class Mahasiswa {

    /* Mahasiswa -> asumsi suatu objek (atau seperti manusia, hewan, mobil)
    
    atribut : segala hal yang melekat pada suatu objek (misal variabel)
    atribut yang melekat pada mhs -> nim, nama, dll.
    (jika mobil -> seperti spion, ban, dll)
    
    1. private -> hanya dapat digunakan pada class ini saja, variabel tidak dapat diakses kelas yang lain
    2. public -> atribut yang dapat dipakai oleh kelas apa saja
    3. protected -> dapat digunakan pada semua class package yang sama, tidak dapat digunakan oleh package lain
    
    
    method : fungsi yang dapat digunakan untuk operasi pada suatu objek (fungsi yang dapat melakukan apapun dari kelas ini)
    */
    public String nim = "18410100002"; // dapat diakses oleh semua kelas
    private String nama = "Aprianto"; // hanya dapat diakses kelas ini saja

    public void setNim(String n) {
        nim = n;
    }

    public String getNim() { // mengembalikan nilai dari nim, dapat diakses semua kelas
        return nim;
    }

    private String getNama() { // mengembalikan nilai dari nama, karena private = hanya dapat diakses di kelas ini saja
        return nama;
    }
    
    public void cetak_nama(){
        // nama = private, tidak dapat dilihat. namun karena dia dicetak langsung oleh method di kelas ini, dia bisa diakses.
        System.out.println(nama);
    }

}
