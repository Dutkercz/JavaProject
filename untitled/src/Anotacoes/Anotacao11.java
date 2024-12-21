package Anotacoes;

public class Anotacao11 {
    public static void main(String[] args) {

        /*Recortando String

        usando o var.split(" ") vai separar a string em pedaços, delimitados por um "espaço"*/
        String frase = "Meu nome é Cristian";

        //Sepramos agora com um array
        String[] fraseSplit = frase.split(" ");

        //Agora adicionamos cada elemento em uma variavel.
        String word1 = fraseSplit[0];
        String word2 = fraseSplit[1];
        String word3 = fraseSplit[2];
        String word4 = fraseSplit[3];

        System.out.println(frase);
        System.out.println();
        System.out.println(fraseSplit[1]);
        System.out.println();
        System.out.println(word1 +"-"+ word2+"-"+word3+"-"+word4);
    }
}
