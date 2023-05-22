package br.com.curso.java.basic;

import java.util.Arrays;

public class aula6_vetores {
    public static void main(String[] args) {
        //Arrays
        int[] numeros = new int[5];
        //String[] letras = new String[5];
        String[] letras = {"a", "b", "c", "d", "e"};
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

//        letras[0] = "a";
//        letras[1] = "b";
//        letras[2] = "c";
//        letras[3] = "d";
//        letras[4] = "e";

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));

        int[] n = {1, 2, 3, 4};
        int maior = n[0];
        int menor = n[0];
        int media = 0;

        for (int i = 0; i < n.length; i++) {
            if(n[i] > maior){
                maior = n[i];
            }
            if(n[i] < menor){
                menor = n[i];
            }
            media += n[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/n.length);
    }
}
