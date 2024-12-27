package AplicationThree.Entites;

import AplicationThree.Enum.WorkerLevel;

import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContracts> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContracts> getContracts() {
        return contracts;
    }


    public void addContract (HourContracts newContract){
        contracts.add(newContract);
    }

    public void removeContract (HourContracts contractToRemove){
        contracts.remove(contractToRemove);
    }

    public double income (int month, int year){
        double sum = 0;

        Calendar cal = Calendar.getInstance();

        for (HourContracts cont : contracts){
            cal.setTime(cont.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_mount = 1 + cal.get(Calendar.MONTH);//Mes do Calendar começa com 0.

            if (c_mount == month && c_year == year) {
                sum += cont.totalValue();
            }
        }
        sum+=baseSalary;
        return sum;
    }

    @Override
    public String toString() {
        return "Worker:\n" +
                "Name = " + name +
                "\nLevel = " + level +
                " //  BaseSalary = " + baseSalary +
                "Contracts: " + contracts;
    }
}
