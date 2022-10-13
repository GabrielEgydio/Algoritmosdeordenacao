/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.algoritmosdeordenacao.MergeSort;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Gabriel_Egydio
 */
public class MergeSort {
    
    public static void main(String[] args) throws IOException {
        Random numero = new Random();
        
        int quantidade = 20000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
         vetor[i] = numero.nextInt();
        }

         long tempoInicial = System.currentTimeMillis();

         mergeSort(vetor.length, vetor);

         long tempoFinal = System.currentTimeMillis();
         
         for(int cont : vetor){
             System.out.println(cont);
         }
         
         System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");
         
    }   
      

  private static void mergeSort(int tamanho, int[] vetor) {
    int elementos = 1;
    int inicio, meio, fim;
    
    while(elementos < tamanho) {
      inicio = 0;
      
      while(inicio + elementos < tamanho) {
        meio = inicio + elementos;
        fim = inicio + 2 * elementos;
        
        if(fim > tamanho)
          fim = tamanho;
        
        intercala(vetor, inicio, meio, fim);
        
        inicio = fim;
      }
      
      elementos = elementos * 2;
    }
  }
    private static void intercala(int[] vetor, int inicio, int meio, int fim) {
    int novoVetor[] = new int[fim - inicio];
    int i = inicio;
    int m = meio;
    int pos = 0;
    
    while(i < meio && m < fim) {
      if(vetor[i] <= vetor[m]) {
        novoVetor[pos] = vetor[i];
        pos = pos + 1;
        i = i + 1;
      } else {
        novoVetor[pos] = vetor[m];
        pos = pos + 1;
        m = m + 1;
      }
    }
    
    while(i < meio) {
      novoVetor[pos] = vetor[i];
      pos = pos + 1;
      i = i + 1;
    }
    
    while(m < fim) {
      novoVetor[pos] = vetor[m];
      pos = pos + 1;
      m = m + 1;
    }

    for(pos = 0, i = inicio; i < fim; i++, pos++) {
      vetor[i] = novoVetor[pos];
    }
  }
}