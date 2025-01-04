package Exercises.Ex02;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Student aluno1 = new Student();

        System.out.print("Nome do aluno: ");
        aluno1.setName(scan.nextLine());

        System.out.print("Nota 1º trimestre: ");
        aluno1.setGrade1(scan.nextDouble());

        System.out.print("Nota 2º trimestre: ");
        aluno1.setGrade2(scan.nextDouble());

        System.out.print("Nota 3º trimestre: ");
        aluno1.setGrade3(scan.nextDouble());


        System.out.println(aluno1);
        System.out.println(aluno1.verifyApprobation());




    }
}
