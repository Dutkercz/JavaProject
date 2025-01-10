package Anotacoes.Stream.Pipelines;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainPipe {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 8, 7, 9, 2, 6);
        System.out.println("Original" + list);
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println("Multiplicado por 10 " + Arrays.toString(st1.toArray()));
        int sum = list.stream().reduce(0, (x, y) -> x + y);// 0 é o inicio da minha soma, se fosse multiplic.
        System.out.println("Sum = "+sum);                                       // teria que ser 1 .

        List<Integer> parEmDobro = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2).toList();
        System.out.println("Pares em dobro" + parEmDobro);
    }
}
