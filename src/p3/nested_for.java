/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

/**
 *
 * @author ROG STRIX
 */
public class nested_for {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1; i <= 3; i++) { // perulangan untuk baris (menurun)
            for (int j = 1; j <= 3; j++) { // perulangan untuk kolom (mendatar)
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

}
