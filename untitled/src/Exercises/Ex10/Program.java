package Exercises.Ex10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter archive full path ");
        String path = scan.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            Set<User> set = new HashSet<>();


            String line = bufferedReader.readLine(); //ação #1
            while (line != null){
                String[] field = line.split(" ");
                String userName = field[0];
                Date moment = Date.from(Instant.parse(field[1]));

                set.add(new User(userName, moment)); // Set não aceita objetos repitidos.
                //isso se torna muito ultil para contar a quantidade de ocorrencias distintas em um log por exemplo.
                // ou nosso causo, um arquivo que foi inserido em uma lista.

                line = bufferedReader.readLine(); //para repitir a "ação #1" até que retorne um null (arquivo vazio)

            }
            System.out.println("Total user " + set.size());

        }catch (IOException e){
            System.out.println("Invalid enter" + e.getMessage());
        }catch (Exception e){
            System.out.println("Unexpected error." + e.getMessage());
        }


    }
}
