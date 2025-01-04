package Exercises;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        //Calcular a duração de um jogo

        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.println("Que horas começou o jogo: ");
        int horaInicial = sc.nextInt();
        System.out.println("Hora final da partida: ");
        int horaFinal = sc.nextInt();


        if (horaFinal > 24 || horaInicial > 24){
            System.out.println("Formato de hora inválido");
        }
        else if (horaFinal > horaInicial ){
            total = horaFinal - horaInicial;
            System.out.println("O jogo durou " + total + " horas");
        } else if (horaFinal < horaInicial) {
            horaInicial = 24 - horaInicial;
            total = horaFinal + horaInicial;
            System.out.println("O jogo durou "+ total + " horas");
        }
        else {
            System.out.println("O jogo durou 24 horas.");

        }
    }
}
