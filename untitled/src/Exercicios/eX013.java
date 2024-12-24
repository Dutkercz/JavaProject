package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class eX013 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o numero de linhas");
        int linha = scan.nextInt();
        System.out.println("Digite o numero de colunas:");
        int coluna = scan.nextInt();

        int[][] matrix = new int[linha][coluna];

        for (int i = 0; i < linha ; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.println("Digite um numero para a posição: "+ i + " X "+ j);
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Escolha um numero dentro da matriz: ");

        for (int i = 0; i < linha; i++) {
            System.out.print("\n");
            for (int j = 0; j < coluna ; j++) {
                System.out.print(matrix[i][j] + " ");
            }

        }

        int escolha = scan.nextInt();

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (escolha == matrix[i][j]){
                    System.out.println("Esquerda" +matrix[i-1][j]);
                    System.out.println("Direita" + matrix[i+1][j]);
                    System.out.println("Acima" + matrix[i][j-1]);
                    System.out.println("Abaixo" + matrix[i][j+1]);
                }
            }

        }
    }
}
