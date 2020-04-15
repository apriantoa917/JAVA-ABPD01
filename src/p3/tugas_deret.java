package p3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tugas_deret {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukan angka : ");
        int loop = Integer.parseInt(br.readLine());
        
        // dengan for
        System.out.println("for");
        for (int i = 1; i <= loop; i++) {
            if (i == loop) {
                System.out.println(i);
            } else {
                System.out.print(i + ",");
            }

        }
        
        // dengan while
        System.out.println("\nwhile");
        int i = 1;
        while (i <= loop) {
            if (i == loop) {
                System.out.println(i);
            } else {
                System.out.print(i + ",");
            }
            i++;
        }
        
        // dengan do while
        System.out.println("\ndo while");
        i = 1;
        do {
            if (i == loop) {
                System.out.println(i);
            } else {
                System.out.print(i + ",");
            }
            i++;
        } while (i <= loop);

    }

}
