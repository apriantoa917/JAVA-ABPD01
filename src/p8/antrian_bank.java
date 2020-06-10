/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ROG STRIX
 */
public class antrian_bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        // objek = class yang diimpor ke dalam class lain,
        // model = impor variabel no,nama, keluhan ke dalam main class untuk menampung data sementara
        // data yang masuk ke queue bukan lagi per variabel, melainkan sudah dibungkus menjadi 1 class (menampung variabel no, nama, keluhan)
        // jadi ketika ingin menambah/ mengeluarkan harus melalui class model
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<model> antrian = new LinkedList<>(); // kita pakai 1 queue dengan class (bisa menampung berbagai variabel yang berbeda tipe data)
        // lihat class model di bawah sendiri, kita deklarasi variabel yang akan dipakai dalam queue
        // queue jika dibayangkan dapat seperti ini Queue<no,nama,keluhan>

        int no_urut = 1; // inisialisasi nomor urut untuk antrean 1
        boolean next = true; // inisialisasi input antrean (agar masuk while)
        System.out.println("Input Antrian\n====================");
        while (next) {

            model m = new model(); // memanggil class sebagai objek
            m.setNo(Integer.toString(no_urut)); // mengisi variabel no di class model dengan nomor urut (otomatis bertambah)

            System.out.println("\nAntrian no." + no_urut);
            no_urut += 1; // menambah no urut

            System.out.print("\nNama : "); // meminta input nama
            m.setNama(br.readLine()); // menampung isi variabel nama di class model dengan inputan nama

            System.out.print("Keluhan : "); // meminta input keluhan
            m.setKeluhan(br.readLine()); //menampung isi variabel keluhan di class model dengan inputan keluhan

            // variabel yang ditampung di class model hanya sebagai temporary / penampungan sementara
            antrian.add(m); // data yang sudah di tampung divariabel akan dimasukan ke dalam queue secara serentak (langsung menjadi 1 data)

            System.out.print("\n1. Lanjut 2. Selesai\n>>>"); // apakah ada inputan data lain? jika ada maka akan mengulang di while
            int jawab = Integer.parseInt(br.readLine());
            if (jawab == 2) {
                next = false; // jika input 2, keluar dari while
            }
        }

        boolean pelayanan = true;
        System.out.println("\n\nPelayanan Antrian\n====================");
        while (pelayanan) {

            model m = new model(); // memanggil class model sebagai objek untuk mengeluarkan 1 data (no,nama,keluhan).
            m = antrian.poll(); // menginisiasi isi model (isi data dari no, nama, keluhan) dengan data pertama di queue dan menghapusnya (jumlah queue otomatis berkurang).
            String no = m.getNo(); // mengisi data nomor dengan model yang menampung data paling awal (yang di poll)
            String nama = m.getNama();
            String keluhan = m.getKeluhan();
            System.out.println("\nNo. " + no + "\n-------------\nNama : " + nama + "\nKeluhan : " + keluhan + "\nsisa antrian : " + antrian.size() + ", " + getSisaAntrian(antrian) + "\n"); // mengeluarkan data

            if (antrian.isEmpty()) { // jika setelah di poll, data queue sudah kosong, maka :
                pelayanan = false; //berhenti
            } else {
                // bertanya apakah akan lanjut?
                System.out.print("Next Antrian ? 1.Ya    |    2.Males\n>>>");
                int jawab = Integer.parseInt(br.readLine());
                if (jawab == 2) { // jika tidak lanjut, keluar dari while. program selesai.
                    System.err.println("\n================\n\nDasar CS males\n\n================");
                    pelayanan = false;
                }
            }
        }
    }

    public static String getSisaAntrian(Queue<model> sisa_antrian) { // mengambil nama yang sedang dalam antrian (object tidak dapat mengeluarkan nama langsung, harus dikeluarkan manual), parameter = queue yang sisa
        String sisa = "[";
        ArrayList<model> list = new ArrayList<>(sisa_antrian); // deklarasi arraylist dengan isi dari queue
        if (list.size() <= 0) {
            sisa += "tidak ada orang dalam antrian ]";
        } else {
            for (int i = 0; i < list.size(); i++) {
                if(i == list.size()-1){ // jika sudah di akhir tidak pakai koma lagi (aaa,zzz)
                    sisa += list.get(i).getNama();
                }else{ // beri pemisah koma untuk nama selanjutnya (aaa,bbb,...)
                    sisa += list.get(i).getNama() + ", "; 
                }
                
            }
            sisa += "]";
        }
        return sisa;
    }

}

class model {

    String no, nama, keluhan; // deklarasi variabel apa yang akan digunakan

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public void setKeluhan(String keluhan) {
        this.keluhan = keluhan;
    }

}
