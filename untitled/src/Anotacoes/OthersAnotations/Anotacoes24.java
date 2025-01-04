package Anotacoes.OthersAnotations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Anotacoes24 {
    public static void main(String[] args){

        // TRY WITH RESOURCES
// LEITURA DE ARQUIVOS USANDO ESSE METODO.

        String path = "C:\\Users\\cris_\\in.txt.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
