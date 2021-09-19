package com.company.Exercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
        Pessoa rafael = new Pessoa("Rafael", "Rua 1", "1111-1111", 30, 1.82);
        Pessoa wesley = new Pessoa("Wesley", "Rua 2", "2222-2222", 30, 1.82);
        Pessoa alessandro = new Pessoa("Alessandro", "Rua 3", "3333-3333", 30, 1.82);
        Pessoa ana = new Pessoa("Ana", "Rua 4", "4444-4444", 30, 1.82);
        Pessoa wagner = new Pessoa("Wagner", "Rua 5", "5555-5555", 30, 1.82);
        Pessoa joice = new Pessoa("Joice", "Rua 6", "6666-6666", 30, 1.82);
        Pessoa mauri = new Pessoa("Mauri", "Rua 7", "7777-7777", 30, 1.82);
        Pessoa kenyo = new Pessoa("Kenyo", "Rua 8", "8888-8888", 30, 1.82);
        Pessoa filipe = new Pessoa("Filipe", "Rua 9", "9999-9999", 30, 1.82);
        Pessoa camila = new Pessoa("Camila", "Rua 10", "1010-1010", 30, 1.82);

        Collections.addAll(listaPessoa, rafael, wesley, wagner, alessandro, ana, joice, mauri, kenyo, filipe, camila);

        Agenda agenda = new Agenda();

        for (Pessoa listaDePessoa: listaPessoa) {
            agenda.armazenarPessoa(listaDePessoa);
    }

        System.out.println("\n--------- Exercicio 1 ----------");
        agenda.exibirTodaAgenda();

        System.out.println("\n------------ Exercicio 2 -----------");
        System.out.println("Removendo Pessoa");
        agenda.removerPessoa("Rafael");


        System.out.println("\n---------- Exercicio 3 ------------");
        System.out.println("Esta na posição numero "+agenda.buscarPessoa("Camila"));

        System.out.println("\n ---------- Exercicio 4 ----------");
        agenda.exibirTodaAgenda();

        System.out.println("\n------------ Exercicio 5 ------------");
        agenda.exibirPessoa(7);

    }
}

