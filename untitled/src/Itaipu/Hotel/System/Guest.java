package Itaipu.Hotel.System;

public class Guest {
    private String name;
    private String city;
    private String phoneNumber;
    private String email;

    private CPF cpf;

    public Guest(String name, String city, String phoneNumber, CPF cpf, String email) {
        this.name = name;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.cpf = cpf;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Hospedagem:" +
                "\n\tNome: " + name+
                "\n\tCpf: " + cpf +
                "\n\tCidade: " + city +
                "\n\tTelefone: " + phoneNumber +
                "\n\tE-mail: " + email;
    }
}
