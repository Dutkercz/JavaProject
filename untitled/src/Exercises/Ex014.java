package Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter archive path: ");
        String path = scanner.nextLine();
        Map<String, Integer> mapList = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();


            while (line != null){

                String[] vect = line.split(",");
                int votosAux = Integer.parseInt(vect[1]);
                String nome = vect[0];

                if (mapList.containsKey(nome)) {
                    int votesSoFar = mapList.get(nome);
                    mapList.put(nome, votosAux + votesSoFar);
                }
                else {
                    mapList.put(nome, votosAux);
                }

                line = br.readLine();


                }
                for (String c : mapList.keySet()) {
                    System.out.println(c +" "+ mapList.get(c));

            }

        }catch (FileNotFoundException e){
            System.out.println("Archive not found;");
        }catch (IOException e){
            System.out.println("Error");
        }



    }
}
