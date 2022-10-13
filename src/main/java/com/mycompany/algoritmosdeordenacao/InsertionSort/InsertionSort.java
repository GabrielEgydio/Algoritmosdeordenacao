/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.algoritmosdeordenacao.InsertionSort;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Gabriel_Egydio
 */
public class InsertionSort {


    public static void main(String[] args) throws IOException {
        Random numero = new Random();
        
        int quantidade = 20000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
         vetor[i] = numero.nextInt();
        }

         long tempoInicial = System.currentTimeMillis();

         insertionSort(vetor);

         long tempoFinal = System.currentTimeMillis();
         
         for(int cont : vetor){
             System.out.println(cont);
         }
         
         System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
         
    }

    public static int[] insertionSort(int[] vetor) {
        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++)
        {
          key = vetor[j];
          for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
          {
             vetor[i + 1] = vetor[i];
           }
            vetor[i + 1] = key;
        }
        return vetor;
    }
}