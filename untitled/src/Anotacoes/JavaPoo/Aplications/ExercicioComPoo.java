package Anotacoes.JavaPoo.Aplications;

import Anotacoes.JavaPoo.Methods.Triangle;

import java.util.Scanner;

public class ExercicioComPoo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Triangle triangleX = new Triangle();
        Triangle triangleY = new Triangle();

        System.out.println("Input measures to the triangle A; ");
        triangleX.setA(scan.nextDouble());
        triangleX.setB(scan.nextDouble());
        triangleX.setC(scan.nextDouble());

        System.out.println("Input measures to the triangle B; ");
        triangleY.setA(scan.nextDouble());
        triangleY.setB(scan.nextDouble());
        triangleY.setC(scan.nextDouble());

        double areaX = triangleX.calculeArea();
        double areaY = triangleY.calculeArea();

        System.out.println(areaX);
        System.out.println(areaY);

    }
}
