package Anotacoes.EqualsHashCode;

public class AnotacoesEqualsHashCode {
    public static void main(String[] args) {

        // EQUALS E HASHcODE
        // equals > lento, mas resultado 100%
        // hashCode > rapido, mas um chance minima de da um falso positivo.

        String a = "Maria";
        String b = "Alvaro";

        System.out.println(a.equals(b));

        // O hashCode gera um código para o dado inserido, se os dados forem iguais, os codigos devem ser iguais.
        // Existe um chance muito pequena de dois dados diferentes, gerarem um hashCode igual.
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
