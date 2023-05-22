package br.com.curso.java.basic;

public class aula7_funcoes {
    public static void main(String[] args) {
        //funcoes
        String nome = "João";
        saudacao(nome);
        System.out.println(soma(1, 2));;
    }

    public static void saudacao(String nome){
        System.out.println(nome);
    }

    public static int soma(int a, int b){
        return a + b;
    }
}
