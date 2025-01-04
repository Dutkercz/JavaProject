package Exercises;

import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        //Descobrir se A e B são multiplos

        Scanner scan = new Scanner(System.in);

        int a,b;
        System.out.println("Digite o valor de A: ");
        a = scan.nextInt();
        System.out.println("Digite o valor de B: ");
        b = scan.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("A e B são multiplos");
        }else {
            System.out.println("A e B Não são multiplos");
        }
    }
}
