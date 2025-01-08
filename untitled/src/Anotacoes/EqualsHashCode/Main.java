package Anotacoes.EqualsHashCode;

public class Main {
    public static void main(String[] args) {

        Client c1 = new Client("Maria", "@gmail.com");
        Client c2 = new Client("Maria", "@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println("-----------------");

        //se usarmos o seguinte exemplo:
        System.out.println(c1 == c2); // nos restornara um falso, pois esta comparando a refenrencia na memoria.
    }
}
