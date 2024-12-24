package Anotacoes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Anotacoes16 {
    public static void main(String[] args) {

        // o Tipo LIST é um interface, portanto não pode instanciar NOVO OBJETOS, ex List lista = new List();
        //daria erro de compilação, pois mais uma vez LIST É UM INTERFACE, e precisa de uma classe, para instanciar
        // um objeto, ex. List lista = new ArrayList();

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alvaro");
        list.add("Jenifer");
        list.add("Cristian");
        list.add("Marcos");
        list.add("Mateus");
        list.add("Cristiano");
        list.add("Cris");

        //Adicionar novo elemento a lista.
        list.add(2, "Isis"); //coloco a possição, e o que desejo adicionar nela.

        //tamanho da lista
        System.out.println(list.size());

        //Remover elementos
        list.remove("Isis"); // por comparação de valor
        list.remove(1); // ou por possição na lista

        //Remover por PREDICADO ou seja, por determinação de um condição.
        //Como por exemplo remover todos que começarem pela letra C
        //ATENÇÃO ISSO É UMA FUNÇÃO LAMBDA PREDICADO, RETORNA TRUE OU FALSE

        //list.removeIf() ...chamado da função...cont
        //list.removeIf( nome ->   ...coloco um apelido para chamar os elementos...cont
        //list.removeIf( nome -> nome.charAt(0)  ...chamo o apelido com um função, nesse caso, charAt(0)
                                                                    //que siginifca o caracte na posição 0
        //list.removeIf( nome -> nome.charAt(0) == 'M'); passo o parametro que quero achar na posição indicada
                                                            // DETALHE, O PARAMETRO EM ASPAS SIMPLES
        list.removeIf( nome -> nome.charAt(0) == 'M');

        //Achar a posição de um elemento
        System.out.println("Index of Jenifer: " + list.indexOf("Jenifer"));//se o resultado for -1, não existe o parametro passado


        //Filtrar a lista por parametro, nesse caso o parametro é quem começa com C
        //Precisamos fazer uma nova lista. depois chamar a lista antigam com o (varListaAntiga.stream().filter
        //asssim sera capaz de receber um expressão lambda, e podemos usar um predicato dentro do filtro
        //depois usar o ,collect(Collectors.toList()); para transformar novamente em LISTA A NOSSA VARIAVEL

        List<String> resultado = list.stream().filter(nome -> nome.charAt(0) == 'C').collect(Collectors.toList());
        System.out.println(resultado);
        System.out.println("===============================");

        //Escontrar o primeiro elemento que atenda os requisitos do meu predicado
        //criar uma variavel do mesmo tipo da lista
        String primeiroNomeComC = list.stream().filter(nome -> nome.charAt(0) == 'C').findFirst().orElse(null);
        System.out.println(primeiroNomeComC);
        //caso nao tenha, ele retorna Null
        System.out.println("===============================");


        list.add("Maria");
        list.add(1,"Alvaro");
        for (String nome : list ){
            System.out.println("Nome: "+ nome);
        }
    }
}
