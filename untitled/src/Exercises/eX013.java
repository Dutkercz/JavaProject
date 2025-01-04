package Exercises;

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
        System.out.println();
        System.out.println("Escolha um numero dentro da matriz: ");

        for (int i = 0; i < linha; i++) {
            System.out.print("\n");
            for (int j = 0; j < coluna ; j++) {
                System.out.print(matrix[i][j] + " ");
            }

        }
        System.out.println("\nTamanho" + matrix.length);

        System.out.println();
        System.out.print(">> ");
        int escolha = scan.nextInt();




        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (escolha == matrix[i][j]){
                    System.out.println("Position: " + i + ","+ j);
                    System.out.println();
                    System.out.println("AAAA : " + j);
                    System.out.println();

                    if (matrix[i][j] > matrix.length ){
                        System.out.println("Esquerda: " + matrix[i][j - 1]);
                    }
                    if (j>0) {
                        System.out.println("Direita: " + matrix[i][j + 1]);
                    }
                    if (i >  0) {
                        System.out.println("Acima: " + matrix[i - 1][j]);
                    }
                    if (matrix[i + 1][j]-1 > 0){
                        System.out.println("Abaixo: " + matrix[i + 1][j]);
                    }
                }
            }

        }
    }
}
