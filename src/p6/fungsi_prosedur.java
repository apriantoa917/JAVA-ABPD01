package p6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG STRIX
 */
public class fungsi_prosedur {

    /*
     sub program dibagi menjadi 2
        1. prosedur -> menjalankan code tanpa mengembalikan nilai
        2. fungsi -> menjalankan code dengan mengembalikan nilai
     */
    public static void main(String[] args) {
        

        cetak_nama(); // akses prosedur

        System.out.println(cetak_nama1()); // mencetak nilai fungsi

        cetak_nama2("Aprianto"); // akses prosedur dengan parameter nama

        System.out.println(cetak_nama3("Aprianto")); // mencetak nilai fungsi dengan parameter nama

        cetak_data("Aprianto", 20); // akses prosedur dengan 2 parameter. parameter yang disediakan harus sama dengan yang di deklarasi
        
        System.out.println(jumlah_uang(1000, 2000, "Aprianto"));
    }

    static void cetak_nama() { // prosedur tanpa parameter
        System.out.println("Nama Saya : Aprianto");
    }

    static String cetak_nama1() { // fungsi tanpa parameter, mengembalikan nilai string
        return "Nama Saya : Aprianto";
    }

    static void cetak_nama2(String nama) {
        System.out.println("Nama Saya : " + nama);
    }

    static String cetak_nama3(String nama) {
        return "Nama Saya : " + nama;
    }

    static void cetak_data(String nama, int usia) { // parameter dapat > 1, tipe data bisa beragam
        int tahun_sekarang = 2020, tahun_lahir = tahun_sekarang - usia;
        System.out.println("---------\nNama Saya : " + nama + "\nUsia Saya : " + usia + "\nTahun Lahir : " + tahun_lahir);
    }

    static String jumlah_uang(int a, int b, String nama) {
        return "---------\nHalo " + nama + ", Uang anda : Rp " + (a + b);
    }

}
