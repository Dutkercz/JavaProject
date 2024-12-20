package Exercicios;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int cont = 0;


        var higher = max(a, b , c);
        showResult(higher);


        scan.close();
    }
    // funções que precisam retornar um valor a uma variavel,
    //devem declarar o tipo de valor que vai retornar...no seguinte causo, um valor int
    public static int max (int x, int y, int z){
        var maiorAuxiliar = x;
        if (y > maiorAuxiliar) {
            maiorAuxiliar = y;
        } else if (z > maiorAuxiliar) {
            maiorAuxiliar = z;
        }else {
            maiorAuxiliar = x;
        }
        return maiorAuxiliar;
    }


    /* Funções que não precisam retornar nada a uma variavel, são declaradas da seguinte forma
    * usando o public static void */
    public static void showResult(int value){
        System.out.println("Higher value: " + value);
    }


}
