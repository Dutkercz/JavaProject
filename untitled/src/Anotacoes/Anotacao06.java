package Anotacoes;

import java.util.Scanner;

public class Anotacao06 {
    public static void main(String[] args) {
        // Exemplo de da Switch - case
        // Logo apos temos um exemplo de condição ternária
        // var xyz = (zxy > 0) ? "Maior que 0" : "Menor que 0"
        // lendo: var xyz = a variavel é maior que 0? se TRUE ou se FALSE


        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha um dia da semana, 1 - Domingo...7 - Sabado");
        int x = scan.nextInt();
        String dia = "";

        switch(x)
        {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "dia da semana inválido";
                break;
        }
        System.out.println("O dia da semana é: " + dia);

        //Utilizando uma expressão ternaria

        String parImpar =  (x % 2 == 0) ? "par" : "impar";

        System.out.println("O dia da semana é "+ parImpar);

    }
}
