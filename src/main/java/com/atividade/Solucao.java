package com.atividade;

import java.util.LinkedList;

public class Solucao {
    private static final int BRANCO = -1;
    private static final int CINZA = 0;
    private static final int PRETO = 1;

    public int[] ante;
    public int[] i;
    public int[] f;
    public int[] cor;
    public int tempo;

    private LinkedList<LinkedList<Integer>> grafo;
    //Lucas felinto
    public Solucao(LinkedList<LinkedList<Integer>> grafo) {
        this.grafo = grafo;
        int numVertices = grafo.size();
        ante = new int[numVertices];
        i = new int[numVertices];
        f = new int[numVertices];
        cor = new int[numVertices];
        tempo = 0;
    }

    public void dfs_start(int s) {
        tempo = -1;
        for (int u = 0; u < grafo.size(); u++) {
            f[u]= -2;
            cor[u] = BRANCO;
            ante[u] = -2;
        }
        dfs_visit(s);
    }

    public void dfs_visit(int u) {
        tempo++;
        i[u] = tempo;
        cor[u] = CINZA;
        
        LinkedList<Integer> vizinhos = grafo.get(u);
        for (int v : vizinhos) {
            if (cor[v] == BRANCO) {
                ante[v] = u;
                dfs_visit(v);
            }
        }
        
        cor[u] = PRETO;
        tempo++;
        f[u] = tempo;
    }
}

