package Anotacoes.OthersAnotations;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public class Anotacoes18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Instanciando data e hora

        LocalDate d01 = LocalDate.now(); //somente data, sem horario
        LocalDateTime d02 = LocalDateTime.now(); //data e hora local, no causo Brasil.
        Instant d03 = Instant.now(); //hora global GMT, padrão horario de Londres
        LocalDate d04 = parse("2024-12-26");
        LocalDateTime d05 = LocalDateTime.parse("2024-12-26T21:45:22");
        Instant d06 = Instant.parse("2024-12-26T21:51:22Z");
        Instant d07 = Instant.parse("2024-12-26T21:51:22-03:00");


        System.out.println("d01 =" + d01);
        System.out.println("d02 =" + d02);
        System.out.println("d03 =" + d03);
        System.out.println("d04 =" + d04);
        System.out.println("d05 =" + d05);
        System.out.println("d06 =" + d06);
        System.out.println("d07 =" + d07);

        //CONVERTENDO DATA E HORA PARA TEXTO
        DateTimeFormatter date1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d04.format(date1));

        //para formatar o metodo Instant:
         DateTimeFormatter data2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d06 format " + data2.format(d06)); //fez a conta do fuso horario, no causo -3h
        //Nao podemos formatar uma hora no modo INSTANT sem definir um fuso horario.

    }
}
