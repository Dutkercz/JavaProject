package Exercicios.Ex06.Methods;

public class Employee {
    private String name;
    private Double salary;
    private Integer id;


    public Employee (String name, double salary, int id){
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public void increaseSalary(Employee id) {
        salary = id.salary *1.1;
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

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "( Employee: "+ name +", Salary: "+ salary +", Id: "+ id +" )\n";


    }
}
