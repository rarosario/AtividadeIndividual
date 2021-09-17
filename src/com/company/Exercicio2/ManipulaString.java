package com.company.Exercicio2;

import java.util.Locale;
import java.util.Scanner;


public class ManipulaString {

    public static void main(String[] args) {
        String nome;
        Scanner tecladoReverse = new Scanner(System.in);
        System.out.println("------Reverse");
        System.out.println(" Digite seu nome ? ");
        nome = tecladoReverse.next();
        inverteString(nome);
        palindromo(nome);
    }
        public static void inverteString (String nome){
            String resultado = "";
            for (int x = nome.length() - 1; x >= 0; x--) {
                resultado += nome.charAt(x);
            }
            System.out.println(resultado.toUpperCase(Locale.ROOT));
        }

        public static void palindromo (String nome){

            String palavra;
            String segundaP;
            System.out.println("Digite a Palavra em maiusculo ou minusculo!" );
            Scanner tecladoReverse = new Scanner(System.in);
            palavra = tecladoReverse.next();
            System.out.print("A Palavra: " +palavra);
            segundaP = new StringBuffer(palavra).reverse().toString();
            if (palavra.equals(segundaP)) {
                System.out.println("  é palindromo");
            } else {
                System.out.println(" Não é Palindromo");
            }
        }
    }
