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
public class Graph {

    private final int VertexMaximum = 20;
    private Vertex[] insertVertex;
    private int[][] insert_adjancent;
    private int count;

    public Graph() {
        insertVertex = new Vertex[VertexMaximum];
        insert_adjancent = new int[VertexMaximum][VertexMaximum];
        count = 0;

        for (int i = 0; i < VertexMaximum; i++) {
            for (int j = 0; j < 10; j++) {
                insert_adjancent[i][j] = 0;
            }
        }
    }

    public void insert_vertex(char a) {
        insertVertex[count++] = new Vertex(a);
    }

    public void insert_edge(int start, int end) {
        insert_adjancent[start][end] = 1;
        insert_adjancent[end][start] = 1;
    }


}
