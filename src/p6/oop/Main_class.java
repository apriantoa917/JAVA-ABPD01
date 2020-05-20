/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6.oop;

/**
 *
 * @author ROG STRIX
 */
public class Main_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(); // mengakses objek mahasiswa. class lain jika dimasukan dalam suatu class akan menjadi objek. mhs = objek (bisa punya atribut, method)

        // ambil nim
        System.out.println(mhs.nim);

        // ambil nama. kode akan eror karena nama adalah private. bisa un-comment kode dibawah
        // System.out.println(mhs.nama);

        // jika nama adalah private, nama dapat dicetak di class Mahasiswa dengan method cetak nama. method cetak_nama adalah public, maka dapat diakses
        mhs.cetak_nama(); // ambil nama dengan method
    }

}
