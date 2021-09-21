package com.company.Exercicio5;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Cliente {

    int id;
    String nome;
    String cpf;
    String endereco;
    String email;
    String telefone;

    public Cliente(String nome, String cpf, String endereco, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public static boolean nomeValido(String nome){
        boolean valido;
        if (nome.length() >= 3 && nome.length() <= 50){
            valido = true;
        }else {
            valido = false;
        }
        return valido;
    }

    public static boolean cpfValido(String cpf) throws ParseException {
        ValidaCpf validaCpf = new ValidaCpf();
       return validaCpf.isCPF(cpf);

    }

//    public static boolean emailValido(String email){
//
//
//    }
//
//    public static boolean telefoneValido(String telefone){
//
//    }
//
//

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
