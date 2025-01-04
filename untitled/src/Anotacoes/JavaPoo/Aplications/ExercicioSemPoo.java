package Anotacoes.JavaPoo.Aplications;

import java.util.Scanner;

public class ExercicioSemPoo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Measures triangle X");
        double xA = scan.nextDouble();
        double xB = scan.nextDouble();
        double xC = scan.nextDouble();

        double pX = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(pX * (pX-xA) * (pX - xB) * (pX - xC));

        System.out.println("Measures triangle Y");
        double yA = scan.nextDouble();
        double yB = scan.nextDouble();
        double yC = scan.nextDouble();

        double pY = (xA + xB + xC) / 2;
        double areaY = Math.sqrt(pY * (pY-yA) * (pY - yB) * (pY - yC));

        System.out.printf("Triangle X area %.4f \n", areaX);
        System.out.println();
        System.out.printf("Triangle Y area %.4f \n", areaY);

        if (areaY > areaX){
            System.out.println("Largest area is Area Y > " +areaY);

        }else {
            System.out.println("Largest area is Area Y > " +areaX);
        }


    }
}
