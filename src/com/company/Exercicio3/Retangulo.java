package com.company.Exercicio3;

public class Retangulo {

    public static void main(String[] args) {

        calculaArea(4,5);

        calculaPerimetro(10,2);

        double areaLajota = 0.45 * 0.45;
        double areaTotal = 25;
        quantidadePiso(areaLajota, areaTotal);

        double comprimentoLajota = 0.10;
        double perimetro = 24;
        quatidadeRodape(comprimentoLajota,perimetro);

    }

    public static void calculaArea(double ladoA, double ladoB){
        double area;
        area = ladoA * ladoB;
        System.out.println("A área total é : "+ area);
    }

    public static void calculaPerimetro(double ladoA, double ladoB){
        double perimetro;
        perimetro = ladoA * 2 + ladoB * 2;;
        System.out.println("O perímetro é de : "+ perimetro);
    }

    public static void quantidadePiso(double areaLajota, double areaTotal){
        double quantidade;
        quantidade = areaTotal / areaLajota;
        System.out.println("A quantidade necessaria de piso é : " + quantidade);
    }

    public static void quatidadeRodape(double comprimentoLajota , double perimetro){
        double Rodapes = perimetro*comprimentoLajota;
        System.out.println("A quantidades necessaria de rodapés em metros é : " + Rodapes);
    }
}