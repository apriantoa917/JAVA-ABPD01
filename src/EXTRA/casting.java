/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXTRA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROG STRIX
 */
public class casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukan nilai dari variabel String (Berupa Angka int) : ");
        String str = br.readLine();

        System.out.print("Masukan nilai dari variabel int : ");
        
        int Int = Integer.parseInt(br.readLine());

        System.out.print("Masukan nilai dari variabel double : ");
        double dob = Double.parseDouble(br.readLine());

        double str_ke_dob = Double.parseDouble(str); // mengubah nilai string ke double -> String harus berupa angka agar bisa diubah
        
        double int_ke_dob = Int * 1.00; // mengubah int ke double

        String int_ke_str = Integer.toString(Int); // mengubah integer ke string

        String dob_ke_str = Double.toString(dob); // mengubah double ke string

        int dob_ke_int = (int) dob; // mengubah double ke int

        int str_ke_int = Integer.parseInt(str); // mengubah nilai string ke int -> String harus berupa angka agar bisa diubah
        
        System.out.println("");
        System.out.println("------------");
        System.out.println("Hasil dari parsing String ke integer : " + str_ke_int);
        System.out.println("Hasil dari parsing String ke double : " + str_ke_dob);
        System.out.println("------------");
        System.out.println("Hasil dari parsing int ke String : " + int_ke_str);
        System.out.println("Hasil dari parsing int ke double : " + int_ke_dob);
        System.out.println("------------");
        System.out.println("Hasil dari parsing double ke String : " + dob_ke_str);
        System.out.println("Hasil dari parsing double ke int : " + dob_ke_int);
    }

}
