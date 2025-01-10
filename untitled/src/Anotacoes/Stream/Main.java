package Anotacoes.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(3, 6, 4, 7, 2, 1, 8);
        Stream<Integer> stream = integers.stream().map(x -> x * 10 );
        System.out.println(Arrays.toString(stream.toArray()));

        Stream<String> stringStream = Stream.of("Cristian", "Alvaro", "Jenifer", "Maria");
        System.out.println("Names: " + Arrays.toString(stringStream.toArray()));

        Stream<Integer> stream1 = Stream.iterate(0, x -> x + 2);
        System.out.println("Numeros de 2 em 2" + Arrays.toString(stream1.limit(100).toArray()));

        Stream<Long> streamFibonacci = Stream.iterate(new Long[]{0L, 1L}, x-> new Long[] {x[1], x[0]+x[1]}).map(p -> p[0]);
        System.out.println("Fibonacci" + Arrays.toString(streamFibonacci.limit(50).toArray()));
   }
}
