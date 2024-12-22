package Anotacoes;

import java.util.Arrays;
import java.util.Scanner;

public class Anotacoes13 {
    public static void main(String[] args) {

        /// VETORES

        Scanner scan = new Scanner(System.in);
        double soma = 0;
        double average = 0;


        System.out.println("Nº produtos: ");
        int numeroProdutos = scan.nextInt();

        Anotacoes13[] vector = new Anotacoes13[numeroProdutos];


        for (int i = 0; i < vector.length; i++) {
            scan.nextLine();

            System.out.println("Product name:");
            String nome = scan.nextLine();

            System.out.println("Price:");
            int valor = scan.nextInt();

            vector[i] = new Anotacoes13(nome, valor);
            soma += valor;
            
        }
        average = soma / vector.length;
        System.out.println(Arrays.toString(vector));
        System.out.println(average);
        System.out.println(vector[1].getName());
        System.out.println(vector[0].getValor());




    }
    String name;
    double valor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Anotacoes13(String name, double valor) {
        this.name = name;
        this.valor = valor;

    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", valor=" + valor +
                '}';
    }
}
