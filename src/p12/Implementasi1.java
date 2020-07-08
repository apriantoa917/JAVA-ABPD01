/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p12;

/**
 *
 * @author ROG STRIX
 */
public class Implementasi1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Graph latihan = new Graph();

        // membuat vertex untuk graph atau simpul
        latihan.insert_vertex('A');
        latihan.insert_vertex('B');
        latihan.insert_vertex('C');
        latihan.insert_vertex('D');
        latihan.insert_vertex('E');
        latihan.insert_vertex('F');

        // membuat lintasan antar vertex
        latihan.insert_edge(0, 1); // index AB
        latihan.insert_edge(0, 2); // index AC
        latihan.insert_edge(0, 3); // index AD
        latihan.insert_edge(1, 3); // index BD
        latihan.insert_edge(1, 4); // index BE
        latihan.insert_edge(2, 5); // index CF
        latihan.insert_edge(3, 5); // index DF
        latihan.insert_edge(4, 5); // index EF

    }

}
