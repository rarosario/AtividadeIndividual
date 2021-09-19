package com.company.Exercicio1;


import java.util.ArrayList;


public class Agenda {
     ArrayList<Pessoa> listaPessoa = new ArrayList<>();

    public void armazenarPessoa(Pessoa pessoa) {
        this.listaPessoa.add(pessoa);
    }

    public void removerPessoa(String nome) {
        for (int rem = 0; rem < listaPessoa.size(); rem++) {
            Pessoa pessoa = listaPessoa.get(rem);
            if (pessoa.getNome().equals(nome)) {
                listaPessoa.remove(pessoa);
            }
        }
    }

    public int buscarPessoa(String nome) {
        int posicao = 0;
        for (int pos = 0; pos < listaPessoa.size(); pos++) {
            Pessoa pessoa = listaPessoa.get(pos);
            if (pessoa.getNome() == nome) {
                posicao = pos;
            }
        }
        return posicao;
    }

    public void exibirTodaAgenda(){
        for (Pessoa listaPessoa: listaPessoa) {
            System.out.println(listaPessoa);
        }
    }

    public void exibirPessoa(int index){
        System.out.println(listaPessoa.get(index));
    }

}
