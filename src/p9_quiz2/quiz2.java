package p9_quiz2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ROG STRIX
 */
public class quiz2 {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Sistem  persamaan liniar 1 variabel");
        while (true) {
            tanya_soal();
        }
    }

    static void tanya_soal() throws IOException {
        System.out.print("\n\nMasukan persamaan \n>>> ");
        String persamaan = br.readLine();
        if(persamaan.equals("x")){
            System.exit(0);
        }else{
            parsing(persamaan.replace(" ", ""));
        }
    }

    static ArrayList parsing(String persamaan) {
        ArrayList data = new ArrayList();
        int operator_position = 0, equal_position = 0;
        String operator = "";

        for (String temp : persamaan.split("")) {
            if (temp.equals("+")) {
                operator_position = persamaan.indexOf(temp);
                operator = "+";
            } else if (temp.equals("-")) {
                operator_position = persamaan.indexOf(temp);
                operator = "-";

            } else if (temp.equals("*")) {
                operator_position = persamaan.indexOf(temp);;
                operator = "*";
            } else if (temp.equals("/")) {
                operator_position = persamaan.indexOf(temp);
                operator = "/";
            } else if (temp.equals("=")) {
                equal_position = persamaan.indexOf(temp);
            }
        }

        String variabel = "";
        int hasil = 0;
        String angka1, angka2, angka3;

        // persamaan jenis 1 : 100=2s+1
        if (operator_position > equal_position) {

            angka1 = persamaan.substring(0, equal_position);
            angka2 = persamaan.substring((equal_position + 1), (operator_position));
            angka3 = persamaan.substring(operator_position + 1);

            //mencari mana yang jadi variabel
            if (isAlphaNum(angka2) && isAlphaNum(angka3)) {
                System.err.println("Maksimal hanya 1 variabel yang dapat dikerjakan");
                System.exit(0);
            } else {
                try {
                    if (isAlpha(angka2.substring(angka2.length() - 1))) {
                        // angka 1 
                        variabel = angka2;
                        hasil = operasi(Integer.parseInt(angka1), Integer.parseInt(angka3), operator);
                    } else if (isAlpha(angka3.substring(angka3.length() - 1))) {
                        // angka 2
                        variabel = angka3;
                        hasil = operasi(Integer.parseInt(angka1), Integer.parseInt(angka2), operator);
                    } else {
                        System.err.println("variabel tidak ditemukan, format persamaan : 100 = 2q + 1");
                        System.exit(0);
                    }
                } catch (Exception e) {
                    System.err.println("Maksimal hanya 1 variabel yang dapat dikerjakan");
                    System.exit(0);
                }
            }

            // mencari koefisien variabel 
            int koef = 0;
            int len_variabel = variabel.length();
            String nama_variabel = variabel.substring(len_variabel - 1); // ex : 3w -> w
            if (len_variabel == 1) { // ex : w -> length 1, koef 1
                koef = 1;
            } else { // ex : 308w -> length 3, koef 308
                koef = Integer.parseInt(variabel.replace(nama_variabel, "")); // 308w -> 308
            }

            double nilai = (hasil * 1.0) / koef; // hasil 200 = 3w , w = 200/3, *1.0 -> agar menjadi double
           
            System.out.println("\n>>>\t" + persamaan);
            System.out.println(">>>\t" + hasil + "=" + variabel);
            System.out.println(">>>\t" + nama_variabel + "=" + hasil + "/" + koef);
            System.out.println(">>>\t" + nama_variabel + "=" + nilai);
            System.out.println("\n>>>\t" + persamaan);
            System.out.println(">>>\t" + angka1 + " = " + angka2.replace(nama_variabel, "(" + nilai + ")") + operator + angka3.replace(nama_variabel, ".(" + nilai + ")"));

        } else {// persamaan jenis 2 : 2s+1=100
            angka1 = persamaan.substring(0, operator_position);
            angka2 = persamaan.substring((operator_position + 1), (equal_position));
            angka3 = persamaan.substring(equal_position + 1);

            //mencari mana yang jadi variabel
            if (isAlphaNum(angka1) && isAlphaNum(angka2)) {
                System.err.println("Maksimal hanya 1 variabel yang dapat dikerjakan");
                System.exit(0);
            } else {
                try {

                    if (isAlpha(angka1.substring(angka1.length() - 1))) {
                        // angka 1 
                        variabel = angka1;
                        hasil = operasi(Integer.parseInt(angka3), Integer.parseInt(angka2), operator);
                    } else if (isAlpha(angka2.substring(angka2.length() - 1))) {
                        // angka 2
                        variabel = angka2;
                        hasil = operasi(Integer.parseInt(angka3), Integer.parseInt(angka1), operator);
                    } else {
                        System.err.println("variabel tidak ditemukan, format persamaan : 2q + 1 = 100");
                        System.exit(0);
                    }

                } catch (Exception e) {
                    System.err.println("Maksimal hanya 1 variabel yang dapat dikerjakan");
                    System.exit(0);
                }
            }
            // mencari koefisien variabel 
            int koef = 0;
            int len_variabel = variabel.length();
            String nama_variabel = variabel.substring(len_variabel - 1);
            if (len_variabel == 1) {
                koef = 1;
            } else {
                koef = Integer.parseInt(variabel.replace(nama_variabel, ""));
            }

            double nilai = (hasil * 1.0) / koef;

            System.out.println("\n>>>\t" + persamaan);
            System.out.println(">>>\t" + variabel + "=" + hasil);
            System.out.println(">>>\t" + nama_variabel + "=" + hasil + "/" + koef);
            System.out.println(">>>\t" + nama_variabel + "=" + nilai);
            System.out.println("\n>>>\t" + persamaan);
            System.out.println(">>>\t" + angka1.replace(nama_variabel, "(" + nilai + ")") + operator + angka2.replace(nama_variabel, "(" + nilai + ")") + "=" + angka3);
        }
        return data;
    }

    static boolean isAlphaNum(String name) {
        return name.matches("^[a-zA-Z0-9]+^");
    }

    static boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    static int operasi(int angka1, int angka2, String operator) {
        int hasil = 0;
        switch (operator) {
            case "+":
                hasil = angka1 - angka2;
                break;
            case "-":
                hasil = angka1 + angka2;
                break;
            case "*":
                hasil = angka1 / angka2;
                break;
            case "/":
                hasil = angka1 * angka2;
                break;
        }
        return hasil;
    }

}
