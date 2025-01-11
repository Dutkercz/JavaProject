package Exercises.Ex12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {

        //C:\Users\Dell\Desktop\script-python\Java\ex.txt
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Employee> list = new ArrayList<>();
        System.out.println("Enter archive path: ");
        String path = scan.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            String line = bufferedReader.readLine();
            while (line != null){
                String[] vect = line.split(",");
                list.add(new Employee(vect[0], vect[1], Double.parseDouble(vect[2]) ));

                line = bufferedReader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("Error. File not found.");
        }catch (IOException e){
            System.out.println("Unexpected error." + e.getMessage());
        }
        System.out.println("Enter salary filter: ");
        double criteria = scan.nextDouble();

        List<String> salaryAboveFilter = list.stream()
                .filter(x -> x.getSalary() > criteria)
                .map(x -> x.getEmail()).sorted().toList();


        /* double sum = list.stream()
                .filter(x -> x.getName().charAt(0) == 'M')
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);  esta é uma opação mais simplificada da expressão abaixo.*/

        double sum = list.stream()
                .filter(x -> x.getName().charAt(0) == 'M')
                .map(x -> x.getSalary())
                .reduce(0.0, (x, y) -> x+y);

        list.forEach(System.out::println);
        System.out.println("=======================");
        System.out.println("Email above " + criteria);
        salaryAboveFilter.forEach(System.out::println);
        System.out.println("=========================");
        System.out.println("sum of salaries of employees whose name begins with M " + String.format("%.2f", sum));
    }
}
