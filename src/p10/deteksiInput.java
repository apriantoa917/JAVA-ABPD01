/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROG STRIX
 */
public class deteksiInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Masukan suatu kata\n>>>");
        String inputan = (br.readLine());
        
        int kapital = 0, kata = 0;
        for (String temp : inputan.split("")) {
            if(temp.equals(" ")){
                kata+=1;
//                if(inputan.indexOf(temp)==0){
//                    // spasi di depan kalimat
//                }else{
//                    
//                }
            }
            String temp_kapital = temp.toUpperCase();
            if(temp.equals(temp_kapital) && !temp.equals(" ")){
                // kapital
                kapital+=1;
            }
        }
//        if(kata!=0){
//            kata+=1;
//        }
        System.out.println("Jumlah huruf : "+inputan.replace(" ","").length());
        System.out.println("Jumlah kata : "+kata);
        System.out.println("Jumlah huruf kapital : "+kapital);
        
    }
    
}
