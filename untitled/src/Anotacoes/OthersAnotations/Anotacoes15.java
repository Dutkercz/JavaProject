package Anotacoes.OthersAnotations;

public class Anotacoes15 {
    public static void main(String[] args) {
        /* laco FOREACH

        FOR (Tipo apelido : colecao){
            comando <1>
            coamndo <2>


         */

        String [] vect = new String[] {"Maria", "Bob", "Mark"};

        for (String nomes : vect){ // String = Tipo/Classe do vetor === nomes = apelido, pode ser qualquer nome
                                    // e vect é o nome da variavel do meu vetor
            System.out.println(nomes);
            //chamo cada um dos elementos pelo apelido, mesmo efeito de SOUT ( VECT[I] )
            
        }

    }
}
