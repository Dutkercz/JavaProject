package Exercicios.Ex04.Pessoa;

public class Pessoa {

    private String name;
    private double height;
    private int age;

    public Pessoa(String name, int age, double eighth) {
        this.name = name;
        this.age = age;
        this.height = eighth;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                " Age: " + getAge() +
                " Eight: " + getHeight()+"\n";
    }
}
