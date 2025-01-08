package Anotacoes.OthersAnotations;

import java.util.ArrayList;
import java.util.List;

public class Anotacoes26 {
    public static void main(String[] args) {

        // COVARIÂCIA - PRINCÍPIO GET/PUT
        //A LISTA COM CURINGA, PODE ACESSAR UMA POSIÇÃO DA LISTA QUE RECEBEU, MAS NAO PODE ADICIONAR ITEM,
        //POSSIBILIDADE DE INCOMPATIBLIDADE
        // GET > OK
        // PUT > ERROR


        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.getFirst();
        System.out.println(list.getFirst()+" ou " + x);

        //list.add(20); << ERROR


        /// TEMOS O CONTRARIO TAMBEM
        // QUANDO DECLARAMOS UMA LISTA QUE SEJA <? SUPER NUMBER>
        //ESSA PODE ADICIONAR QUALQUER TIPO QUE SEJA NUMBER, OU PAI DE NUMBER... NO CAUSO OBJECT
        //PORTATANTO ELA ACEITA STRING, INT, DOUBLE ...ETC
        // POREM NÃO É POSSIVEL ACESSAR SUAS POSIÇÕES.
        //EX;

        List<Object> myObj = new ArrayList<>();
        myObj.add("Maria");
        myObj.add("Alvaro");
        //agora vem o pulo do gato
        //a proxima lista é coringa, pode aceitar qualquer objeto do tipo declarado, ou super a ela.

        List<? super Number> myNumbers = myObj;

        // Number x = myNumbers.getFirst(); << erro de compilação

        // GET > ERROR
        // PUT > OK


    }
}
