package Anotacoes.Comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //COMPARABLE

        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\in.txt.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();

            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee i : list) {
                System.out.println(i.getName() + " " + i.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}
