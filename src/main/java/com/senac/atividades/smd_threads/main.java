/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.atividades.smd_threads;

/**
 *
 * @author victor
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        int[] vetor = new int[10000000]; // Criacao do Vetor
        int constante = 120;
        
        // Popula o Vetor
        for(int i = 0; i < vetor.length; i++) {
            int num = (int) (1 + Math.random() * 100);
            vetor[i] = num; 
        }
        
        int[] vetor1 = vetor;
        int[] vetor2 = vetor;

        Hora.getHora("Inicio Sem Threads: ");
        //Faz a Multiplicacao sem threads
        for(int i = 0; i < vetor1.length; i++) {
            vetor1[i] = vetor1[i] * constante;
        }
        Hora.getHora("Final Sem Threads: ");

        System.out.println("\n---------\n");
        
        
        
        Hora.getHora("Inico com Threads: ");

        // Implementando threads        
        int metade = vetor2.length/2;
        Threads thread1 = new Threads(vetor2, 0, metade, constante, "T1");
        Threads thread2 = new Threads(vetor2, metade, vetor2.length, constante, "T2");
        
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        
        t1.start();
        t2.start();
        
        
        /*
        for(int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        */
        
        
        
        
    }
    
}