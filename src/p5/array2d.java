/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p5;

/**
 *
 * @author ROG STRIX
 */
public class array2d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String data[][] = new String[2][2]; //[baris][kolom]

        data[0][0] = "A";
        data[0][1] = "B";
        data[1][0] = "C";
        data[1][1] = "D";
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println("");
        }

    }

}
