package Anotacoes.OthersAnotations;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Anotacoes22 {
    public static void main(String[] args) {


        File file = new File("C:\\Users\\cris_\\in.txt.txt");

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error." + e.getMessage());
        }
    }
}
