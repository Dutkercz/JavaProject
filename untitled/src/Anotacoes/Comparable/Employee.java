package Anotacoes.Comparable;

public class Employee implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee other) {
        return salary.compareTo(other.getSalary()); // ordena em ordem crescente.
        // para ordenar em ordem decrescente, adicionamos  " - " ao inicio da linha de codigo.
        // ex> -salary.compareTo(other.getSalary());  (Funciona com os nomes tambem)
    }
}
