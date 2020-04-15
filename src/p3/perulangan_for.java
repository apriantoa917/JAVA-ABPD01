
package p3;

public class perulangan_for {

    public static void main(String[] args) {
        
        /*
        i = 0 : inisialisasi nilai awal
        i <= 3 : batas / jumlah perulangan
        i++ : pertambahan nilai (iterasi) -> bisa i++ / i--
         */
        
        System.out.println("--- iterasi +1");
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }
        System.out.println("--- iterasi -1");
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("--- iterasi +2");
        for (int i = 1; i <= 10; i+=2) {
            System.out.println(i);
        }
    }

}
