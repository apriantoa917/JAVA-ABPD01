/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p11_lat_uas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ROG STRIX
 */
public class soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<tampung_data> list_data = new ArrayList<>();

        boolean loop = true;
        while (loop) {
            tampung_data inputan = new tampung_data();
            System.out.print("\nMasukan Nama : \n>>>");
            inputan.setNama(br.readLine());
            System.out.print("Masukan nilai (ex : 1,2,3,...\n>>>");
            inputan.setNilai(parse_nilai(br.readLine()));
            list_data.add(inputan);
            System.out.print("Lanjut ? y / n\n>>>");
            if (br.readLine().equalsIgnoreCase("n")) {
                loop = false;
            }
        }

        for (int i = 0; i < list_data.size(); i++) {
            System.out.println("\n");
            System.out.println("Nama : " + list_data.get(i).getNama());
            cetak_mean(list_data.get(i).getNilai());
            cetak_median(list_data.get(i).getNilai());
            cetak_modus(list_data.get(i).getNilai());
        }
    }

    public static ArrayList<Integer> parse_nilai(String nilai) {
        ArrayList<Integer> temp_nilai = new ArrayList<>();
        for (String karakter : nilai.split(",")) {
            temp_nilai.add(Integer.parseInt(karakter));
        }
        return temp_nilai;
    }

    public static void cetak_mean(ArrayList list) {
        int panjang = list.size();
        double total = 0.0;
        for (int i = 0; i < panjang; i++) {
            total += Integer.parseInt(list.get(i).toString());
        }
        System.out.println("Nilai rata rata : " + (total / panjang));
    }

    public static void cetak_median(ArrayList list) {
        Collections.sort(list);
        int panjang = list.size();
        int tengah = panjang / 2;
        double median = 0.0;
        if (panjang % 2 == 0) {
            int angka1 = Integer.parseInt(list.get(tengah).toString());
            int angka2 = Integer.parseInt(list.get(tengah - 1).toString());
            median = (angka1 + angka2) / 2.0;
        } else {
            median = Integer.parseInt(list.get(tengah).toString());
        }
        System.out.println("Nilai median : " + median + " " + list);
    }

    public static void cetak_modus(ArrayList list) {
        int max_count = 0 , max_val = 0;
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i)==list.get(j))count++;
            }
            if(count > max_count){
                max_count = count;
                max_val = Integer.parseInt(list.get(i).toString());
            }
        }
        if(max_count == 1){
            System.out.println("Nilai Modus : tidak ada modus");
        }else{
            System.out.println("Nilai Modus : "+max_val);
        }
        
    }

}

class tampung_data {

    String nama;
    ArrayList<Integer> nilai = new ArrayList<>();

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Integer> getNilai() {
        return nilai;
    }

    public void setNilai(ArrayList<Integer> nilai) {
        this.nilai = nilai;
    }

}
