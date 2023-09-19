package com.atividade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class Testes {
    LinkedList< LinkedList<Integer> > grafo;
    int tamanho_grafo = 7;

    @BeforeEach
    public void criarGrafo(){
        this.grafo = new LinkedList<>();
        for(int i=0; i < this.tamanho_grafo; i++){
            this.grafo.add(new LinkedList<Integer>());
        }

        grafo.get(1).add(2);
        grafo.get(1).add(5);

        grafo.get(2).add(1);
        grafo.get(2).add(3);
        grafo.get(2).add(5);

        grafo.get(3).add(2);
        grafo.get(3).add(4);

        grafo.get(4).add(3);
        grafo.get(4).add(5);
        grafo.get(4).add(6);

        grafo.get(5).add(1);
        grafo.get(5).add(2);
        grafo.get(5).add(4);

        grafo.get(6).add(4);
    }

    @Test
    public void tempo(){
        Solucao s = new Solucao(this.grafo);
        s.dfs_start(1);

        int actual = s.tempo;
        int expected = 11;

        assertEquals(expected, actual);
    }

    @Test
    public void finalizadoVertice6(){
        Solucao s = new Solucao(this.grafo);
        s.dfs_start(1);

        int actual = s.f[6];
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    public void finalizadoVertice1(){
        Solucao s = new Solucao(this.grafo);
        s.dfs_start(1);

        int actual = s.f[1];
        int expected = 11;

        assertEquals(expected, actual);
    }

    @Test
    public void finalizadoVertice0(){
        Solucao s = new Solucao(this.grafo);
        s.dfs_start(1);

        int actual = s.f[0];
        int expected = -2;

        assertEquals(expected, actual);
    }

    @Test
    public void anteVertice5(){
        Solucao s = new Solucao(this.grafo);
        s.dfs_start(1);

        int actual = s.ante[5];
        int expected = 4;

        assertEquals(expected, actual);
    }
}
