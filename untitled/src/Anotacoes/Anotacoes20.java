package Anotacoes;

import java.time.*;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.parse;

public class Anotacoes20 {
    public static void main(String[] args) {

        //CONTINUANDO COM O ASSUNTO DATA E HORA

        LocalDate d04 = parse("2024-12-26");
        LocalDateTime d05 = LocalDateTime.parse("2024-12-26T21:45:22");

        Instant d06 = Instant.parse("2024-12-27T02:51:22Z");// essa data esta em Londres
        LocalDateTime r1 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); // ao converter muda para a data da maquina.

        System.out.println(d06 +" << Londres");
        System.out.println(r1 + " << Maquina do usuario");

        System.out.println("Dia do d04 >> " + d04.getDayOfMonth());


        // CALCULO DE DATA E HORA
        //DATA E HORA SÃO IMUTAVEIS, PARA TER UM OBJETO COM DATA E HORA DIFERENTES DO ORIGINAL, DEVE SER INSANCIADO
        // UM NOVO OBJETO PARA RECEBER O RESULTADO.

        LocalDate pastWeek = d04.minusDays(7);
        LocalDate nextWeek = d04.plusDays(7);
        System.out.println("DATA ATUAL " + d04 );
        System.out.println("Data 7 dias antes " + pastWeek);
        System.out.println("Data 7 dias a frente " + nextWeek);

        //com o Instant nao tem o //.minus nem o //.plus

        Instant instantNextWeek = d06.minus(7, ChronoUnit.DAYS);
        Instant instantPastWeek = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("Instant semana passada "+ instantPastWeek );
        System.out.println("Instant proxima semana " + instantNextWeek);

        //Duração

        Duration t1 = Duration.between(pastWeek.atStartOfDay() , d04.atStartOfDay());

        System.out.println("T1 dias " + t1.toDays()); // para calcular os dias anteriores, inverter as variaveis.

    }
}
