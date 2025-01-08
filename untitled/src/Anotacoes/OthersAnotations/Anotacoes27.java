package Anotacoes.OthersAnotations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Anotacoes27 {

    //   Set > é na verdade uma interface

    // Para compara usamos o set.contains, mas devemos reescrever o metodo hashCode/Equal na nossa clase,
    // se não a comparação sera feita pelo ponteiro, que aponta o local em memoria do objeto.

    //o TreeSet devemos implemtar o compareTo na classe que instancia o nosso objeto, e implementar o metodo compareTo

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();  // HashSet não garante a ordem dos items.
                                            // TreeSet ordena em ordem crescente ou alfabetica.
                                            // LinkedHashSet mantem a ordem em que os elementos foram inseridos.
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");


        System.out.println(set.contains("Notebook"));
        System.out.println("___________");
        // set.remove("Tablet"); >> remove o tablet da lista.
        set.removeIf(x -> x.length() >= 3 ); // << remove por um predicado.

        for (String p : set) {
            System.out.println(p);
        }

        System.out.println("+++++++++++++++++++++======================+++++++++++++=================");
        System.out.println();
        Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));
        System.out.println();
        System.out.println("Union");
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);

        System.out.println();
        System.out.println("intersection");
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);

        System.out.println();
        System.out.println("difference");
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);

    }
}
