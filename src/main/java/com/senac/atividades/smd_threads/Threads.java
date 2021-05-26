package com.senac.atividades.smd_threads;

import java.util.Calendar;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class Threads implements Runnable{
    
    private int[] vetor;
    private int inicio;
    private int fim;
    private int constante;
    private String nome;


    public Threads(int[] vetor, int inicio, int fim, int constante, String nome) {
        this.vetor = vetor;
        this.inicio = inicio;
        this.fim = fim;
        this.constante = constante;
        this.nome = nome;
    }

    @Override
    public void run() {
        for(int i = inicio ; i < fim; i++) {
            vetor[i] = vetor[i] * constante;
        }
        String msg = "Final com Threads (" + nome + "): ";
        Hora.getHora(msg);
    }
}
