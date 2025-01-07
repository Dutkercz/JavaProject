package Anotacoes.OthersAnotations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Anotacoes25 {
    public static void main(String[] args) {

                                //File Writer
        // para criar um arq. ou zerar um existe. usa-se o comando "        new FileWriter(path)
        // para acrescentar a um arq. existente. usa-se >> true no final "  new FileWriter(path, true)


        String[] namesVect = new String[] {"Cris", "Jeni", "Alvaro", "Maria"};
        String pathnew = "C:\\Users\\cris_\\out.txt";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathnew, true))){
            for (String line : namesVect){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
