package com.company.Exercicio5;

import java.text.ParseException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {

        boolean retorno = Cliente.nomeValido("raf");
        System.out.println((retorno==true)?"valido":"não é valido");

        boolean verificaCpf = Cliente.cpfValido("000.000.000-00");
        System.out.println((verificaCpf==true)?"valido" : "não é valido");


    }
}
