package Anotacoes.OthersAnotations;

public class Anotacao04 {
    public static void main(String[] args) {

        System.out.println(Math.abs(-5));; // Math.abs tranforma num em POSITIVO
        System.out.println(Math.sqrt(25)); //calcula raiz quandrada
        System.out.println(Math.pow(5,3)); // calcula a potencia do 1º numero, pelo 2º (5x5x5)


        System.out.println("Bhaskara");
        var a = 3;
        var b = 2;
        var c = 1;
        double x;
        var delta = Math.pow(b,2) - 4 * a * c;
        var x1 = (-b + Math.sqrt(delta) / (2 * a));
        var x2 = (-b - Math.sqrt(delta) / (2 * a));


    }
}
