/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ROG STRIX
 */
public class percabangan_wahana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("usia : ");
        int usia = Integer.parseInt(br.readLine());
        System.out.println("bb : ");
        double bb = Double.parseDouble(br.readLine());
        if(usia > 17 && bb <= 70.00){
            System.out.println("boleh main dong");
        }else{
            System.out.println("jangan yaaaa....");
        }
    }

}
