package Exercises;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero");
        int numero = sc.nextInt();

        if (numero % 2 == 0 && numero != 0){
            System.out.println("PAR");
        }
        else if (numero == 0) {
            System.out.println("O numero é 0");
        }
        else{
            System.out.println("IMPAR");
        }
    }
}
