package Anotacoes.OthersAnotations;

public class Anotacoes14 {
    public static void main(String[] args) {
        int x = 20;
        //Object obj = x; //Podemos substituir o Object para uma wrapperClass equivalente
        Integer obj = x; //wrapperClass de int é Integer
        System.out.println(obj);
        System.out.println();
        //int y = (int) obj + 10; //não precisamos fazer mais o cast para (int)
        int y = obj +10;
        System.out.println(y);

        /// Wrapper Class são muito utilizados em Classes pois aceitam o valor Null
        /// ao contrario do tipo primitivo comum. ex. Integer valorDoProduto < esse valor pode ser nulo
        ///  mas >> int valorDoProduto;... precisa recerber um valor, pois seu tipo (int) é primitivo
    }
}
